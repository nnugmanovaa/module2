package project2;

import project2.entities.items.*;
import project2.entities.users.Librarian;
import project2.entities.users.LibraryMember;
import project2.entities.users.User;
import project2.enums.ItemType;
import project2.enums.MembershipStatus;
import project2.enums.Role;
import project2.utils.BorrowableItem;
import project2.utils.PasswordValidation;

import java.io.*;
import java.util.*;

public class Menu {
    private static List<LibraryMember> libraryMembers = new ArrayList<>();
    private static List<Librarian> librarians = new ArrayList<>();
    private static List<LibraryItem> allItems = new ArrayList<>();

    private static List<Book> books = new ArrayList<>();

    private static List<Dvd> dvds = new ArrayList<>();

    private static List<Magazine> magazines = new ArrayList<>();
    private static List<RareBook> rareBooks = new ArrayList<>();

    private static User currentUser;

    private static List<User> users = new ArrayList<>();

    public static Scanner scanner = new Scanner(System.in);

    private static final String USERS_PATH = "/Users/aruzhan/Desktop/javaproj/Lesson0/src/project2/users.txt";

    private static final String ITEMS_PATH = "/Users/aruzhan/Desktop/javaproj/Lesson0/src/project2/items.txt";


    public static void start() {
        try {
            syncAllLibraryItems();
            syncUsers();

            System.out.println("Welcome on books.com! ");
            System.out.printf("Вы хотите зарег(1) или войти(2)");
            int action = scanner.nextInt();
            //этап регистрации в систему
            startActions(action);

            switch (currentUser.getRole()) {
                case LIBRARIAN: {
                    System.out.println("You have authorized success!");
                    actionsForLibrarian();
                    break;
                }
                case MEMBER: {
                    System.out.println("You have authorized success!");
                    actionsForMember();
                    break;
                }
                default: {
                    System.out.println("unkbown user");
                    break;
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void actionsForLibrarian() {
        System.out.println("Librarian Menu:");
        String memberText = " 1.List Items \n 2.Get Profile Info \n 3.List Users \n " +
                "4.Deactivate user \n 5.Activate user \n 6.List Borrowed Items \n 7.Search Items by Type \n 8.Create  user" +
                "\n 9.Remove user \n 10.Add Item \n 11.Remove Item \n 12.Logout";
        boolean logout = false;
        while (!logout) {
            System.out.println(memberText);
            System.out.println("Please enter the number of action that you want to choose");
            int act = scanner.nextInt();
            Librarian librarian = (Librarian) currentUser;

            switch (act) {
                case 1: {
                    System.out.println(allItems);
                    break;
                }
                case 2: {
                    librarian.getInformationAboutProfile();
                    break;
                }
                case 3: {
                    System.out.println(libraryMembers.toString());
                    break;
                }
                case 4: {//deactivate user
                    System.out.println("Choose user that you want to diactivate, and enter id ");
                    System.out.println(libraryMembers.toString());
                    int userId = scanner.nextInt();

                    for (LibraryMember libraryMember : libraryMembers) {
                        if (libraryMember.getId() == userId && libraryMember.isActive()) {
                            libraryMember.setAvtive(false);
                            System.out.println("You deactivate user successfully");
                        }
                    }

                    desirialize(usersToString(), USERS_PATH);
                    break;
                }
                case 5: {
                    System.out.println("Choose user that you want to activate, and enter id ");
                    System.out.println(libraryMembers.toString());
                    int userId = scanner.nextInt();

                    for (LibraryMember libraryMember : libraryMembers) {
                        if (libraryMember.getId() == userId && !libraryMember.isActive()) {
                            libraryMember.setAvtive(true);
                            System.out.println("You activated user successfully");
                        }
                    }

                    desirialize(usersToString(), USERS_PATH);
                    break;
                }
                case 6: {
                    for (LibraryMember libraryMember : libraryMembers) {
                        if (Objects.nonNull(libraryMember.getBorrowableItems())) {
                            System.out.printf("User login: %s \nItems that user borrowed:  %s", libraryMember.getLogin(), libraryMember.getBorrowableItems().toString());
                        }
                    }
                    break;
                }
                case 7: {
                    System.out.println("Please enter the category type of the items taht you want to see");
                    String categoryType = scanner.next();
                    if (ItemType.BOOK.name().equalsIgnoreCase(categoryType)) {
                        System.out.println(books.toString());
                    } else if (ItemType.DVD.name().equalsIgnoreCase(categoryType)) {
                        System.out.println(dvds.toString());
                    } else if ((ItemType.MAGAZINE.name().equalsIgnoreCase(categoryType))) {
                        System.out.println(magazines.toString());
                    } else if (categoryType.equalsIgnoreCase("all")) {
                        System.out.println(allItems.toString());
                    } else {
                        System.out.println(books.toString());
                        System.out.println(magazines.toString());
                    }
                    break;
                }
                case 8: { //create user (Member)
                    String[] data = new String[9];
                    createUser(Role.MEMBER, data);
                    break;
                }
                case 9: {
                    System.out.println("Please enter the user id to delete the user:");
                    System.out.println(users.toString());
                    int userId = scanner.nextInt();

                    for (User user : users) {
                        if (user.getId() == userId) {
                            users.remove(user);
                            System.out.println("You removed user successfully");
                            desirialize(usersToString(), USERS_PATH);
                            break;
                        }
                    }
                    break;
                }
                case 10: { //add item
                    System.out.println("Please write the category type that you want to cerate");
                    String itemType = scanner.next();
                    if (ItemType.BOOK.name().equalsIgnoreCase(itemType)) {
                        createItem(ItemType.BOOK, new String[7]);
                    } else if (ItemType.MAGAZINE.name().equalsIgnoreCase(itemType)) {
                        createItem(ItemType.MAGAZINE, new String[6]);

                    } else if (ItemType.DVD.name().equalsIgnoreCase(itemType)) {
                        createItem(ItemType.DVD, new String[5]);
                    } else if (ItemType.RAREBOOK.name().equalsIgnoreCase(itemType)) {
                        createItem(ItemType.RAREBOOK, new String[8]);
                    } else {
                        System.out.println("There is no such type that you want to create");
                    }
                    break;

                }
                case 11: { //remove item
                    System.out.println("Please enter the item id that you want to delete");
                    System.out.println(allItems.toString());
                    int itemId = scanner.nextInt();

                    for (LibraryItem libraryItem : allItems) {
                        if (libraryItem.getId() == itemId) {
                            allItems.remove(libraryItem);
                            System.out.println("You deleted the item successfully");
                            desirialize(itemsToString(), ITEMS_PATH);
                            break;
                        }
                    }
                    break;

                }
                default:
                    logout = true;
                    break;
            }
        }
    }

    private static void actionsForMember() {
        System.out.println("Member Menu:");
        String memberText = "1.List Items \n 2.Borrow Item \n 3.Search Items by type \n " +
                "4.List borrowed Items \n 5.Get profile info \n 6.Return Item \n 7.Logout";
        boolean logout = false;
        int act;
        while (!logout) {
            System.out.println(memberText);
            System.out.println("Please enter the number of action that you want to choose");
            act = scanner.nextInt();
            ;
            LibraryMember member = (LibraryMember) currentUser;
            List<BorrowableItem> currentItems = new ArrayList<>();
            if (Objects.nonNull(member.getBorrowableItems())) {
                currentItems.addAll(member.getBorrowableItems());
            }

            switch (act) {
                case 1: {
                    listItems();
                    break;
                }

                case 2: {
                    System.out.println("Please write an item id to borrow the item");
                    act = scanner.nextInt();
                    boolean sucessed = false;
                    if (member.getMembershipStatus().getBorrowLimit() == currentItems.size()) {
                        System.out.println("You reached the limit");
                        break;
                    }

                    for (LibraryItem lb : allItems) {

                        if (lb.getId() == act) {
                            if (lb.isAvailable()) {
                                if (ItemType.MAGAZINE.equals(lb.getItemType())) {
                                    Magazine magazine = (Magazine) lb;
                                    magazine.setAvailable(false);
                                    magazines.add(magazine);
                                    currentItems.add(magazine);
                                    sucessed = true;
                                } else if (ItemType.BOOK.equals(lb.getItemType())) {
                                    Book book = (Book) lb;
                                    book.setAvailable(false);
                                    currentItems.add(book);
                                    sucessed = true;
                                } else if(ItemType.DVD.equals(lb.getItemType())){
                                    Dvd dvd = (Dvd) lb;
                                    dvd.setAvailable(false);
                                    currentItems.add(dvd);
                                    sucessed = true;
                                } else if(ItemType.RAREBOOK.equals(lb.getItemType())){
                                    System.out.println("Sorry, you can't take RareBook");
                                }
                            } else {
                                System.out.println("Sorry, this book is nnot availbale now!");
                                break;
                            }
                        }
                    }

                    if (sucessed) {
                        member.setBorrowableItems(currentItems);


                        desirialize(usersToString(), USERS_PATH);
                        desirialize(itemsToString(), ITEMS_PATH);

                        System.out.println("Success !");
                    }

                    break;
                }
                case 3: {
                    System.out.println("Please enter the category type of the items taht you want to see");
                    String categoryType = scanner.next();
                    if (ItemType.BOOK.name().equalsIgnoreCase(categoryType)) {
                        System.out.println(books.toString());
                    } else if (ItemType.DVD.name().equalsIgnoreCase(categoryType)) {
                        System.out.println(dvds.toString());
                    } else {
                        System.out.println(magazines.toString());
                    }
                    break;
                }
                case 4: {
                    System.out.println(member.getBorrowableItems());
                    break;
                }
                case 5: {
                    member.getInformationAboutProfile();
                    break;
                }
                case 6: {
                    System.out.println("Please enter the id of returning item: ");
                    int idOfItemToRemove = scanner.nextInt();

                    for (LibraryItem lb : allItems) {
                        if (lb.getId() == idOfItemToRemove) {
                            if (member.getBorrowableItems().remove(lb)) {
                                System.out.println("Success!");
                                lb.setAvailable(true);
                                desirialize(itemsToString(), ITEMS_PATH);
                                desirialize(usersToString(), USERS_PATH);
                            } else {
                                System.out.println("You don't have this item");
                            }
                            break;
                        }
                    }
                    break;
                }
                default:
                    logout = true;
                    break;
            }
        }
    }

    private static String usersToString() {
        StringBuilder sb = new StringBuilder();
        librarians.forEach(l -> {
            sb.append(l.deserialize())
                    .append("\n");
        });

        libraryMembers.forEach(lm -> {
            sb.append(lm.deserialize())
                    .append("\n");
        });
        return sb.toString();
    }

    private static String itemsToString() {
        StringBuilder sb = new StringBuilder();
        magazines.forEach(l -> {
            sb.append(l.deserialize())
                    .append("\n");
        });

        books.forEach(lm -> {
            sb.append(lm.deserialize())
                    .append("\n");
        });

        dvds.forEach(lm -> {
            sb.append(lm.deserialize())
                    .append("\n");
        });

        rareBooks.forEach(lm -> {
            sb.append(lm.deserialize())
                    .append("\n");
        });
        return sb.toString();
    }


    private static void startActions(int action) {
        int act;
        switch (action) {
            case 1: {
                //по дефолту мы говорим что если  ты регистрируешься в нашей системе, то может зарегистрироваться только обычный пользователь
                String[] data = new String[9];
                createUser(Role.MEMBER, data);
                break;

            }
            case 2: {
                System.out.println("vvedite login");
                String login = scanner.next();
                System.out.println("vvedite password");
                String password = scanner.next();
                Optional<User> user = users.stream().filter(u -> u.getLogin().equals(login)).findFirst();

                if (user.isPresent()) {
                    if (!PasswordValidation.checkPassword(password, user.get().getPassword())) {
                        System.out.println("Incorrect login or password! Зарег(1) или попробовать снова(2) ?");
                        act = scanner.nextInt();
                        startActions(act);
                    }
                    currentUser = user.get();

                    if (Role.MEMBER.equals(currentUser.getRole())) {
                        LibraryMember member = (LibraryMember) currentUser;
                        if (!member.isActive()) {
                            System.out.println("Your account is blocked, please contact to Librarian");
                            System.out.println("Зарег(1) или попробовать снова(2) ?");
                            act = scanner.nextInt();
                            startActions(act);
                        }
                    }


                    break;

                } else {
                    System.out.println("Incorrect login or password! Зарег(1) или попробовать снова(2) ?");
                    act = scanner.nextInt();
                    startActions(act);
                }

            }
            default: {
                break;
            }
        }
    }

    private static void createUser(Role role, String[] data) {
        StringBuilder sb = new StringBuilder();
        data[0] = role.name();
        data[1] = String.valueOf(Math.abs(new Random().nextInt()));
        System.out.println("Введите login");
        data[2] = scanner.next();
        System.out.println("Введите password");
        data[3] = Base64.getEncoder().encodeToString(scanner.next().getBytes());

        System.out.println("Введите firstName");
        data[4] = scanner.next();

        System.out.println("Введите lastName");
        data[5] = scanner.next();

        data[6] = "true";

        if (Objects.nonNull(currentUser) && currentUser.getRole().equals(Role.LIBRARIAN)) {
            System.out.println("Введите membershipStatus");
            data[7] = MembershipStatus.valueOf(scanner.next().toUpperCase()).name();
        } else {
            data[7] = MembershipStatus.SILVER.name();
        }


        LibraryMember newMember = createLibraryMember(data);

        libraryMembers.add(newMember);

        desirialize(usersToString(), USERS_PATH);

        currentUser = newMember;
        System.out.println("Вы успешно зарегестрированы!");
    }

    //1;Little prince;false;BOOK;AAA_Author;Title_B;19191919;
    //3;Vogue;false;MAGAZINE;292;Vogue_ISSUER;
    private static void createItem(ItemType itemType, String[] data) {
        data[0] = String.valueOf(Math.abs(new Random().nextInt()));
        System.out.println("Введите название");
        data[1] = scanner.next();
        data[2] = "true";
        if (ItemType.BOOK.equals(itemType)) {
            data[3] = ItemType.BOOK.name();

            System.out.println("Введите author");
            data[4] = scanner.next();

            System.out.println("Введите title");
            data[5] = scanner.next();

            System.out.println("Введите isbn");
            data[6] = scanner.next();

            Book newBook = createBook(data);
            books.add(newBook);
            desirialize(itemsToString(), ITEMS_PATH);
            System.out.println("Вы успешно зарегестрировали книгу!");
        } else if (ItemType.MAGAZINE.equals(itemType)) {
            data[3] = ItemType.MAGAZINE.name();

            System.out.println("Введите isssuerNumber");
            data[4] = String.valueOf(scanner.nextInt());

            System.out.println("Введите issuer");
            data[5] = scanner.next();

            Magazine newMagazine = createMagazine(data);
            magazines.add(newMagazine);
            desirialize(itemsToString(), ITEMS_PATH);
            System.out.println("Вы успешно зарегестрировали журнал!");
        } else if (ItemType.DVD.equals(itemType)) {
            data[3] = ItemType.DVD.name();

            System.out.println("Введите runtime");
            data[4] = String.valueOf(scanner.nextInt());

            Dvd newDvd = createDvd(data);
            dvds.add(newDvd);
            desirialize(itemsToString(), ITEMS_PATH);
            System.out.println("Вы успешно зарегестрировали dvd!");
        } else if (ItemType.RAREBOOK.equals(itemType)) {
            data[3] = ItemType.RAREBOOK.name();

            System.out.println("Введите author");
            data[4] = scanner.next();

            System.out.println("Введите title");
            data[5] = scanner.next();

            System.out.println("Введите isbn");
            data[6] = scanner.next();

            System.out.println("Please write arariry level");
            int rarityLevel = scanner.nextInt();
            if (rarityLevel >= 1 && rarityLevel <= 5) {
                data[7] = String.valueOf(rarityLevel);
            }else{
                System.out.println("Sorry youcan't create book with this rariry level\n Try again!");
                return;
            }

            RareBook newRareBook = createRareBook(data);
            rareBooks.add(newRareBook);
            desirialize(itemsToString(), ITEMS_PATH);
            System.out.println("Вы успешно зарегестрировали rareBook!");
        }
    }


    private static void desirialize(String data, String path) {
        try (PrintWriter printWriter = new PrintWriter(new FileWriter(path))) {
            printWriter.print(data);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void syncUsers() {
        try {
            File userFiles = new File(USERS_PATH);
            Scanner reader = new Scanner(userFiles);

            while (reader.hasNextLine()) {
                String[] parsed = new String[100];
                String data = reader.nextLine();
                parsed = data.split(";");

                if (Role.LIBRARIAN.name().equals(parsed[0])) {
                    librarians.add(createLibrarian(parsed));
                } else if (Role.MEMBER.name().equals(parsed[0])) {
                    libraryMembers.add(createLibraryMember(parsed));
                }
            }
            reader.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    public static void syncAllLibraryItems() {
        try {
            File itemsFiles = new File(ITEMS_PATH);
            Scanner reader = new Scanner(itemsFiles);

            while (reader.hasNextLine()) {
                String[] parsed = new String[100];
                String data = reader.nextLine();
                parsed = data.split(";");

                if (ItemType.MAGAZINE.name().equals(parsed[3])) {
                    magazines.add(createMagazine(parsed));

                } else if (ItemType.DVD.name().equals(parsed[3])) {
                    dvds.add(createDvd(parsed));
                } else {
                    books.add(createBook(parsed));
                }

            }
            reader.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    private static Magazine createMagazine(String[] array) {
        Magazine magazine = new Magazine();
        magazine.setId(Objects.nonNull(array[0]) ? Integer.parseInt(array[0]) : Math.abs(new Random().nextInt()));
        magazine.setName(Objects.nonNull(array[1]) ? array[1] : "");
        magazine.setItemType(ItemType.MAGAZINE);
        magazine.setAvailable(Objects.nonNull(array[2]) ? Boolean.parseBoolean(array[2]) : false);
        magazine.setIssuer(Objects.nonNull(array[5]) ? array[5] : "");
        magazine.setIssueNumber(Objects.nonNull(array[4]) ? Long.parseLong(array[4]) : Math.abs(new Random().nextInt()));
        allItems.add(magazine);
        return magazine;
    }

    private static Dvd createDvd(String[] array) {
        Dvd dvd = new Dvd();
        dvd.setId(Objects.nonNull(array[0]) ? Integer.parseInt(array[0]) : Math.abs(new Random().nextInt()));
        dvd.setName(Objects.nonNull(array[1]) ? array[1] : "");
        dvd.setItemType(ItemType.DVD);
        dvd.setAvailable(Objects.nonNull(array[2]) ? Boolean.parseBoolean(array[2]) : false);
        dvd.setRuntime(Objects.nonNull(array[4]) ? Integer.parseInt(array[4]) : Math.abs(new Random().nextInt()));
        allItems.add(dvd);
        return dvd;
    }

    private static Book createBook(String[] array) {
        Book book = new Book();
        book.setId(Objects.nonNull(array[0]) ? Integer.parseInt(array[0]) : Math.abs(new Random().nextInt()));
        book.setName(Objects.nonNull(array[1]) ? array[1] : "");
        book.setItemType(ItemType.BOOK);
        book.setAvailable(Objects.nonNull(array[2]) ? Boolean.parseBoolean(array[2]) : false);

        book.setAuthor(Objects.nonNull(array[4]) ? array[4] : "");
        book.setTitle(Objects.nonNull(array[5]) ? array[5] : "");
        book.setIsbn(Objects.nonNull(array[6]) ? array[6] : String.valueOf(Math.abs(new Random().nextLong())));
        allItems.add(book);
        return book;
    }

    private static RareBook createRareBook(String[] array) {
        RareBook rareBook = new RareBook();
        rareBook.setId(Objects.nonNull(array[0]) ? Integer.parseInt(array[0]) : Math.abs(new Random().nextInt()));
        rareBook.setName(Objects.nonNull(array[1]) ? array[1] : "");
        rareBook.setItemType(ItemType.RAREBOOK);
        rareBook.setAvailable(Objects.nonNull(array[2]) ? Boolean.parseBoolean(array[2]) : false);

        rareBook.setAuthor(Objects.nonNull(array[4]) ? array[4] : "");
        rareBook.setTitle(Objects.nonNull(array[5]) ? array[5] : "");
        rareBook.setIsbn(Objects.nonNull(array[6]) ? array[6] : String.valueOf(Math.abs(new Random().nextLong())));
        rareBook.setRarituLevel(Objects.nonNull(array[7]) ? Integer.parseInt(array[7]) : new Random().nextInt(5)+1);
        allItems.add(rareBook);
        return rareBook;
    }


    public static Librarian createLibrarian(String[] array) {
        Librarian librarian = new Librarian();
        librarian.setRole(Role.LIBRARIAN);
        librarian.setId(Objects.nonNull(array[1]) ? Integer.parseInt(array[1]) : Math.abs(new Random().nextInt()));
        librarian.setLogin(Objects.nonNull(array[2]) ? array[2] : "");
        librarian.setPassword(Objects.nonNull(array[3]) ? array[3] : "");
        librarian.setFirstName(Objects.nonNull(array[4]) ? array[4] : "");
        librarian.setLastName(Objects.nonNull(array[5]) ? array[5] : "");
        librarian.setWorkExperience(Objects.nonNull(array[6]) ? Integer.parseInt(array[6]) : 0);
        users.add(librarian);
        return librarian;
    }

    public static LibraryMember createLibraryMember(String[] array) {
        LibraryMember libraryMember = new LibraryMember();
        libraryMember.setRole(Role.MEMBER);
        libraryMember.setId(Objects.nonNull(array[1]) ? Integer.parseInt(array[1]) : Math.abs(new Random().nextInt()));
        libraryMember.setLogin(Objects.nonNull(array[2]) ? array[2] : "");
        libraryMember.setPassword(Objects.nonNull(array[3]) ? array[3] : "");
        libraryMember.setFirstName(Objects.nonNull(array[4]) ? array[4] : "");
        libraryMember.setLastName(Objects.nonNull(array[5]) ? array[5] : "");
        libraryMember.setAvtive(Objects.nonNull(array[6]) ? Boolean.parseBoolean(array[6]) : false);
        libraryMember.setMembershipStatus(Objects.nonNull(array[7]) ? MembershipStatus.valueOf(array[7]) : MembershipStatus.SILVER);
        libraryMember.setBorrowableItems(syncUserItems(array[8]));
        users.add(libraryMember);
        return libraryMember;
    }


    public static List<BorrowableItem> syncUserItems(String value) {
        if (Objects.nonNull(value) && !value.equals("null")) {
            List<BorrowableItem> userItems = new ArrayList<>();
            String[] values = value.split("@");
            for (String val : values) {
                Optional<LibraryItem> lb = allItems.stream()
                        .filter(i -> i.getId() == Integer.parseInt(val))
                        .findFirst();


                if (lb.isPresent()) {
                    switch (lb.get().getItemType()) {
                        case DVD: {
                            Optional<Dvd> dvd = dvds.stream()
                                    .filter(d -> d.getId() == lb.get().getId())
                                    .findFirst();

                            if (dvd.isPresent()) {
                                userItems.add(dvd.get());
                            }
                            break;
                        }
                        case BOOK: {
                            Optional<Book> book = books.stream()
                                    .filter(d -> d.getId() == lb.get().getId())
                                    .findFirst();

                            if (book.isPresent()) {
                                userItems.add(book.get());
                            }
                            break;
                        }
                        case MAGAZINE: {
                            Optional<Magazine> magazine = magazines.stream()
                                    .filter(d -> d.getId() == lb.get().getId())
                                    .findFirst();

                            if (magazine.isPresent()) {
                                userItems.add(magazine.get());
                            }
                            break;
                        }
                        default: {
                            System.out.printf("Unknown item type %s", lb.get().getItemType());
                        }
                    }

                }
            }
            return userItems;
        }
        return null;
    }

    private static void listItems() {
        for (LibraryItem item : allItems) {
            item.displayDetails();
        }
    }

}
