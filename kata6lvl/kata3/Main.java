

public class Main {
    public static void main(String[] args) {
        System.out.println(whoLikesIt(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }

    public static String whoLikesIt(int[] numbers) {
        String str = "";
        String str1 = "";
        String str2 = "";
        for (int i = 0; i < 3; i++) {
            str += numbers[i];
        }
        for (int i = 3; i < 6; i++) {
            str1 += numbers[i];
        }
        for (int i = 6; i < 10; i++) {
            str2 += numbers[i];
        }
        return String.format("(%s) %s-%s", str, str1, str2);
    }
}



