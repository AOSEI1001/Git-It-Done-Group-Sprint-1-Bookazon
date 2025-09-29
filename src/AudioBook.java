public class AudioBook extends MediaType{
    private String author;
    private String narrator;
    private int minuteDuration;


    public AudioBook(String title, int yearPublished, double price, String author, String narrator, int minuteDuration){
        super(title, yearPublished, price);
        this.author = author;
        this.narrator = narrator;
        this.minuteDuration = minuteDuration;

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

    public void setminuteDuration(int duration) {
        this.minuteDuration = duration;
    }

    public String getminuteDuration() {
        int hours = minuteDuration / 60;
        int minutes = minuteDuration % 60;
        return String.format("%d hours and %d minutes", hours, minutes);
    }

    public void printDetails(){
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Narrator: " + getNarrator());
        System.out.println("Audio Length: " + getminuteDuration());
        System.out.println("Year Published: " + getYearPublished());
        System.out.println("Price: $" + getPrice());
    }
    
}
