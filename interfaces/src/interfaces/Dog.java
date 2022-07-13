package interfaces;

public class Dog extends Animal {
    @Override
    public void eat() {
        System.out.println("eat cat");
    }
    public void run() {
        System.out.println("dog runing");
    }
}
