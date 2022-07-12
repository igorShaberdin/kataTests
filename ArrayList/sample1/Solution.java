import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < Names.names().size(); i++) {
            result.add(Names.names().get(i) + " - " + Numbers.numbers().get(i));
        }
        for (String s : result) {
            System.out.println(s);
        }
    }
}

