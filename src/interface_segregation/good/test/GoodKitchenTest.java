package interface_segregation.good.test;

import interface_segregation.good.Kitchen;
import interface_segregation.good.Order;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GoodKitchenTest {

    @Test
    public void TestKitchenFry() throws Exception {
        Kitchen k = new Kitchen();
        Order order = new Order(true, false);
        assertEquals("stake", k.cookOrder(order).getName());
    }

    @Test
    public void TestKitchenGrill() throws Exception {
        Kitchen k = new Kitchen();
        Order order = new Order(false, true);
        assertEquals("barbecue", k.cookOrder(order).getName());
    }

}