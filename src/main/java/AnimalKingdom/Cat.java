package AnimalKingdom;

public class Cat extends Feline implements Pet {

    public Cat() {
        System.out.println("Cat just made an object of Cat class.");
    }

    public Cat(String name, int age, String breed) {
        super(name, age, breed);
    }

    @Override
    public void purr() {
        System.out.println(this.getName() + " does Cat.purr(): Mrrrrrr.");
    }

    @Override
    void sleep() {
        System.out.print(this.getName() + " does Cat.sleep(): ");
        this.purr();
    }

    @Override
    void makeNoise() {
        System.out.println(this.getName() + " does Cat.makeNoise(): Meeeoooooow.");
    }

    public void play() {
        System.out.println(this.getName() + " does Pet.Cat.play().");
    }

    public void beCute() {
        System.out.println(this.getName() + " does Pet.Cat.beCute().");
    }
}
