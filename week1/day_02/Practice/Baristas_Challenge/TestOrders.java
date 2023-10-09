import java.util.ArrayList;
public class TestOrders {
    public static void main(String[] args) {
    
        // Menu items
        Item item1 = new Item("mocha",4.5);

        Item item2 = new Item("latte",5.5);

        Item item3 = new Item("drip coffe",3.5);

        Item item4 = new Item("capuccino",6.5);

    
        // Order variables -- order1, order2 etc.
        Order order1 = new Order();
     
        Order order2 = new Order();
 

        Order order3 = new Order("Noah");
        order3.addItem(item1);
        order3.addItem(item2);
        order3.setReady(true);

        Order order4 = new Order("Sam");
        order4.addItem(item3);

        Order order5 = new Order("John");


        // System.out.println(order1);
        // order2.items.add(item1);
        // order2.total = item1.price;

        // order3.items.add(item4);
        // order3.total = item4.price;

        // order4.items.add(item2);
        // order4.total = item2.price;

        // order1.ready = true;

        // order4.items.add(item2);
        // order4.items.add(item2);
        // order4.total += (item2.price)*2;

        // order2.ready = true;

    
        // Application Simulations
        // Use this example code to test various orders' updates
        // System.out.printf("Name: %s\n", order4.getName());
        // System.out.printf("Total: %s\n", order4.total);
        // System.out.printf("Ready: %s\n", order4.getReady());

        order3.display();
        System.out.println(order3.getStatusMessage());
        System.out.println(order3.getOrderTotal());

    }
}
