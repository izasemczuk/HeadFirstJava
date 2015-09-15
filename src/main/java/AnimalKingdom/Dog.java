package AnimalKingdom;

public class Dog extends Canine implements Pet {

    public Dog() {
        System.out.println("Dog just made an object of Dog class.");
    }

    public Dog(String name, int age, String breed) {
        super(name, age, breed);
        System.out.println("Dog went to Canine with given parameters.");
    }

    @Override
    void eat() {

    }

    @Override
    void roam() {

    }

    @Override
    void makeNoise() {
        System.out.println(this.getName() + " does Dog.makeNoise(): Woof woof!");
    }

    public void play() {

    }

    public void beCute() {

    }
}
