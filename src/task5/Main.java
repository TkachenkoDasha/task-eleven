package task5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        try (Stream<String> stream = Files.lines(Paths.get("C:\\Users\\Dasha Tkachenko\\IdeaProjects\\hw11\\src\\task5\\numbers.txt"))) {
            stream.flatMap(p -> Arrays.stream(p.split(",")))
                    .map(Double::parseDouble)
                    .collect(Collectors.toList())
                    .forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("Catch exception");
        }
    }
}
