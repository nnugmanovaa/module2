package module3.collection2;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        task16();
    }

    public static void task2() {
        List<String> arrayList = new ArrayList<>();
        for (String a : arrayList) {
            System.out.println(a);
        }
    }

    public static void task1() {
        List<String> colors = new ArrayList<>();
        colors.add("White");
        colors.add("Black");
        colors.add("Red");
        colors.add("Blue");
        System.out.printf("ArrayList has %d elements: ", colors.size());
        System.out.println(colors);
    }

    public static void task3() {
        List<String> colors = new ArrayList<>();
        colors.add("White");
        colors.add(0, "Black");
        System.out.println(colors);
    }

    public static void task4() {
        List<String> colors = new ArrayList<>();
        colors.add("white");
        colors.add("Black");
        colors.add("Red");
        colors.add("Blue");
        System.out.println(colors.get(0));
    }

    public static void task5() {
        List<String> colors = new ArrayList<>();
        colors.add("white");
        colors.add("Black");
        colors.add("Red");
        colors.add("Blue");
        colors.set(1, "Yellow");
        System.out.println(colors);
    }

    public static void task6() {
        List<String> colors = new ArrayList<>();
        colors.add("white");
        colors.add("Black");
        colors.add("Red");
        colors.add("Blue");
        colors.remove(3);
        System.out.println(colors);
    }

    public static boolean task7() {
        List<Integer> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("please wirte an elemnts to the array,no more that 4!");
        for (int i = 0; i < 4; i++) {
            arrayList.add(scanner.nextInt());
        }


        System.out.println("Please write an element that you want to find");
        int number = scanner.nextInt();
        return arrayList.contains(number) ? true : false;
    }

    public static void task8() {
        List<String> colors = new ArrayList<>();
        colors.add("white");
        colors.add("Black");
        colors.add("Red");
        colors.add("Blue");
        Collections.sort(colors);
        System.out.println(colors);
    }

    public static void task9() {
        List<String> colors = new ArrayList<>();
        colors.add("white");
        colors.add("Black");
        colors.add("Red");
        colors.add("Blue");

        List<String> mycolors = colors;
        System.out.println(mycolors);
    }

    public static void task10() {
        List<String> colors = new ArrayList<>();
        colors.add("white");
        colors.add("Black");
        colors.add("Red");
        colors.add("Blue");

        Collections.shuffle(colors);
        System.out.println(colors);
    }

    public static void task11() {
        List<String> colors = new ArrayList<>();
        colors.add("white");
        colors.add("Black");
        colors.add("Red");
        colors.add("Blue");
        Collections.reverse(colors);
    }

    public static void task12() {
        List<String> colors = new ArrayList<>();
        colors.add("white");
        colors.add("Black");
        colors.add("Red");
        colors.add("Blue");

        List<String> newColors = colors.subList(0, 3);
        System.out.println(newColors);
    }

    public static void task13() {
        List<String> colors = new ArrayList<>();
        colors.add("white");
        colors.add("Black");
        colors.add("Red");
        colors.add("Blue");

        List<String> newColors = new ArrayList<>();
        newColors.add("white");
        newColors.add("Black");
        newColors.add("Red");
        newColors.add("Blue");
        if (colors.equals(newColors)) {
            System.out.println("it is equal");
        } else {
            System.out.println("it is not equal");
        }
    }

    public static void task14() {
        List<String> colors = new ArrayList<>();
        colors.add("white");
        colors.add("Black");
        colors.add("Red");
        colors.add("Blue");

        Collections.swap(colors, 0, 3);
        System.out.println(colors);
    }

    public static void task15(){
        List<String> colors = new ArrayList<>();
        colors.add("white");
        colors.add("Black");
        colors.add("Red");
        colors.add("Blue");

        List<String> newColors = new ArrayList<>();
        newColors.add("white");
        newColors.add("Black");
        newColors.add("Red");
        newColors.add("Blue");

        List<String> joinnedlist = new ArrayList<>(colors);
        joinnedlist.addAll(newColors);
        System.out.println(joinnedlist);
    }

    public static void task16(){
        List<String> colors = new ArrayList<>();
        colors.add("white");
        colors.add("Black");
        colors.add("Red");
        colors.add("Blue");

        List<String> newColors = new ArrayList<>(colors);
        System.out.println(newColors);

    }


}
