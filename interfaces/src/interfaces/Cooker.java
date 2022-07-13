package interfaces;

public class Cooker implements Driver, Worker {
    @Override
    public void drive() {
        System.out.println("drive the car");
    }
    @Override
    public void work() {
        System.out.println("ok,ok, cooker working");
    }
}
