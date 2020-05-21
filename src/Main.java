import java.util.*;

import dependency_inversion.good.*;
import interface_segregation.good.Kitchen;
import interface_segregation.good.Order;
import liskov_substitution.good.*;

public class Main {

    public static void main(String[] args) throws Exception {



        // Interface Segregation Example
        System.out.println("Interface segregation principle violation");
        Kitchen kitchen = new Kitchen();
        Order order1 = new Order(true, false);
        Order order2 = new Order(false, true);
        System.out.println(kitchen.cookOrder(order1).getName());
        System.out.println(kitchen.cookOrder(order2).getName());

        System.out.println();

        // Liskov Substitution Example
        System.out.println("Liskov substitution principle violation:");
        List<Database> cnt = new ArrayList<Database>();
        cnt.add(new CorporateCustomer("Lola"));
        cnt.add(new IndividualCustomer("Kola"));
        cnt.add(new Subscriber("Sola"));
        System.out.println("Customers that are connected to database:");
        for(int i = 0; i < cnt.size(); ++i){
            System.out.println(cnt.get(i).addToDatabase());
        }
        List<Cashback> tnc = new ArrayList<Cashback>();
        tnc.add(new CorporateCustomer("Bala"));
        tnc.add(new IndividualCustomer("Jora"));
        System.out.println("Customers that are received cashback");
        for(int i = 0; i < tnc.size(); ++i){
            System.out.println(tnc.get(i).receiveCashback());
        }

        System.out.println();

        // Dependency Inversion Example
        System.out.println("Dependency Inversion Principle violation:");
        Connectable a = new MySQLDatabase();
        Connect b = new DatabaseHandler(a);
        b.press();
        b.press();

        Connectable aa = new OracleDatabase();
        Connect bb = new DatabaseHandler(aa);
        bb.press();
        bb.press();
    }
}