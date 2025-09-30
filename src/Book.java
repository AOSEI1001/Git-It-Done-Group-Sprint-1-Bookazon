public class Book extends MediaType{
    private String author;
    private boolean isPaperback;  // true if the book is paperback, false if it is hardcover

    public Book(String title, String author, int yearPublished, double price, boolean isPaperback) {
        super(title, yearPublished, price);
        this.author = author;
        this.isPaperback = isPaperback;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public boolean isPaperback() {
        return isPaperback;
    }

    public void setPaperback(boolean isPaperback) {
        this.isPaperback = isPaperback;
    }

    public void printDetails() {
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Year Published: " + getYearPublished());
        System.out.println("Price: $" + getPrice());
        System.out.println("\n");
    }

    public boolean isAuthorValid() {
        return author != null && !author.isEmpty();
    }

}