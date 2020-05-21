package liskov_substitution.good;

import java.util.Date;

public abstract class Customer implements Database, Cashback{
    String name;
    String customerType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public Customer(String name){
        this.name = name;
    }

    public abstract String addToDatabase();
    public abstract String receiveCashback() throws Exception;
}
