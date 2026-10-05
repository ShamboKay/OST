public class RectangleDriver {

    public static void main(String[] args) {

        // Create Rectangle object
        Rectangle rectangle = new Rectangle();

        // Test default values
        System.out.println("Default rectangle:");
        System.out.println(rectangle);
        System.out.println();

        // Test setters
        rectangle.setLength(5);
        rectangle.setWidth(10);

        // Test getters
        System.out.println("Length: " + rectangle.getLength());
        System.out.println("Width: " + rectangle.getWidth());

        // Test toString()
        System.out.println(rectangle);

        // Q2: Test area and perimeter
        System.out.println("Area: " + rectangle.getArea());
        System.out.println("Perimeter: " + rectangle.getPerimeter());

        System.out.println();

        // Q3: Rectangle with width 5 and length 7
        Rectangle rectangle1 = new Rectangle();

        rectangle1.setWidth(5);
        rectangle1.setLength(7);

        System.out.println("Rectangle 1:");
        rectangle1.printRectangle();

        System.out.println();

        // Rectangle with width 10 and length 4
        Rectangle rectangle2 = new Rectangle();

        rectangle2.setWidth(10);
        rectangle2.setLength(4);

        System.out.println("Rectangle 2:");
        rectangle2.printRectangle();
    }
}