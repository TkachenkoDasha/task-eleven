package task2;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("Java", "they", "Java", "Jiva", "price", "Jira", "Java");
        List<String> list2 = Arrays.asList("Yamaha", "Yammy", "Yacudza");
        List<String> list3 = Arrays.asList("Yan", "Yankee", "Draw");
        List<String> list4 = Arrays.asList("Yan", "Yankee", "Yameow");
        List<String> list5 = Arrays.asList("Yan", "Yankee", "Draw", "Meowmeow");

        System.out.println("Test for list1");
        filterStartsWithJEndsWithA(list1);
        System.out.println();

        System.out.println("Test for list2");
        containsMeowOrStartsWithYa(list2);
        System.out.println();

        System.out.println("Test for list3");
        containsMeowOrStartsWithYa(list3);
        System.out.println();

        System.out.println("Test for list4");
        containsMeowOrStartsWithYa(list4);
        System.out.println();

        System.out.println("Test for list5");
        containsMeowOrStartsWithYa(list5);

    }

    private static void filterStartsWithJEndsWithA(List<String> listOfStrings) {
        listOfStrings.stream()
                .filter((s -> s.startsWith("J") && s.endsWith("a")))
                .distinct()
                .limit(3)
                .forEach(System.out::println);
    }

    private static void containsMeowOrStartsWithYa(List<String> listOfStrings) {
        if (listOfStrings.stream().anyMatch(s -> s.contains("meow"))) {
            System.out.println("NYA");
        }
        if (listOfStrings.stream().allMatch(s -> s.startsWith("Ya"))) {
            System.out.println("YA");
        }
    }
}
