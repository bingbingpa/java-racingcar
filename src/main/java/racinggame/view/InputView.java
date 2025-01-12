package racinggame.view;

import java.util.Scanner;

public class InputView {

    private static final Scanner scanner = new Scanner(System.in);
    private static final String INPUT_NUMBER_OF_CAR = "경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).";
    private static final String INPUT_NUMBER_OF_COUNT = "시도할 회수는 몇 회 인가요?";

    private InputView() {
    }

    public static String inputNameOfCar() {
        System.out.println(INPUT_NUMBER_OF_CAR);
        return scanner.nextLine();
    }

    public static int inputNumberOfCount() {
        System.out.println(INPUT_NUMBER_OF_COUNT);
        return scanner.nextInt();
    }
}
