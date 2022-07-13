package inheritance;

public abstract class Shape {
    private int a;
    private int b;

    public final int getA() {
        return a;
    }

    public final int getB() {
        return b;
    }

    Shape(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public abstract int perimetr();
    public void showPerimetr() {
         System.out.println(perimetr());
    }
}
