public class PaymentGatewayFactory {

    public static PaymentProvider createInstance(String type){
        PaymentProvider pp;
        if (type.equals("PAYPAL")) {
            pp = new PaypalPayment("PAYPALKEY");
        } else {
            pp = new StripePayment("STRIPEKEY");
        }
        return pp;
    }

}
