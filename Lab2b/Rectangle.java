public class Rectangle {

    // Attributes
    private double length;
    private double width;

    // Constructor
    public Rectangle() {
        length = 1;
        width = 1;
    }

    // Set length
    public void setLength(double length) {
        if (length > 0.0 && length <= 40.0) {
            this.length = length;
        }
    }

    // Get length
    public double getLength() {
        return length;
    }

    // Set width
    public void setWidth(double width) {
        if (width > 0.0 && width <= 40.0) {
            this.width = width;
        }
    }

    // Get width
    public double getWidth() {
        return width;
    }

    // Q2: Calculate area
    public double getArea() {
        return length * width;
    }

    // Q2: Calculate perimeter
    public double getPerimeter() {
        return 2 * (length + width);
    }

    // Q3: Print rectangle using *
    public void printRectangle() {

        // Print the top edge
        for (int i = 0; i < width; i++) {
            System.out.print("*");
        }

        System.out.println();

        // Print the middle rows
        for (int i = 0; i < length - 2; i++) {

            System.out.print("*");

            for (int j = 0; j < width - 2; j++) {
                System.out.print(" ");
            }

            if (width > 1) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Print the bottom edge
        if (length > 1) {
            for (int i = 0; i < width; i++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    // toString method
    @Override
    public String toString() {
        return "Length = " + length + ", Width = " + width;
    }
}