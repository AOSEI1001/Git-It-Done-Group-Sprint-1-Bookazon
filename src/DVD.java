public class DVD extends MediaType {
    private String director;
    private int length;
    
    public DVD(String title, double price, int yearPublished, String director, int length) {
        super(title, yearPublished, price);
        this.director = director;
        if (!isDirectorValid()) {
            this.director = "Unknown";
        }
        this.length = length;
    }
    
    public String getDirector() {
        return director;
    }
    
    public void setDirector(String director) {
        this.director = director;
        if (!isDirectorValid()) {
            this.director = "Unknown";
        }
    }

    public boolean isDirectorValid() {
        return director != null && !director.isEmpty();
    }
    
    public int getLength() {
        return length;
    }
    
    public void setLength(int length) {
        this.length = length;
    }
    
    public String toString() {
        return super.toString() + "\nDirector: " + director + "\nLength: " + length + " minutes";
    }

    @Override
    public void printDetails() {
        System.out.println("Title: " + getTitle());
        System.out.println("Director: " + getDirector());
        System.out.println("Year Published: " + getYearPublished());
        System.out.println("Price: $" + getPrice());
    }
}