
import java.lang.reflect.Method;
import java.util.HashMap;

import static java.lang.Integer.sum;

public class Main {
    public static void main(String[] args) {
        System.out.println(GetSum(2, 3));
    }

    public static int GetSum(int a, int b) {
        if (a == b) {
            return a;
        } else if (a > b) {
            return a + GetSum(a - 1, b);
        } else {
            return a + GetSum(a + 1, b);
        }
    }
}




