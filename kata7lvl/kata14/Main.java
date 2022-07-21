public class Main {
    public static void main(String[] args) {
        System.out.println(toJadenCase("zpzpzpp"));
    }

    public static boolean toJadenCase(String str) {
        int countX = 0;
        int countO = 0;
        for (char elements : str.toCharArray()) {
            if (elements == 'x' || elements == 'X') countX++;
            if (elements == 'o' || elements == 'O') countO++;
        }
        if (countO == countX) {
            return true;
        }
        else return false;
    }
}


