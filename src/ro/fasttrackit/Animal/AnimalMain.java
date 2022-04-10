package ro.fasttrackit.Animal;

public class AnimalMain {
    public static void main(String[] args) {
        Cat simba = new Cat("Simba");
        System.out.println(simba.talk());
        System.out.println(simba.walk());
        System.out.println(simba.eat());

        Dog spike = new Dog("Spike");
        System.out.println(spike.walk());
        System.out.println(spike.talk());
        System.out.println(spike.eat());

        Mouse jerry = new Mouse("Jerry");
        System.out.println(jerry.eat());
        System.out.println(jerry.talk());
        System.out.println(jerry.walk());

        Chicken fred = new Chicken("Fred");
        System.out.println(fred.talk());
        System.out.println(fred.eat());
        System.out.println(fred.walk());

        Duck duffy = new Duck("Duffy");
        System.out.println(duffy.talk());
        System.out.println(duffy.eat());
        System.out.println(duffy.walk());
    }
}
