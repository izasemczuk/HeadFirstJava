package AnimalKingdom;

public abstract class Canine extends Animal {

    public Canine() {
        System.out.println("Canine just made an object of Canine class.");
    }

    public Canine(String name, int age, String breed) {
        super(name, age, breed);
        System.out.println("Canine went to Animal with given parameters.");
    }

    @Override
    void sleep() {
        System.out.println(this.getName() + " does Canine.sleep(): (dreaming)");
    }

}
