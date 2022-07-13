package inheritance;

public class Lion extends catFamily {
    public Lion() {
        super (4, 2, true);
    }

    @Override
    public void eat() {
        super.eat();
        System.out.println("people");
    }
}
