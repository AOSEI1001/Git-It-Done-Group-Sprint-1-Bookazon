public class SubscriptionPlatinum extends User {

	public static final double PLANTINUMDISC = 0.10;

    public SubscriptionPlatinum(String userName) {
        super(userName);
    }
	public double getDiscount() {
		return PLANTINUMDISC;
	}
}