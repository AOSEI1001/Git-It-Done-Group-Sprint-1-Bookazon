/** 
 * Represents a platinum subscription for a user. 
 * */
public class SubscriptionPlatinum extends User {

    public static final double PLATINUMDISC = 0.10;

    /** 
     * Constructs a SubscriptionPlatinum object for the given username. 
     * @param userName the username of the user
     * */
    public SubscriptionPlatinum(String userName) {
        super(userName);
    }

    /** 
     * Returns the discount for a platinum subscription. 
     * */
    @Override
    public double getDiscount() {
        return PLATINUMDISC;
    }
}