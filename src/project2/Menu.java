package project2;

import java.io.*;
import java.util.*;

public class Menu {
    private static List<LibraryMember> libraryMembers = new ArrayList<>();
    private static List<Librarian> librarians = new ArrayList<>();
    private static List<LibraryItem> allItems = new ArrayList<>();

    private static List<Book> books = new ArrayList<>();

    private static List<Dvd> dvds = new ArrayList<>();

    private static List<Magazine> magazines = new ArrayList<>();

    private static User currentUser;

    private static List<User> users = new ArrayList<>();

    public static Scanner scanner = new Scanner(System.in);

    private static  final String USERS_PATH = "/Users/aruzhan/Desktop/javaproj/Lesson0/src/project2/users.txt";

    private static  final String ITEMS_PATH = "/Users/aruzhan/Desktop/javaproj/Lesson0/src/project2/items.txt";


    public static void start(){
        try {
            syncAllLibraryItems();
            syncUsers();

            boolean logout = false;
            int action;

            System.out.println("Welcome on books.com! ");
            System.out.printf("Вы хотите зарег(1) или войти(2)");
            action = scanner.nextInt();

            startActions(action);

            switch (currentUser.getRole()) {
                case LIBRARIAN: {
                    System.out.println("text librarian");
                    logout = true;
                    break;
                }
                case MEMBER: {
                    System.out.println("text member");
                    actionsForMember();
                    logout = true;
                    break;
                }
                default: {
                    System.out.println("unkbown");
                    break;
                }
            }


        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private static void actionsForMember() {
        boolean logout = false;
        String memberText= "1.Список всех айтомов \n  2.Добавить айтом";
        int act;
        while (!logout) {
            System.out.println(memberText);
            act= scanner.nextInt();;
            switch (act) {
                case 1 : {
                    for(LibraryItem item : allItems){
                        item.displayDetails();
                    }
                    break;
                }

                case 2: {
                    System.out.println("Введите айди айтема ");
                    act = scanner.nextInt();

                    LibraryMember  member = (LibraryMember) currentUser;

                    List<BorrowableItem> currentItems = new ArrayList<>();
                    if (Objects.nonNull(member.getBorrowableItems())) {
                        currentItems.addAll(member.getBorrowableItems());
                    }

                    for (LibraryItem  lb : allItems) {

                        if (lb.getId() == act) {
                           if (ItemType.MAGAZINE.equals(lb.getItemType())) {
                               Magazine magazine = (Magazine) lb;
                               magazine.setAvailable(false);
                               magazines.add(magazine);
                               currentItems.add(magazine);
                           } else if (ItemType.BOOK.equals(lb.getItemType())) {
                               Book book = (Book) lb;
                               currentItems.add(book);
                           } else {
                               Dvd dvd = (Dvd) lb;
                               currentItems.add(dvd);
                           }
                        }
                    }

                    member.setBorrowableItems(currentItems);


                    desirialize(usersToString(), USERS_PATH);

                    System.out.println("Success !");
                    break;
                }
            }
        }
    }

    private static String usersToString () {
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


    private static void startActions(int action) {
        int act;
        switch (action) {
            case 1: {
                String[] data = new String[9];
                createUser(Role.MEMBER, data);
                break;

            }
            case 2: {
                System.out.println("vvedite login");
                String login  = scanner.next();
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
        data[0]= role.name();
        data[1] = String.valueOf(new Random().nextInt());
        System.out.println("Введите login");
        data[2] = scanner.next();
        System.out.println("Введите password");
        data[3] = Base64.getEncoder().encodeToString(scanner.next().getBytes());

        System.out.println("Введите firstName");
        data[4] = scanner.next();

        System.out.println("Введите lastName");
        data[5] = scanner.next();

        data[6] = "true";

        data[7] = MembershipStatus.SILVER.name();

        LibraryMember  newMember = createLibraryMember(data);

        libraryMembers.add(newMember);

        desirialize(usersToString(), USERS_PATH);

        currentUser = newMember;
        System.out.println("Вы успешно зарегестрированы!");
    }


    private static void desirialize(String data, String path)  {
        try( PrintWriter printWriter = new PrintWriter(new FileWriter(path))) {
            printWriter.println(data);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void syncUsers(){
        try{
            File userFiles = new File(USERS_PATH);
            Scanner reader = new Scanner(userFiles);

            while(reader.hasNextLine()){
                String [] parsed = new String[100];
                String data = reader.nextLine();
                parsed = data.split(";");

                if (Role.LIBRARIAN.name().equals(parsed[0])){
                    librarians.add(createLibrarian(parsed));
                } else if (Role.MEMBER.name().equals(parsed[0])){
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
            File itemsFiles = new File("/Users/aruzhan/Desktop/javaproj/Lesson0/src/project2/items.txt");
            Scanner reader = new Scanner(itemsFiles);

            while(reader.hasNextLine()){
                String [] parsed = new String[100];
                String data = reader.nextLine();
                parsed = data.split(";");

                if (ItemType.MAGAZINE.name().equals(parsed[3])) {
                    magazines.add(createMagazine(parsed));

                } else if (ItemType.DVD.name().equals(parsed[3])){
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
        magazine.setId(Objects.nonNull(array[0]) ? Integer.parseInt(array[0]) : new Random().nextInt());
        magazine.setName(Objects.nonNull(array[1]) ? array[1] : "");
        magazine.setItemType(ItemType.MAGAZINE);
        magazine.setAvailable(Objects.nonNull(array[2]) ? Boolean.parseBoolean(array[2]) : false);
        magazine.setIssuer(Objects.nonNull(array[5]) ? array[5] : "");
        magazine.setIssueNumber(Objects.nonNull(array[4]) ? Long.parseLong(array[4]) : new Random().nextLong());
        allItems.add(magazine);
        return magazine;
    }
    private static Dvd createDvd(String[] array) {
        Dvd dvd = new Dvd();
        dvd.setId(Objects.nonNull(array[0]) ? Integer.parseInt(array[0]) : new Random().nextInt());
        dvd.setName(Objects.nonNull(array[1]) ? array[1] : "");
        dvd.setItemType(ItemType.DVD);
        dvd.setAvailable(Objects.nonNull(array[2]) ? Boolean.parseBoolean(array[2]) : false);
        dvd.setRuntime(Objects.nonNull(array[4]) ? Integer.parseInt(array[4]) : new Random().nextInt());
        allItems.add(dvd);
        return dvd;
    }

    private static Book createBook(String[] array) {
        Book book = new Book();
        book.setId(Objects.nonNull(array[0]) ? Integer.parseInt(array[0]) : new Random().nextInt());
        book.setName(Objects.nonNull(array[1]) ? array[1] : "");
        book.setItemType(ItemType.BOOK);
        book.setAvailable(Objects.nonNull(array[2]) ? Boolean.parseBoolean(array[2]) : false);

        book.setAuthor(Objects.nonNull(array[4]) ? array[4] : "");
        book.setTitle(Objects.nonNull(array[5]) ? array[5] : "");
        book.setIsbn(Objects.nonNull(array[6]) ? array[6] : String.valueOf(new Random().nextLong()));
        allItems.add(book);
        return book;
    }



    public static Librarian createLibrarian(String [] array){
        Librarian librarian = new Librarian();
        librarian.setRole(Role.LIBRARIAN);
        librarian.setId(Objects.nonNull(array[1]) ? Integer.parseInt(array[1]) : new Random().nextInt());
        librarian.setLogin(Objects.nonNull(array[2]) ? array[2] : "");
        librarian.setPassword(Objects.nonNull(array[3]) ? array[3] : "");
        librarian.setFirstName(Objects.nonNull(array[4]) ? array[4] : "");
        librarian.setLastName(Objects.nonNull(array[5]) ? array[5] : "");
        librarian.setWorkExperience(Objects.nonNull(array[6]) ? Integer.parseInt(array[6]) : 0);
        users.add(librarian);
        return librarian;
    }

    public static LibraryMember createLibraryMember(String [] array){
        LibraryMember libraryMember = new LibraryMember();
        libraryMember.setRole(Role.MEMBER);
        libraryMember.setId(Objects.nonNull(array[1]) ? Integer.parseInt(array[1]) : new Random().nextInt());
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
                Optional<LibraryItem> lb =  allItems.stream()
                        .filter(i -> i.getId() == Integer.parseInt(val))
                        .findFirst();


                if (lb.isPresent()) {
                    switch (lb.get().getItemType()) {
                        case DVD: {
                            Optional<Dvd> dvd =  dvds.stream()
                                    .filter(d -> d.getId() == lb.get().getId())
                                    .findFirst();

                            if (dvd.isPresent()) {
                                userItems.add(dvd.get());
                            }
                            break;
                        }
                        case BOOK: {
                            Optional<Book> book =  books.stream()
                                    .filter(d -> d.getId() == lb.get().getId())
                                    .findFirst();

                            if (book.isPresent()) {
                                userItems.add(book.get());
                            }
                            break;
                        }
                        case MAGAZINE: {
                            Optional<Magazine> magazine =  magazines.stream()
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

}
