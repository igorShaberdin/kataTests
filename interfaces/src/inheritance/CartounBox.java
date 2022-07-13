package inheritance;

public class CartounBox extends Box {
    double massa;

    public CartounBox() {
        this.massa = 10;
    }

    public CartounBox(double height, double width, double length, double massa) {
        super(height, width, length);
        this.massa = massa;
    }

    public CartounBox(Box another, double massa) {
        super(another);
        this.massa = massa;
    }

    public CartounBox(double size, double massa) {
        super(size);
        this.massa = massa;
    }

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.print("massa: " + massa);
    }
}
