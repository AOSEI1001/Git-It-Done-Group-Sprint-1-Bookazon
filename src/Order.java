import java.util.ArrayList;

public class Order {
    private String dateCreated;
    private String dateShipped;
    private User userName;
    private String orderStatus;
    private Address shippingAddress;
    private Address billingAddress;
    
    private ArrayList<CartItem> items;
    private double orderPrice;

    public Order(Cart cart) {
        this.items = cart.getItems();
        this.orderPrice = calculatePrice(userName);
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

    public void setUserName(User user) {
        this.userName = user;
    }

    public void printOrderDetails() {
        System.out.println("Order Details:");
        System.out.println("Date Created: " + dateCreated);
        System.out.println("Date Shipped: " + dateShipped);
        System.out.println("User Name: " + userName);
        System.out.println("Order Status: " + orderStatus);
        System.out.println("Shipping Address: " + this.shippingAddress);
        System.out.println("Shipping Address: " + this.billingAddress);
        System.out.println("Order Price: $" + this.orderPrice);
    }

    public double calculatePrice(User user) {
        double totalPrice = 0.0;
        for (CartItem item : items) {
            totalPrice += item.getTotalPrice();
        }
        totalPrice = user.getDiscount() * totalPrice;
        return totalPrice;
    }
}