package liskov_substitution.good;

public class CorporateCustomer implements Database, Cashback{
    String name;
    final String customerType = "Corporate Customer";
    public CorporateCustomer(String name){
        this.name = name;
    }
    public String addToDatabase() {
        return (customerType + " " + this.name +  " added to database");
    }

    public String receiveCashback() {
        return (customerType + " " + this.name + " received cashback");
    }
}