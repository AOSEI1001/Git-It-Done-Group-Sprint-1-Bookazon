import java.util.ArrayList;

public abstract class User {
    
    private final String userName;
    protected final Cart cart;
    protected final ArrayList<Order> orders;

    public User(String userName){
        this.userName = userName;
        this.cart = new Cart();
        this.orders = new ArrayList<>();
    }

    public String getName(){
        return userName;
    }

    public void viewCart(){
        cart.viewCartDetails();
    }

    public void addToCart(MediaType media, int quantity){
        cart.addItem(new CartItem(media.getTitle(), media.getPrice(), quantity));
    }

    public void removeFromCart(MediaType media){
        for (CartItem item : cart.getItems()) {
            if (item.getName().equals(media.getTitle())) {
                cart.getItems().remove(item);
                break;
            }
        }

    }

    public void viewOrders(){
        for (Order order : orders) {
            order.printOrderDetails(this);
        }
    }

    public void checkout() {
        Order order = new Order(cart, this);
        System.out.println("\n");
        order.setOrderStatus("Order Placed");
        order.setDateCreated("2024-01-01");
        //order.setUserName(userName);
        orders.add(order);
        System.out.println("\n");
        // add shipping and bill address
    }

    protected abstract double getDiscount();
}
