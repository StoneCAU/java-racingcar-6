package racingcar.view;

import racingcar.domain.Race;
import racingcar.validator.InputValidator;

import static camp.nextstep.edu.missionutils.Console.readLine;


public class InputView {
    public static Race InputCarNames() {
        String carNames = readLine();

        InputValidator.validateCarNameLength(carNames);
        InputValidator.validateCarNameEmpty(carNames);

        return new Race(carNames);
    }

    public static String InputAttemptNumber() {
        String attemptNumber = readLine();

        InputValidator.validateAttemptNumber(attemptNumber);

        return attemptNumber;
    }
}
