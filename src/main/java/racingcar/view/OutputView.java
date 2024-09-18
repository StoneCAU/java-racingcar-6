package racingcar.view;

public class OutputView {

    public static final String ASK_CAR_NAMES = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    public static final String ASK_NUMBER_OF_ATTEMPTS = "시도할 회수는 몇회인가요?";

    public static void PrintMessage(String message) {
        System.out.println(message);
    }
}
