package racingcar.controller;

import racingcar.domain.Race;
import racingcar.view.InputView;

import static racingcar.view.OutputView.*;

public class GameController {
    public void start() {
        PrintMessage(ASK_CAR_NAMES);
        Race race = InputView.InputCarNames();

        PrintMessage(ASK_NUMBER_OF_ATTEMPTS);
        race.setAttempt(InputView.InputAttemptNumber());

        play(race);
    }

    private static void play(Race race) {

    }

}
