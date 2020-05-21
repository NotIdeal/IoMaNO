package liskov_substitution.good.test;

import liskov_substitution.good.CorporateCustomer;
import liskov_substitution.good.Customer;
import liskov_substitution.good.IndividualCustomer;
import liskov_substitution.good.Subscriber;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GoodCustomerTest {
    @Test
    public void TestCorporateCustomerDatabase(){
        CorporateCustomer a = new CorporateCustomer("Lola");
        assertEquals("Corporate Customer Lola added to database", a.addToDatabase());
    }
    @Test
    public void TestCustomerCashback(){
        CorporateCustomer a = new CorporateCustomer("Lola");
        assertEquals("Corporate Customer Lola received cashback", a.receiveCashback());
    }
    @Test
    public void TestIndividualCustomerDatabase(){
        IndividualCustomer a = new IndividualCustomer("Lola");
        assertEquals("Individual Customer Lola added to database", a.addToDatabase());
    }
    @Test
    public void TestIndividualCustomerCashback(){
        IndividualCustomer a = new IndividualCustomer("Lola");
        assertEquals("Individual Customer Lola received cashback", a.receiveCashback());
    }
    @Test
    public void TestSubscriberDatabase(){
        Subscriber a = new Subscriber("Lola");
        assertEquals("Subscriber Lola added to database", a.addToDatabase());
    }
}
