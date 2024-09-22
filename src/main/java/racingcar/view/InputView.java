package racingcar.view;

import racingcar.validator.InputValidator;

import static camp.nextstep.edu.missionutils.Console.readLine;


public class InputView {
    public static String InputCarNames() {
        String carNames = readLine();

        InputValidator.validateCarNameLength(carNames);
        InputValidator.validateCarNameEmpty(carNames);

        return carNames;
    }

    public static String InputAttemptNumber() {
        String attemptNumber = readLine();

        InputValidator.validateAttemptNumber(attemptNumber);

        return attemptNumber;
    }
}
