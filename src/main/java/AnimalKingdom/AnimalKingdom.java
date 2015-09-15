package AnimalKingdom;

public class AnimalKingdom {
    public static void main(String[] args) {
        Cat cat = new Cat("Garfield",2,"siberian");
        cat.purr();
        cat.eat();
        cat.sleep();
        Dog dog = new Dog("Burek",4,"beagle");
        dog.sleep();
        dog.makeNoise();
    }
}
