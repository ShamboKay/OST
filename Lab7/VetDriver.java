package Lab7;

public class VetDriver {
    public static void main(String[] args) {
        Vet vet = new Vet("Dr. Sarah");
        Dog dog = new Dog("Buddy", 4, "Golden Retriever");
        Cat cat = new Cat("Whiskers", 2, "Tabby");

        vet.vaccinate(dog);
        System.out.println();
        vet.vaccinate(cat);
    }
}
