import java.util.ArrayList;

public class Numbers {
    public static ArrayList<Integer> numbers() {
        ArrayList<Integer> number = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            number.add(i);
        }
        return number;
    }
}
