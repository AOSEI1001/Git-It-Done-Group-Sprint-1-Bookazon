public class SubscriptionSilver extends User {

	public static final double SILVERDISC = 0.05;
	
    public SubscriptionSilver(String userName) {
        super(userName);
    }

	@Override
	public double getDiscount() {
		return SILVERDISC;
	}
}