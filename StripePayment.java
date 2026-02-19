public class StripePayment implements PaymentProvider {

    private String apiKey;

    public StripePayment(String apiKey) {
        this.apiKey = apiKey;
    }

    public String makeCharge(String orderId,double amount){
        return "stripe-payment-charge-"+orderId;
    }

}