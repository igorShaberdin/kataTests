package inheritance;

public class Box {
    protected double height;
    protected double length;
    protected double width;

    public Box() {
        this(10);
    }
    public Box(double height, double width, double length) {
        this.width = width;
        this.length = length;
        this.height = height;
    }
    public Box(Box another) {
        this(another.height, another.width, another.length);
    }
    public Box copy() {
        return new Box(this.height, this.width, this.length);
    }
    public void showInfo() {
        System.out.println("length: " + length + " height: " + height + " width: " + width);
    }
    public Box(double size) {
        this(size, size, size);
    }
}
