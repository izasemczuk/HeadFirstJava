package AnimalKingdom;

public abstract class Feline extends Animal {

    public Feline() {
        System.out.println("Making an object of Feline class.");
    }

    public Feline(String name, int age, String breed) {
        super(name, age, breed);
    }

    abstract public void purr();

    @Override
    public void eat() {
        System.out.println(this.getName() + " does Feline.eat(): Om nom nom nom.");
    }

    @Override
    public void roam() {
        System.out.println(this.getName() + " does Feline.roam(): Naaaaah, don't wanna move a bit.");
    }


}
