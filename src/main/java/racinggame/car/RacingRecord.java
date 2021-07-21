package racinggame.car;

import java.util.ArrayList;
import java.util.List;

public class RacingRecord {

    private static final String RACE_STATUS_STRING = "-";
    private final List<String> status;
    private final StringBuilder stringBuilder;

    public RacingRecord() {
        status = new ArrayList<>();
        stringBuilder = new StringBuilder();
    }

    public void printGameStatus(int index) {
        System.out.println(status.get(index));
    }

    public void gameRecord(int position) {
        stringBuilder.setLength(0);
        for (int i = 0; i < position; i++) {
            stringBuilder.append(RACE_STATUS_STRING);
        }
        status.add(stringBuilder.toString());
    }
}