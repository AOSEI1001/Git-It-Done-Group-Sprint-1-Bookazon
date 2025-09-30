/** 
 * Represents a normal subscription for a user. 
 * */
public class SubscriptionNormal extends User {

    public static final double NORMALDISC = 0;

    /** 
     * Constructs a SubscriptionNormal object for the given username. 
     * @param userName the username of the user
     * */
    public SubscriptionNormal(String userName) {
        super(userName);
    }

    /** 
     * Returns the discount for a normal subscription. 
     * */
    @Override
    public double getDiscount() {
        return NORMALDISC;
    }
}