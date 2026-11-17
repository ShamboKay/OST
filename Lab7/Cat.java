package Lab7;

public class Cat extends Animal {
    private String colour;

    public Cat(String name, int age, String colour) {
        super(name, age);
        this.colour = colour;
    }

    @Override
    public String toString() {
        return super.toString() + ", Colour: " + colour;
    }
}
