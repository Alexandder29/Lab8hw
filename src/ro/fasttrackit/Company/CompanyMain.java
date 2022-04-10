package ro.fasttrackit.Company;

public class CompanyMain {

    public static void main(String[] args) {
        Facebook it = new Facebook("IT, the New World Order Company.");
        System.out.println(it.identify());
        System.out.println(it.talk());
        System.out.println(it.price(1300));
        System.out.println(it.end());

        Advertisement company = new Facebook("MindHub");
        System.out.println(new Email(company).publicity());

        Print blink = new Print("blInk in The void");
        System.out.println(blink.identify());
        System.out.println(blink.talk());
    }
}
