package Lab8;

public class Triangle extends TwoDShape {
    private double base;
    private double height;

    public Triangle(String name, String colour, double base, double height) {
        super(name, colour);
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }

    @Override
    public String toString() {
        return super.toString() + "\nBase = " + base + "\nHeight = " + height;
    }
}
