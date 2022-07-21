
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println(toJadenCase("ATTGC"));
    }

    public static String toJadenCase(String str) {
        HashMap<Character, Character> map = new HashMap<>();
        map.put('A', 'T');
        map.put('T', 'A');
        map.put('G', 'C');
        map.put('C', 'G');
        String res = "";
        for (Character s : str.toCharArray()) {
            res += map.get(s);
        }
        return res;
    }
}


