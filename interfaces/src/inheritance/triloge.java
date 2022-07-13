package inheritance;

public class triloge extends Shape {
    private int c;

    public triloge(int a, int b, int c) {
        super(a, b);
        this.c = c;
    }

    @Override
    public int perimetr() {
        return getA() + getB() + c;
    }
}
