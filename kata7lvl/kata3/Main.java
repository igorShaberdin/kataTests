
public class Main {
    public static void main(String[] args) {
        System.out.println(getCount("This website is for losers LOL!"));
    }

    public static String getCount(String str) {
        String word = str.replaceAll("[aueioAUEIO]", "");
        return word;
    }
}
