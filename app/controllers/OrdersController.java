package controllers;

import models.Order;
import play.data.Form;
import play.data.FormFactory;
import play.mvc.Controller;
import play.mvc.Result;
import views.html.Orders.index;
import views.html.Orders.show;

import javax.inject.Inject;
import javax.swing.text.AbstractDocument;
import java.util.Set;

/**
 * created by Kristina Mantha, Christopher Lefebvre, Gregory Ramos
 */
public class OrdersController extends Controller {

    @Inject
    FormFactory formFactory;

    //shows all orders
    public Result index(){
        Set<Order> orders = Order.allOrders();

        return ok(index.render(orders));
    }

    //creates an order
    public Result createOrder(){
        Form<Order> orderForm = formFactory.form(Order.class);

        return null;
    }

    //saves the order
    public Result saveOrder(){
        // TODO add information;

        return null;
    }

    //to edit an order
    public Result editOrder(Integer id){
        // TODO add information;

        return null;
    }

    //updates the order
    public Result updateOrder(){
        // TODO add information;

        return null;
    }

    //deletes an order
    public Result deleteOrder(Integer id){
        // TODO add information;

        return null;
    }

    //shows order details
    public Result showOrder(Integer id){
        Order order = Order.orderID(id);
        if(order == null){
            return notFound("Sorry, but the order ID does not exist.");
        }
        return null;
       // return ok(showOrder.render(order));
    }
}
