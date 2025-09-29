public class AudioBook extends MediaType{
    private String author;
    private String narrator;
    private int audioLength;


    public AudioBook(String title, int yearPublished, double price, String author, String narrator, int audioLength){
        super(title, yearPublished, price);
        this.author = author;
        this.narrator = narrator;
        this.audioLength = audioLength;

    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getNarrator() {
        return narrator;
    }

    public void setNarrator(String narrator) {
        this.narrator = narrator;
    }

    public void printDetails(){
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Author: " + getNarrator());

        System.out.println("Year Published: " + getYearPublished());
        System.out.println("Price: $" + getPrice());
    }
    
}
