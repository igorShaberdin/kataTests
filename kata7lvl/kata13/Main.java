import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        System.out.println(toJadenCase("abcd"));
    }

    public static String toJadenCase(String phrase) {
        String[] array = phrase.split("");
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i].toUpperCase() + array[i].repeat(i).toLowerCase();
        }
        String args = String.join(" ", array);
        return args;
    }
}


