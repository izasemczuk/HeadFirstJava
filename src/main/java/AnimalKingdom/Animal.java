package AnimalKingdom;

public abstract class Animal {

    private String name;
    private int age;
    private String breed;

    public Animal() {
        System.out.println("Animal just made an object of Animal class.");
    }

    public Animal(String name) {
        System.out.println("Animal just made an object of Animal class - named it " + name);
        this.name = name;
    }

    public Animal(String name, int age, String breed) {
        System.out.println("Animal just made an object of Animal class - named it " + name + ", set it's age to " + age + " and breed to " + breed);
        this.name = name;
        this.age = age;
        this.breed = breed;
    }

    abstract void sleep();

    abstract void eat();

    abstract void roam();

    abstract void makeNoise();

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
