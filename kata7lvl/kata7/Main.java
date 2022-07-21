import java.util.IntSummaryStatistics;
import static java.util.Arrays.stream;

public class Main {
    public static void main(String[] args) {
        System.out.println(highAndLow("2 3 -4 5 7 23"));
    }

    public static String highAndLow(String numbers) {
        IntSummaryStatistics result = stream(numbers.split(" ")).mapToInt(Integer::parseInt).summaryStatistics();
        return result.getMax() + " " + result.getMin();
    }
}










