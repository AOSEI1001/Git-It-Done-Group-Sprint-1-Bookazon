/** 
 * Represents a silver subscription for a user. 
 * */
public class SubscriptionSilver extends User {

    public static final double SILVERDISC = 0.05;

    /** 
     * Constructs a SubscriptionSilver object for the given username. 
     * @param userName the username of the user
     * */
    public SubscriptionSilver(String userName) {
        super(userName);
    }

    /** 
     * Returns the discount for a silver subscription. 
     * */
    @Override
    public double getDiscount() {
        return SILVERDISC;
    }
}