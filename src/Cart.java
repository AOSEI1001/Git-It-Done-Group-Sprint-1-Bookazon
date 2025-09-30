import java.util.ArrayList;

public class Cart {
    private ArrayList<CartItem> items;
    
    public Cart() {
        items = new ArrayList<>();
    }
    
    public void addItem(CartItem item) {
        items.add(item);
    }

    public void removeItem(CartItem item) {
        items.remove(item);
    }
    
    public void updateQuantity(CartItem item, int quantity) {
        for (CartItem cartItem : items) {
            if (cartItem.equals(item)) {
                cartItem.setQuantity(quantity);
                break;
            }
        }
    }
    
    public void viewCartDetails() {
        System.out.println("Cart Details:");
        for (CartItem item : items) {
            System.out.println(item.getName() + " - Quantity: " + item.getQuantity());
        }
        System.out.println("\n");
    }


    
    public ArrayList<CartItem> getItems() {
        return items;
    }

    public void checkout(User user) {
        Order order = new Order(this, user);
        order.setOrderStatus("Order Placed");
        order.setDateCreated("2024-01-01");
        //order.setUserName(userName);
        // add shipping and bill address
    }
    
}
