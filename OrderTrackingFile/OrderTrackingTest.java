public class OrderTrackingTest {
    public static void main(String[] args) {
   
        OrderTracking tracking = new OrderTracking();

        tracking.addOrder(new Order(1, "Laptop"));
        tracking.addOrder(new Order(2, "Smartphone"));
        tracking.addOrder(new Order(3, "Tablet"));


        System.out.println("Orders after adding:");
        tracking.displayOrders();

        System.out.println("\nProcessing the first order...");
        Order processedOrder = tracking.processOrder();
        System.out.println("Processed Order: " + processedOrder);

        System.out.println("\nOrders after processing:");
        tracking.displayOrders();
    }
}
