import java.util.*;

public class Main {
    public static void main(String[] args) {
        for (var element : filterList(List.of(1, 2, "a", "b"))){
            System.out.print(element);
        }
    }

    public static List<Object> filterList(final List<Object> list) {
        List<Object> answer = new ArrayList<>();
        for (var element : list) {
            if (element instanceof Integer) {
                answer.add(element);
            }
        }
        return answer;
    }
}











