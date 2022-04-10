package ro.fasttrackit.Company;

public class Email {
    private Advertisement company;

    public Email(Advertisement company) {
        this.company = company;
    }

    public String publicity() {
        return "You received an e-mail." + company.identify() + " and " + company.talk();
    }
}
