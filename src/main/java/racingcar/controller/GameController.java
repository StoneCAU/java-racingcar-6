package racingcar.controller;

import racingcar.domain.Race;
import racingcar.view.InputView;

import static racingcar.view.OutputView.ASK_CAR_NAMES;
import static racingcar.view.OutputView.PrintMessage;

public class GameController {
    public void start() {
        PrintMessage(ASK_CAR_NAMES);
        Race race = InputView.InputCarNames();
        play(race);
    }

    private static void play(Race race) {

    }

}
