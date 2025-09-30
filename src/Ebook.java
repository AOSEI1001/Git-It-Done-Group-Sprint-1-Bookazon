public class Ebook extends MediaType{
    private String author;
    private String format; //pdf, epub, AZW/MOBI

    public Ebook(String title, String author, int yearPublished, double price, boolean isPaperback, String format) {
        super(title, yearPublished, price);
        this.author = author;
        this.format = format;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getformat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public void printDetails() {
        System.out.println("\n============== Item Details ==============");
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("\n");

        System.out.println("Year Published: " + getYearPublished());
        System.out.println("Price: $" + getPrice());
        System.out.println("Format:" + getformat());
        System.out.println("=======================================================\n");

    }

    public boolean isAuthorValid() {
        return author != null && !author.isEmpty();
    }

}