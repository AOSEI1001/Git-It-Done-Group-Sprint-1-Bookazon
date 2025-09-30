/**
 * Represents a Gold subscription user with a fixed discount.
 */
public class SubscriptionGold extends User {

    /** Gold discount rate of 15%. */
    public static final double GOLDDISC = 0.15;

    /** 
     * Constructs a Gold subscription for the specified user.
     * 
     * @param userName the username of the subscriber
     */
    public SubscriptionGold(String userName) {
        super(userName);
    }

    /** 
     * Returns the discount rate for Gold subscribers.
     * 
     * @return the gold discount rate
     */
    @Override
    public double getDiscount() {
        return GOLDDISC;
    }
}
