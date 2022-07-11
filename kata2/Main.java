
public class Main {
    public static void main(String[] args) {
        System.out.println(getCount("remarka"));
    }

    public static int getCount(String str) {
        int vowelsCount = 0;
        String[] word = new String[1];
        for (int i = 0; i < word.length; i++) {
            word[i] = str;
        }
        for (String Coun : word) {
            for (int j = 0; j < Coun.length(); j++) {
                switch (Coun.charAt(j)) {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                        vowelsCount++;
                }
            }
        }
        return vowelsCount;
    }
}
