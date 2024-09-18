package racingcar.domain;

import camp.nextstep.edu.missionutils.Randoms;

import static racingcar.domain.Constant.MAX_RANDOM_NUMBER;
import static racingcar.domain.Constant.MIN_RANDOM_NUMBER;

public class Car {
    private final String carName;
    private int moveCount = 0;

    // Race를 통해서만 생성 가능
    protected Car(String carName) {
        this.carName = carName;
    }

    public void attempt() {
        if (isMoved()) moveCount++;
    }

    private static boolean isMoved() {
        int randomNumber = Randoms.pickNumberInRange(MIN_RANDOM_NUMBER, MAX_RANDOM_NUMBER);
        return randomNumber >= 4;
    }

    public int getMoveCount() {
        return moveCount;
    }

    public String getCarName() {
        return carName;
    }
}
