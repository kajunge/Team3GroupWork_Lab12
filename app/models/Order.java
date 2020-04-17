package models;

import java.util.*;
import java.util.HashSet;

/**
 * created by Kristina Mantha, Christopher Lefebvre, Gregory Ramos
 */
public class Order {
    public Integer id;
    public String senderLastName;
    public String senderFirstName;
    public Integer senderID;
    public String recipientLastName;
    public String recipientFirstName;
    public Integer recipientID;
    public Double transactionAmount;

    public Order(Integer id, String senderLastName, String senderFirstName, Integer senderID,
                 String recipientLastName, String recipientFirstName, Integer recipientID,
                 Double transactionAmount){

        this.id = id;
        this.senderLastName = senderLastName;
        this.senderFirstName = senderFirstName;
        this.senderID = senderID;
        this.recipientLastName = recipientLastName;
        this.recipientFirstName = recipientFirstName;
        this.recipientID = recipientID;
        this.transactionAmount = transactionAmount;
    }

    private static Set<Order> orders;

    static {
        orders = new HashSet<>();
        orders.add(new Order(1, "Hanks", "Tom", 23486, "Wilson","Rita",23487,275.00));
        orders.add(new Order(2, "Mantha", "Kristina", 197903, "Verebes","Peter",198209,300.00));
        orders.add(new Order(3, "Ramos", "Gregory", 34837, "Lefebvre","Christopher",846353,45.00));
        orders.add(new Order(4, "Lefebvre", "Christoper", 846353, "Ramos","Gregory",34837,50.00));
    }

    public static Set<Order> allOrders(){
        return orders;
    }

    public static Order orderID(Integer id){
        for (Order order : orders){
            if(id.equals(order.id)){
                return order;
            }
        }
        return null;
    }

    public static void addOrder(Order order){

        orders.add(order);
    }

    public static boolean deleteOrder(Order order){

        return orders.remove(order);
    }
}
