/**
 * Represents an audiobook, which is a type of media with a title, author, narrator, duration, 
 * year published, and price.
 */
public class AudioBook extends MediaType {

  private String author;
  private String narrator;
  private int minuteDuration;

  /**
   * Constructs an AudioBook object with all fields specified.
   *
   * @param title          the title of the audiobook
   * @param yearPublished  the year the audiobook was published
   * @param price          the price of the audiobook
   * @param author         the author of the audiobook
   * @param narrator       the narrator of the audiobook
   * @param minuteDuration the duration of the audiobook in minutes
   */
  public AudioBook(String title, int yearPublished, double price, String author, String narrator,
      int minuteDuration) {
    super(title, yearPublished, price);
    this.author = author;
    this.narrator = narrator;
    this.minuteDuration = minuteDuration;
  }

  /** Returns the author of the audiobook. */
  public String getAuthor() {
    return author;
  }

  /** 
   * Sets the author of the audiobook. 
   * 
  */
  public void setAuthor(String author) {
    this.author = author;
  }

  /** 
   * Returns the narrator of the audiobook. 
   * */
  public String getNarrator() {
    return narrator;
  }

  /** 
   * Sets the narrator of the audiobook. 
   * */
  public void setNarrator(String narrator) {
    this.narrator = narrator;
  }

  /** 
   * Sets the duration of the audiobook in minutes. 
   * */
  public void setMinuteDuration(int duration) {
    this.minuteDuration = duration;
  }

  /**
   * Returns the duration of the audiobook formatted as "X hours and Y minutes".
   *
   * @return formatted duration string
   */
  public String getMinuteDuration() {
    int hours = minuteDuration / 60;
    int minutes = minuteDuration % 60;
    return String.format("%d hours and %d minutes", hours, minutes);
  }

  /** 
   * Prints all details of the audiobook to the console. 
   * */
  public void printDetails() {
    System.out.println("\n==================== Item Details =====================");
    System.out.println("Title: " + getTitle());
    System.out.println("Author: " + getAuthor());
    System.out.println("Narrator: " + getNarrator());
    System.out.println("Audio Length: " + getMinuteDuration());
    System.out.println("Year Published: " + getYearPublished());
    System.out.println("Price: $" + getPrice());
    System.out.println("======================================================\n");
  }
}