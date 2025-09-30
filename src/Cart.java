import java.util.ArrayList;

/**
 * Represents a shopping cart that holds CartItems.
 */
public class Cart {

  private ArrayList<CartItem> items;

  /**
   * Constructs an empty shopping cart.
   */
  public Cart() {
    items = new ArrayList<>();
  }

  /**
   * Adds an item to the cart.
   *
   * @param item the CartItem to add
   */
  public void addItem(CartItem item) {
    items.add(item);
  }

  /**
   * Removes an item from the cart.
   *
   * @param item the CartItem to remove
   */
  public void removeItem(CartItem item) {
    items.remove(item);
  }

  /**
   * Updates the quantity of a specific item in the cart.
   *
   * @param item the CartItem to update
   * @param quantity the new quantity
   */
  public void updateQuantity(CartItem item, int quantity) {
    for (CartItem cartItem : items) {
      if (cartItem.equals(item)) {
        cartItem.setQuantity(quantity);
        break;
      }
    }
  }

  /**
   * Prints the details of all items in the cart.
   */
  public void viewCartDetails() {
    System.out.println("Cart Details:");
    for (CartItem item : items) {
      System.out.println(item.getName() + " - Quantity: " + item.getQuantity());
    }
    System.out.println();
  }

  /**
   * Returns the list of items in the cart.
   *
   * @return ArrayList of CartItems
   */
  public ArrayList<CartItem> getItems() {
    return items;
  }
}
