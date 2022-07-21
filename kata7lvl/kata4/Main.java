
public class Main {
    public static void main(String[] args) {
        System.out.print(test(9119));
    }
    public static int test(int n) {
        int[] array = new int[4];
        for(int i = 0; i < array.length; i++) {
            array[i] += n%10;
            n/=10;
        }
        String numbers = "";
        for(int i : array) {
            numbers = i*i + numbers;
        }
        return (Integer.parseInt(numbers));
    }
}
