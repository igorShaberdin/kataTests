import java.util.Arrays;
import java.util.Collections;

import static java.util.Arrays.*;
import static java.util.Arrays.stream;

public class Main {
    public static void main(String[] args) {
        System.out.println(highAndLow(325522368));
    }

    public static int highAndLow(int num) {
        String[] numbers = String.valueOf(num).split("");
        Arrays.sort(numbers, Collections.reverseOrder());
        String m = String.join("", numbers);
        return Integer.parseInt(m);
    }
}











