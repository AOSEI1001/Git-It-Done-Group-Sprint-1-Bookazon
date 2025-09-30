/**
 * Represents a book, which is a type of media with a title, author, year published, price,
 * and format (paperback or hardcover).
 */
public class Book extends MediaType {

  private String author;
  private boolean isPaperback;  // true if the book is paperback, false if it is hardcover

  /** 
   * Constructs a Book object with all fields specified. 
   * 
   * @param title         the title of the book
   * @param author        the author of the book
   * @param yearPublished the year the book was published
   * @param price         the price of the book
   * @param isPaperback   true if the book is paperback, false if hardcover
   */
  public Book(String title, String author, int yearPublished, double price, boolean isPaperback) {
    super(title, yearPublished, price);
    this.author = author;
    this.isPaperback = isPaperback;
  }

  /** 
   * Returns the author of the book. 
   */
  public String getAuthor() {
    return author;
  }

  /** 
   * Sets the author of the book. 
   */
  public void setAuthor(String author) {
    this.author = author;
  }

  /** 
   * Returns true if the book is paperback, false if hardcover. 
   */
  public boolean isPaperback() {
    return isPaperback;
  }

  /** 
   * Sets the format of the book (paperback or hardcover). 
   */
  public void setPaperback(boolean isPaperback) {
    this.isPaperback = isPaperback;
  }

  /** 
   * Prints all details of the book to the console. 
   */
  public void printDetails() {
    System.out.println("Title: " + getTitle());
    System.out.println("Author: " + getAuthor());
    System.out.println("Year Published: " + getYearPublished());
    System.out.println("Price: $" + getPrice());
    System.out.println();
  }

  /** 
   * Returns true if the author field is non-null and non-empty. 
   */
  public boolean isAuthorValid() {
    return author != null && !author.isEmpty();
  }
}
