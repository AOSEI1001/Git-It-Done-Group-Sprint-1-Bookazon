import java.util.ArrayList;

public class Order {
    private String dateCreated;
    private String dateShipped;
    private String orderStatus;
    private ShippingInfo shippingInfo;
    private User user;
    
    private ArrayList<CartItem> items;
    private double orderPrice;

    public Order(Cart cart, User user) {
        this.items = cart.getItems();
        this.orderPrice = calculatePrice(user);
    }

    public void setOrderStatus(String status) {
        this.orderStatus = status;
    }

    public void setDateCreated(String date) {
        this.dateCreated = date;
    }

    public void setDateShipped(String date) {
        this.dateShipped = date;
    }

    public void setShippingInfo(ShippingInfo info){
        this.shippingInfo = info;
    }

    
    public void printOrderDetails(User user) {
        System.out.println("Order Details:");
        System.out.println("\n");

        System.out.println("Date Created: " + dateCreated);
        System.out.println("Date Shipped: " + dateShipped);
        System.out.println("Name: " + user.getName());
        System.out.println("Order Status: " + orderStatus);
        System.out.println("Shipping Address: " + shippingInfo.getShippingAddress());
        System.out.println("Billing Address: " + shippingInfo.getBillingAddress());
        System.out.println("Order Price: $" + orderPrice);
        System.out.println("Discount:"+ user.getDiscount());
    }

    public double calculatePrice(User user) {
        double totalPrice = 0.0;
        for (CartItem item : items) {
            totalPrice += item.getTotalPrice();
        }
        totalPrice = (1 - user.getDiscount()) * totalPrice;
        return totalPrice;
    }
}