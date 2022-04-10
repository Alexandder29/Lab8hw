package ro.fasttrackit.Animal;

public class Chicken implements Animal {
    private String name;

    public Chicken (String name) {
        this.name = name;
    }

    @Override
    public String talk() {
        return name + " is talking.";
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
