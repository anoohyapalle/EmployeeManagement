import java.util.LinkedList;

public class OrderTracking {
    private LinkedList<Order> orders = new LinkedList<>();

    public void addOrder(Order order) {
        orders.add(order);
    }

    public Order processOrder() {
        return orders.poll();
    }

    public void displayOrders() {
        System.out.println("Current Orders:");
        for (Order order : orders) {
            System.out.println(order);
        }
    }
}
