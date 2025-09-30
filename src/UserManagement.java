import java.util.ArrayList;

public class UserManagement {
    private ArrayList<User> userBase;

    public UserManagement(){
        userBase = new ArrayList<>();
    }

    public void addUser(User user){
        userBase.add(user);
    }

    public User getUser(int userIndex){
        return userBase.get(userIndex);
    }

    public void removeUser(User user){
        userBase.remove(user);
    }

    public void viewUsers(){
        for (User person : userBase){
            System.out.println(person.getName());
        }

    }
    
}
