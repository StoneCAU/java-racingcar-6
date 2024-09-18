package racingcar.domain;

public class Car {
    private final String carName;

    // Race를 통해서만 생성 가능
    protected Car(String carName) {
        this.carName = carName;
    }
}
