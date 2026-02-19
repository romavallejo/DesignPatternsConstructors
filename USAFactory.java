public class USAFactory implements  RegionFactory{
    @Override
    public ShippingProvider getShippingProvider() {
        return new UPSShipping();
    }
    @Override
    public PaymentProvider getPaymentProvider() {
        return new PaypalPayment("APIKEYPAYPALMEXICO");
    }
}
