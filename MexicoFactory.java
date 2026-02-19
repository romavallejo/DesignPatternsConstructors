public class MexicoFactory implements RegionFactory{
    @Override
    public ShippingProvider getShippingProvider() {
        return new FedexShipping();
    }
    @Override
    public PaymentProvider getPaymentProvider(){
        return new StripePayment("APIKEYSTRIPEMEXICO");
    }
}
