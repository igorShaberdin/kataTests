import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i =0; i < 5; i++) {
            numbers.add(i);
        }
        ArrayList<String> names = getEmployees();
        ArrayList<String> result = new ArrayList<>();
        for (int i = 0; i < numbers.size(); i++) {
            result.add(names.get(i) + " - " + numbers.get(i));
        }
        for (String s : result) {
            System.out.println(s);
        }

    }
    public static ArrayList<String> getEmployees() {
        ArrayList<String> employee = new ArrayList<>();
        employee.add("Miko");
        employee.add("Hiko");
        employee.add("Liko");
        employee.add("Giko");
        employee.add("Goblin");
        return employee;
    }
}
