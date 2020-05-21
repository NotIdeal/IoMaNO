package liskov_substitution.good;

public class Subscriber implements Database{
    String name;
    final String customerType = "Subscriber";
    public Subscriber(String name){
        this.name = name;
    }
    public String addToDatabase() {
        return (customerType + " " + this.name +  " added to database");
    }
}