public class ShippingInfo{

    private Address shippingAddress;
    private Address billingAddress;
   

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
        
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
        
    }

    public Address getShippingAddress(){

        return shippingAddress;
    }

    public Address getBillingAddress(){
        return billingAddress;
    }
}