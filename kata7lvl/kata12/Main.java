import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println(toJadenCase(""));

    }

    public static String toJadenCase(String phrase) {
        if (phrase == null) {
            return null;
        }
        else if (phrase == "") {
            return null;
        }
        else {
            ArrayList<String> list = new ArrayList<>();
            for (String s : phrase.split(" ")) {
                list.add(s.substring(0, 1).toUpperCase() + s.substring(1));
            }

            String args = String.join(" ", list);
            return args;
        }
    }
}

