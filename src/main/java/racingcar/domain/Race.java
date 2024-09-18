package racingcar.domain;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Race {
    private final List<Car> cars;
    private int attempt;

    public Race(String carNames) {
        this.cars = convertCarList(carNames);
    }

    private List<Car> convertCarList(String carNames) {
        return Arrays.stream(carNames.split(","))
                .map(Car::new)
                .collect(Collectors.toList());
    }

    public void setAttempt(int attempt) {
        this.attempt = attempt;
    }
}
