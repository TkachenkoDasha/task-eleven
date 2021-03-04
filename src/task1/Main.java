package task1;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        System.out.println(Stream.of(1, 4, 17, 89, 43, 16, 25, 81, 121, 233, 12, 17, 23, 27, 34, 83)
                .map(Math::sqrt).filter(n -> n % 1 == 0).count());
    }
}
