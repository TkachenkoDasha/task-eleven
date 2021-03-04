package task4;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public final class CarUtils {

    private CarUtils() {
    }

    public static Map<Integer, Car> filterCar(List<Car> cars, Predicate<Car> predicate) {
        return cars.stream()
                .filter(predicate)
                .collect(Collectors.toMap(Car::getId, v -> v));
    }
}
