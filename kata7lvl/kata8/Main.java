import static java.util.Arrays.stream;

public class Main {
    public static void main(String[] args) {
        System.out.println(highAndLow("parents"));
    }

    public static String highAndLow(String word) {
        String[] s = word.split("");
        int n = s.length;
        int x;
        if (n % 2 == 0) {
            x = n / 2;
            return s[x - 1] + s[x];
        } else if (n % 2 != 0) {
            x = n / 2;
            return s[x];
        }
        return word;
    }
}











