package ro.fasttrackit.Animal;

public class Dog implements Animal {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String talk() {
        return name + " says: woof woof.";
    }

    @Override
    public String walk() {
        return name + " is walking.";
    }

    @Override
    public String eat() {
        return name + " is eating.";
    }
}
