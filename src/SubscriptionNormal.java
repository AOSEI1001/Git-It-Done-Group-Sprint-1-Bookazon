public class SubscriptionNormal extends User {

	public static final double NORMALDISC = 0;

    public SubscriptionNormal(String userName) {
        super(userName);
    }

    @Override
	public double getDiscount() {
		return NORMALDISC;
	}
}