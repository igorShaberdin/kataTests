package inheritance;

public class strein extends Shape{
    public strein(int a, int b) {
        super(a, b);
    }

    @Override
    public int perimetr() {
        return (getA() + getB())*2;
    }
}
