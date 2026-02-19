public class PaypalPayment implements PaymentProvider{

    private String apiKey;

    public PaypalPayment(String apiKey){
        this.apiKey = apiKey;
    }
    public String makeCharge(String orderId,double amount){
        return "paypal-payment-charge-"+orderId;
    }

}
