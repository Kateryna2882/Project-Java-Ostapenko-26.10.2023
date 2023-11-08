import java.util.LinkedList;
import java.util.Queue;

public class CoffeeOrderBoard {
    private static int totalOrder = 1;
    private final Queue<Order> orders;

    public CoffeeOrderBoard() {
        this.orders = new LinkedList <>();
    }

    public void add(String customerName) {
        Order newOrder = new Order(totalOrder, customerName);
        orders.add(newOrder);
        totalOrder++;
    }

    public Order deliver() {
        return orders.poll();
    }

    public Order deliver(int number) {
        if (orders.isEmpty()) {
            return null;
        }
        if (orders.element().getOrderNumber() == number) {
            return orders.poll();
        }
        for (Order order : orders)
            if (order.getOrderNumber() == number) {
                orders.remove(order);
                return order;
            }
        return null;
//    }
//    return null;
}
    public void draw() {
        System.out.println("*********************************************************************************");
        System.out.println("Num | Name ");
        for (Order order : orders) {
            System.out.println(order.getOrderNumber() + " | " + order.getCustomerName());
        }
    }
}
