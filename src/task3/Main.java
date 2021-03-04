package task3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] arrayOfStrings = {"Dasha", "Ivan", "Dima", "Alina", "Phillip", "Oleg"};
        Arrays.stream(arrayOfStrings)
                .sorted(((s1, s2) -> -s1.compareTo(s2)))
                .skip(toSkip(arrayOfStrings))
                .forEach(System.out::println);
    }

    private static long toSkip(String[] arrayOfStrings) {
        return arrayOfStrings.length < 4 ? 0 : arrayOfStrings.length - 3L;
    }
}
