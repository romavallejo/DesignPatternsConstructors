import java.util.List;

public class Order {
    private String orderId;
    private String cuoponCode;
    private String shippingAddress;
    private List<String> productos;
    private String notes;

    public Order(OrderBuilder ob){
        this.orderId = ob.getOrderId();
        this.cuoponCode = ob.getCuoponCode();
        this.shippingAddress = ob.getShippingAddress();
        this.productos = ob.getProductos();
        this.notes = ob.getNotes();
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", cuoponCode='" + cuoponCode + '\'' +
                ", shippingAddress='" + shippingAddress + '\'' +
                ", productos=" + productos +
                ", notes='" + notes + '\'' +
                '}';
    }

}
