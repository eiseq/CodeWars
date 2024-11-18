package codewars.kyu4;

import java.util.ArrayList;
import java.util.List;

public class TimeFormatter {
    public enum TimeUnit {
        YEAR(31536000, "year"),
        DAY(86400, "day"),
        HOUR(3600, "hour"),
        MINUTE(60, "minute"),
        SECOND(1, "second"),
        NOW(0, "now");

        private final int seconds;
        private final String name;

        TimeUnit(int seconds, String name) {
            this.seconds = seconds;
            this.name = name;
        }

        public int getSeconds() {
            return seconds;
        }

        public String getName(int value) {
            return value + " " + name + (value > 1 ? "s" : "");
        }
    }

    public static String formatDuration(int seconds) {
        if (seconds == 0) {
            return TimeUnit.NOW.name;
        }
        List<String> formattedParts = new ArrayList<>();
        for (TimeUnit unit : TimeUnit.values()) {
            if (unit != TimeUnit.NOW) {
                int unitValue = seconds / unit.getSeconds();
                if (unitValue > 0) {
                    formattedParts.add(unit.getName(unitValue));
                    seconds %= unit.getSeconds();
                }
            }
        }
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < formattedParts.size(); i++) {
            if (i > 0) {
                result.append(i == formattedParts.size() - 1 ? " and " : ", ");
            }
            result.append(formattedParts.get(i));
        }
        return result.toString();
    }
}
