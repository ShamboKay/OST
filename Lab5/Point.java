package Lab5;

public class Point {
    // Protected variables accessible within the class, subclasses, and package
    protected int x;
    protected int y;

    // Constructor required by the driver program
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getter and Setter for x
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    // Getter and Setter for y
    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    // toString method to display Point details nicely
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
