package ro.fasttrackit.Company;

public class Facebook implements Advertisement {
    private String company;

    public Facebook(String company) {
        this.company = company;
    }

    @Override
    public String identify() {
        return "This is " + company;
    }

    @Override
    public String talk() {
        return "We are offering courses of IT since 2001. You can apply for Java, Python and other OOP.";

    }

    String price(int a) {
        return "The cost for following our classes is " + a + "$.";
    }

    public String end() {
        return "For more details, click \"restart\".";
    }
}
