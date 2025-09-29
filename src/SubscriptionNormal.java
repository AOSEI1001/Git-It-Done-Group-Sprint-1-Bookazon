public class SubscriptionNormal extends User {

	public static final double NORMALDISC = 1.0;

    public SubscriptionNormal(String userName) {
        super(userName);
    }

	public double getDiscount() {
		return NORMALDISC;
	}
}