import java.util.ArrayList;

/**
 * Bookazon is a simple online bookstore system that manages users and inventory.
 */
public class Bookazon {

  private Inventory inventory;
  private ArrayList<User> userBase;

  /**
   * Constructs a new Bookazon system with an empty user base and inventory.
   */
  public Bookazon() {
    userBase = new ArrayList<>();
    inventory = new Inventory();
  }

  /**
   * Adds a user to the Bookazon system.
   *
   * @param user the user to add
   */
  public void addUser(User user) {
    userBase.add(user);
  }

  /**
   * Returns the user at the specified index.
   *
   * @param userIndex the index of the user
   * @return the User object
   */
  public User getUser(int userIndex) {
    return userBase.get(userIndex);
  }

  /**
   * Removes a user from the Bookazon system.
   *
   * @param user the user to remove
   */
  public void removeUser(User user) {
    userBase.remove(user);
  }

  /**
   * Prints the names of all users in the system.
   */
  public void viewUsers() {
    for (User person : userBase) {
      System.out.println(person.getName());
    }
  }

  /**
   * Main method demonstrating the functionality of Bookazon.
   *
   * @param args command-line arguments
   */
  public static void main(String[] args) {

    Bookazon bookazon = new Bookazon();

    // Create users first, so ShippingInfo is close to usage
    SubscriptionNormal alice = new SubscriptionNormal("Alice");
    SubscriptionGold bob = new SubscriptionGold("Bob");
    bookazon.addUser(alice);
    bookazon.addUser(bob);

    // Create inventory items
    bookazon.inventory.addItem(new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925, 9.99, true));
    bookazon.inventory.addItem(new Book("To Kill a Mockingbird", "Harper Lee", 1960, 7.99, false));
    bookazon.inventory.addItem(new Book("1984", "George Orwell", 1949, 8.99, true));
    bookazon.inventory.addItem(new AudioBook("Love Hurts", 1987, 32.90, "Georgia Miller", "Arthur Miller", 300));
    bookazon.inventory.addItem(new Ebook("Praire Winds", "Lohan Green", 1978, 25.67, false, null));
    bookazon.inventory.addItem(new DVD("Take Me Back", 15.54, 2005, "Freeman Morgan", 400));

    // View item in inventory
    bookazon.inventory.getItem(3).printDetails();

    // Add books to Alice's cart
    alice.addToCart(bookazon.inventory.getItem(5), 1);
    alice.addToCart(bookazon.inventory.getItem(1), 2);

    // View cart
    alice.viewCart();

    // Set shipping address and billing address
    ShippingInfo shippingInfo = new ShippingInfo();
    shippingInfo.setShippingAddress(new Address("123 Main St", "", "Springfield", "IL", "62701", "USA"));
    shippingInfo.setBillingAddress(new Address("456 Oak Ave", "Apt 2", "Springfield", "IL", "62702", "USA"));
    alice.setShippingInfo(shippingInfo);

    // Checkout
    alice.checkout();

    // View order details
    alice.viewOrders();
  }
}
