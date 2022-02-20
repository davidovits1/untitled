import java.util.ArrayList;
import java.util.Arrays;

public class SeasonUtil {
    public static final Season[] SEASONS = Season.values();

    public static void sortSeasonable(Comparable[] seasonables) {
        Arrays.sort(seasonables);
    }

    static String reportAll(Seasonable[] seasonables) {
        String seasonableStr = "";

        for (var seasonable : seasonables) {
            seasonableStr += seasonable + " " + System.lineSeparator();
        }

        return seasonableStr;
    }
}
