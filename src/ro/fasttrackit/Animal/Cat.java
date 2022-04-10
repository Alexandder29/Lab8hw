package ro.fasttrackit.Animal;

public class Cat implements Animal {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String talk() {
        return name + " says: meeoooow";
    }

    @Override
    public String walk() {
        return name + "'s walking";
    }

    @Override
    public String eat() {
        return name + "'s eating whiskas";
    }
}
