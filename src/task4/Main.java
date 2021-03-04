package task4;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> listOfCars = Arrays.asList(new Car(1, 34000, "Black", 2015),
                new Car(2, 15000, "Grey", 2014),
                new Car(3, 11000, "Black", 2013),
                new Car(4,9000, "Yellow", 2015),
                new Car(5, 11000, "Red", 2012));

        CarUtils.filterCar(listOfCars, car -> car.getPrice() == 11000)
                .forEach((key, value) -> System.out.println(key + " " + value));
        System.out.println();
        CarUtils.filterCar(listOfCars, car -> car.getColor().equals("Black"))
                .forEach((key, value) -> System.out.println(key + " " + value));
        System.out.println();
        CarUtils.filterCar(listOfCars, car -> car.getYearOfIssue() == 2015)
                .forEach((key, value) -> System.out.println(key + " " + value));
    }
}
