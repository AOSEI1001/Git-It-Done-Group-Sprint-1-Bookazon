import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public abstract class User {
    
    private final String userName;
    protected final Cart cart;
    protected final ArrayList<Order> orders;

    private ShippingInfo shippingInfo;
    


    public User(String userName){
        this.userName = userName;
        this.cart = new Cart();
        this.orders = new ArrayList<>();
        this.shippingInfo = new ShippingInfo();

    }

    public String getName(){
        return userName;
    }

    public void setShippingInfo(ShippingInfo info){
        this.shippingInfo = info;
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
        order.setOrderStatus("Order Placed");
        order.setDateCreated(LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        order.setDateShipped(LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        System.out.println("\n");
        order.setShippingInfo(this.shippingInfo);
        orders.add(order);
        

        
    }

    protected abstract double getDiscount();
}
