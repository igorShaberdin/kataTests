import java.util.Arrays;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println(toJadenCase("bitcoin take over the world maybe who knows perhaps"));
    }

    public static int toJadenCase(String str) {
        int min = Integer.MAX_VALUE;
        String[] array = str.split(" ");
        int[] count = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            count[i] = array[i].length();
        }
        for (int j : count) {
            if (j < min) {
                min = j;
            }
        }
        return min;
    }
}


