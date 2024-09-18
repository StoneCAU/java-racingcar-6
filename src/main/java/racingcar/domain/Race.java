package racingcar.domain;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Race {
    private final List<Car> cars;
    private int attemptNum;

    public List<Car> getCars() {
        return cars;
    }

    public Race(String carNames) {
        this.cars = convertCarList(carNames);
    }

    private List<Car> convertCarList(String carNames) {
        return Arrays.stream(carNames.split(","))
                .map(Car::new)
                .collect(Collectors.toList());
    }

    public void startRace() {
        cars.forEach(Car::attempt);
        attemptNum--;
    }

    public void setAttempt(int attemptNum) {
        this.attemptNum = attemptNum;
    }

    public boolean isGameOver() {
        return attemptNum == 0;
    }
}
