package Lab5;

public class Circle extends Point {
    // Additional attribute for radius
    private int radius;

    // Constructor initializing coordinates via super class and setting radius
    public Circle(int x, int y, int radius) {
        super(x, y); // Calls the constructor of Point
        this.radius = radius;
    }

    // Getter and Setter for radius
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    // toString method overriding Point's toString to include radius details
    @Override
    public String toString() {
        return "Center = " + super.toString() + "; Radius = " + radius;
    }
}
