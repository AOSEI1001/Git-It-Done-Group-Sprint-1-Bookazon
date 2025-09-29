
import java.util.ArrayList;

public abstract class User {
    
    private final String userName;
    protected final Cart cart;
    protected final ArrayList<Order> orders;
    private Address shippingAddress;
    private Address billingAddress;


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


    public void addToCart(Book book, int quantity){
        cart.addItem(new CartItem(book.getTitle(), book.getPrice(), quantity));
    }

    public void removeFromCart(Book book){
        for (CartItem item : cart.getItems()) {
            if (item.getName().equals(book.getTitle())) {
                cart.getItems().remove(item);
                break;
            }
        }

    }

    public void viewOrders(){
        for (Order order : orders) {
            order.printOrderDetails();
        }
    }

    public void checkout() {
        Order order = new Order(cart);
        order.setOrderStatus("Order Placed");
        order.setDateCreated("2024-01-01");
        order.setUserName(this.userName);
        orders.add(order);
        // add shipping and bill address
    }


    protected abstract double getDiscount();
}
