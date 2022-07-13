package interfaces;

public class WaitorBob implements Waitor {
    @Override
    public void bringOrder(String dish) {
        System.out.println("cheeses, I bring u a " + dish);
    }
}
