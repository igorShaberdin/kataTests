

public class Main {
    public static void main(String[] args) {
        System.out.println(whoLikesIt("Jack", "Lilo", "Bop", "Folk"));
    }

    public static String whoLikesIt(String... names) {
        for (String s : names) {
            if (s == "") {
                return " no one likes this";
            } else if (names.length == 1) {
                return names[0] + " likes this";
            }
            else if (names.length == 2) {
                return names[0] + " and " + names[1] + " like this";
            }
            else if (names.length == 3) {
                return names[0] + ", " + names[1] + " and " + names[2] + " like this";
            }
            else {
                return names[0] + ", " + names[1] + " and " + (names.length-2) + " others like this";
            }
        }
        return "no one likes this";
    }
}




