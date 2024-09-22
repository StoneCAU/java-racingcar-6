package racingcar.view;

import racingcar.domain.Car;
import racingcar.domain.Race;

import java.util.List;

import static java.lang.String.format;

public class OutputView {

    public static final String ASK_CAR_NAMES = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    public static final String ASK_NUMBER_OF_ATTEMPTS = "시도할 회수는 몇회인가요?";
    public static final String EXECUTION_RESULT = "\n실행 결과";
    public static final String FINAL_RESULT = "최종 우승자 : %s";

    public static void PrintMessage(String message) {
        System.out.println(message);
    }

    public static void PrintRaceResult(Race race) {
        List<Car> cars = race.getCars();

        for (Car car : cars) {
            String carName = car.getCarName();
            int moveCount = car.getMoveCount();

            System.out.println(format("%s : %s", carName, PrintLocation(moveCount)));
        }

        System.out.println();
    }

    private static String PrintLocation(int moveCount) {
        String Position;

        Position = "-".repeat(moveCount);

        return Position;
    }

    public static void PrintFinalResult(Race race) {
        String winners = race.findWinner();
        System.out.println(format(FINAL_RESULT, winners));
    }
}
