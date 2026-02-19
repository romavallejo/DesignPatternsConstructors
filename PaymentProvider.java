public interface PaymentProvider {
    public String makeCharge(String orderId, double amount);
}
