import java.util.Arrays;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println(toJadenCase("moOse"));
    }

    public static boolean toJadenCase(String str) {
        str = str.toLowerCase();
        String[] array = str.split("");
        Arrays.sort(array);
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i].equals(array[i + 1])) {
                return false;
            }
        }
        return true;
    }
}


