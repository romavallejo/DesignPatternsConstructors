import java.util.ArrayList;
import java.util.List;

public class OrderBuilder {
    private String orderId;
    private String cuoponCode;
    private String shippingAddress;
    private List<String> productos;
    private String notes;

    OrderBuilder(String orderId) {
        this.orderId = orderId;
    }
    OrderBuilder setCuoponCode(String couponCode) {
        this.cuoponCode = couponCode;
        return this;
    }
    OrderBuilder setShippingAddress(String shippingAddress){
        this.shippingAddress = shippingAddress;
        return this;
    }
    OrderBuilder addItem(String item){
        if (productos==null) {
            productos = new ArrayList<>();
        }
        productos.add(item);
        return this;
    }
    OrderBuilder setNotes(String notes){
        this.notes = notes;
        return this;
    }

    Order build(){
        return new Order(this);
    }

    public String getOrderId() {
        return orderId;
    }

    public String getCuoponCode() {
        return cuoponCode;
    }

    public String getShippingAddress() {
        return shippingAddress;
    }

    public List<String> getProductos() {
        return productos;
    }

    public String getNotes() {
        return notes;
    }
}
