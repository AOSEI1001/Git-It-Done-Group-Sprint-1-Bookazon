
import java.util.ArrayList;

public class Bookazon {

    private Inventory inventory;
    private ArrayList<User> userBase;

    public Bookazon(){
        userBase = new ArrayList<>();
        inventory = new Inventory();
    }

    public void addUser(User user){
        userBase.add(user);
    }

    public User getUser(int userIndex){
        return userBase.get(userIndex);
    }

    public void removeUser(User user){
        userBase.remove(user);
    }

    public void viewUsers(){
        for (User person : userBase){
            System.out.println(person.getName());
        }

    }
 
    public static void main(String[] args) {
        
        Bookazon bookazon = new Bookazon();

        ShippingInfo shippingInfo = new ShippingInfo();
        
        // create books
        bookazon.inventory.addItem(new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, 9.99, true));
        bookazon.inventory.addItem(new Book("To Kill a Mockingbird", "Harper Lee", 1960, 7.99, false));
        bookazon.inventory.addItem(new Book("1984", "George Orwell", 1949, 8.99, true));
        bookazon.inventory.addItem(new AudioBook("Love Hurts", 1987, 32.90, "Georgia Miller", "Arthur Miller", 300));
        bookazon.inventory.addItem(new Ebook("Praire Winds", "Lohan Green", 1978, 25.67, false, null));
        bookazon.inventory.addItem(new DVD("Take Me Back", 15.54, 2005, "Freeman Morgan", 400));


        // view item in inventory
        bookazon.inventory.getItem(3).printDetails();

        // create users
        bookazon.addUser(new SubscriptionNormal("Alice"));
        bookazon.addUser(new SubscriptionGold("Bob"));

        // add books to cart
        bookazon.getUser(0).addToCart(bookazon.inventory.getItem(5), 1);
        bookazon.getUser(0).addToCart(bookazon.inventory.getItem(1), 2);

        // view cart
        bookazon.getUser(0).viewCart();

        // set shipping address and billing address
        shippingInfo.setShippingAddress(new Address("123 Main St", "", "Springfield", "IL", "62701", "USA"));
        shippingInfo.setBillingAddress(new Address("456 Oak Ave", "Apt 2", "Springfield", "IL", "62702", "USA"));

        bookazon.getUser(0).setShippingInfo(shippingInfo);


        // checkout
        bookazon.getUser(0).checkout();

        // view order details
        bookazon.getUser(0).viewOrders();
        
    }
}
