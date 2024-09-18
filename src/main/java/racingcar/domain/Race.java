package racingcar.domain;

import java.util.ArrayList;
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

    public String findWinner() {
        List<Car> winners = new ArrayList<>();
        int max = maximumMoveCount();

        for (Car car : cars) {
            if (car.getMoveCount() == max) winners.add(car);
        }

        return ListToString(winners);
    }

    private int maximumMoveCount() {
        int max = 0;

        for(Car car : cars) {
            if(car.getMoveCount() > max) {
                max = car.getMoveCount();
            }
        }

        return max;
    }

    private String ListToString(List<Car> cars) {
        return cars.stream().map(Car::getCarName).collect(Collectors.joining(", "));
    }
}
