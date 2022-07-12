import inheritance.Cat;
import inheritance.Lion;

public class Solution {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Lion lion = new Lion();
        System.out.println(cat.isEatPeople());
        System.out.println(lion.getLegs());
    }
}

