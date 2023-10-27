import java.util.ArrayList;
import java.util.List;

public class CoffeeOrderBoard {
    private List<Order>orders = new ArrayList<>();
    private int nextOrderNumber=1;
    public void add(Order order){
        order.setOrderNumber(nextOrderNumber);
        orders.add(order);
        nextOrderNumber++;
    }
    public void deliver(){
        if (!orders.isEmpty()){
            Order nextOrder = orders.get(0);
            System.out.println("Deliver ing order : " + nextOrder.getOrderNumber() + " | "
                    + nextOrder.getCustomerName());
            orders.remove(0);
        } else {
            System.out.println("No orders to deliver");
        }
    }
    public void deliver(int orderNumber){
        for (int i = 0; i < orders.size(); i++) {
            Order order = orders.get(i);
            if (order.getOrderNumber() == orderNumber){
                System.out.println("Deliver ing order " + order.getOrderNumber() + " | " + order.getCustomerName());
                orders.remove(i);
                return;
            }

        }
        System.out.println( "Order with number " + orderNumber + " not found. ");
    }
    public void draw (){
        System.out.println("*********************************************************************************");
        System.out.println("Num | Name ");
        for (Order order : orders) {
            System.out.println(order.getOrderNumber() + " | " + order.getCustomerName());
        }
    }
}
