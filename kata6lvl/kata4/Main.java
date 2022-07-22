import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println(whoLikesIt(10, 1, 1, 1, 1));
        System.out.println(Root.showRoot(874));
    }

    public static int whoLikesIt(int...  numbers) {
        HashMap<Integer, Integer> findOdd = new HashMap<>();
        for (int s : numbers) {
            if(findOdd.get(s) == null) {
                findOdd.put(s, 1);
            }
            else findOdd.put(s, findOdd.get(s)+1);
        }
        for (int key : findOdd.keySet()) {
            if (findOdd.get(key)%2 != 0) {
                return key;
            }
        }
        return 0;
    }
}



