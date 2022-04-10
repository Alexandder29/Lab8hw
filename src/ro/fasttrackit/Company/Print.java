package ro.fasttrackit.Company;

public class Print implements Advertisement {
    private String company;


    public Print(String company) {
        this.company = company;
    }

    @Override
    public String identify() {
        return "We are " + company;
    }

    @Override
    public String talk() {
        return "Join our free courses.";
    }
}
