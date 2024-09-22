package racingcar.controller;

import racingcar.domain.Race;
import racingcar.view.InputView;

import static racingcar.view.OutputView.*;

public class GameController {
    public void start() {
        PrintMessage(ASK_CAR_NAMES);
        String carNames = InputView.InputCarNames();

        Race race = new Race(carNames);

        PrintMessage(ASK_NUMBER_OF_ATTEMPTS);
        race.setAttempt(Integer.parseInt(InputView.InputAttemptNumber()));

        play(race);
    }

    private static void play(Race race) {
        PrintMessage(EXECUTION_RESULT);

        do {
            race.startRace();
            PrintRaceResult(race);
        } while(!race.isGameOver());

        PrintFinalResult(race);
    }

}
