public class SubscriptionGold extends User {

	public static final double GOLDDISC = 0.15;

    public SubscriptionGold(String userName) {
        super(userName);
    }

	
	public double getDiscount() {
		return GOLDDISC;
	}
}