import java.util.ArrayList;

public class Inventory {
    private ArrayList<MediaType> media;

    public Inventory(){
        media = new ArrayList<>();
    }

    public void addItem(MediaType item){
        media.add(item);
    }

    public MediaType getItem(int itemIndex){
        return media.get(itemIndex);
    }

    public void removeItem(MediaType item){
        media.remove(item);
    }

    public void viewItems(){
        for (MediaType item : media){
            item.printDetails();
        }

    }
    
}
