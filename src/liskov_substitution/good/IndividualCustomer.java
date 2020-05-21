package liskov_substitution.good;

public class IndividualCustomer implements Database, Cashback{
    String name;
    final String customerType = "Individual Customer";
    public IndividualCustomer(String name){
        this.name = name;
    }
    public String addToDatabase() {
        return (customerType + " " + this.name +  " added to database");
    }
    public String receiveCashback() {
        return (customerType + " " + this.name + " received cashback");
    }
}