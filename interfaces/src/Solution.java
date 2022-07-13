import inheritance.*;
import inheritance.Cat;
import interfaces.*;

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Lion lion = new Lion();
        CartounBox box = new CartounBox(10, 15);
        Box box1 = new Box(10);
        triloge triloge = new triloge(5, 6, 5);
        triloge.showPerimetr();
        strein strein = new strein(3, 2);
        strein.showPerimetr();
        Director chel3 = new Director();
        chel3.forse(new Worker() {
            @Override
            public void work() {
                System.out.println("Slave");
            }
        });
        Client client = new Client();
        WaitorBob waitorBob = new WaitorBob();
        client.makeOrder(waitorBob, "chit");
    }
}


