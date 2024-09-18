package racingcar.view;

import racingcar.domain.Race;

import static camp.nextstep.edu.missionutils.Console.readLine;


public class InputView {
    public static Race InputCarNames() {
        String carNames = readLine();
        return new Race(carNames);
    }
}
