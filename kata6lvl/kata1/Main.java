

public class Main {
    public static void main(String[] args) {
        System.out.println(GetSum(10));
    }

    public static int GetSum(int number) {
        int a = 0;
        if (number < 0) {
            return 0;
        }
        for (int i = 3; i < number; i++) {
            if(i%3 == 0) {
                a += i;
            }
            if(i%5 == 0) {
                a += i;
            }
        }
        return a;
    }
}




