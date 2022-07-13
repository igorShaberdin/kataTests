package inheritance;

public class Cat extends catFamily {
    public Cat() {
        super(4, 2, false);
    }
    @Override
    public void eat () {
        super.eat();
        System.out.println("mays");
    }
}
