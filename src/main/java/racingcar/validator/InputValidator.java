package racingcar.validator;

import racingcar.domain.Car;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static racingcar.domain.Constant.MAX_CAR_NAME_LENGTH;

public class InputValidator {
    private final static String CAR_NAME_LENGTH_ERROR = "[ERROR] 5자 이상인 자동차 이름이 존재합니다.";
    private final static String CAR_NAME_EMPTY_ERROR = "[ERROR] 올바른 자동차 이름을 입력해주세요. 자동차 이름에는 쉼표(,)가 들어갈 수 없습니다.";
    private final static String ATTEMPT_NUMBER_ERROR = "[ERROR] 시도할 회수는 1이상 숫자만 유효합니다.";

    public static void validateCarNameLength(String input) {
        List<String> carNameList = Arrays.stream(input.split(","))
                .collect(Collectors.toList());

        for (String name : carNameList) {
            if(!isValidNameLength(name)) throw new IllegalArgumentException(CAR_NAME_LENGTH_ERROR);
        }
    }

    public static void validateCarNameEmpty(String input) {
        List<String> carNameList = Arrays.stream(input.split(","))
                .map(String::trim)
                .collect(Collectors.toList());

        for (String name : carNameList) {
            if(isEmpty(name)) throw new IllegalArgumentException(CAR_NAME_EMPTY_ERROR);
        }
    }

    public static void validateAttemptNumber(String input) {
        if(!isValidAttemptNumber(input)) throw new IllegalArgumentException(ATTEMPT_NUMBER_ERROR);
    }

    private static boolean isValidNameLength(String name) {
        return name.length() <= MAX_CAR_NAME_LENGTH;
    }

    private static boolean isEmpty(String input) {
        return input.isEmpty();
    }

    private static boolean isValidAttemptNumber(String input) {
        return input.chars().allMatch(Character::isDigit);
    }
}
