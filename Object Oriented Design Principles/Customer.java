package oops5;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Order> orders;

    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    public void placeOrder(ArrayList<Product> products) {
        Order order = new Order(this, products);
        orders.add(order);
        System.out.println(name + " placed a new order with " + products.size() + " products.");
    }

    public void viewOrders() {
        System.out.println("\nOrders of " + name + ":");
        for (Order o : orders) {
            o.showOrderDetails();
        }
    }
}
