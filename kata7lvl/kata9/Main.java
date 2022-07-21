import static java.util.Arrays.stream;

public class Main {
    public static void main(String[] args) {
        System.out.println(highAndLow(25));
    }

    public static boolean highAndLow(int n) {
        boolean result = (Math.sqrt(n) % 1 == 0);
        return result;
    }
}











