import java.util.Scanner;

public class Main {
    static void main(String[] args) {

        //SINGLETON
        //files ClassA, ClassB, Config
        /*
        ClassA classA = new ClassA();
        ClassB classB = new ClassB();
        classA.imprimirMetodoClaseA();
        classB.imprimirMetodoClaseB();
        */
        /*
        double price;
        String id;
        String method;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount you want: ");
        price = scanner.nextDouble();
        System.out.println("Enter the order ID: ");
        id = scanner.next();
        System.out.println("Enter the payment Type: ");
        method = scanner.next();
        PaymentProvider pp = PaymentGatewayFactory.createInstance(method);
        System.out.println(pp.makeCharge(id, price));
        */

        //FACTORY
        //files PaymentGatewayFactory, PaymentProvider, StripePayment, PaypalPayment

        // ABSTRACT FACTORY
        //files PaymentGatewayFactory, PaymentProvider, StripePayment, PaypalPayment, MexicoFactory, USAFactory
        /*
        double price;
        String id;
        String method;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount you want: ");
        price = scanner.nextDouble();
        System.out.println("Enter the order ID: ");
        id = scanner.next();
        System.out.println("Enter the payment Type: ");
        method = scanner.next();
        RegionFactory factory = new MexicoFactory();
        PaymentProvider pp= factory.getPaymentProvider();
        System.out.println(pp.makeCharge(id,price));
        */

        //BUILDER
        Order o = new OrderBuilder("id-53423")
                .addItem("coca")
                .addItem("pizzas")
                .setShippingAddress("calle 123, Pablo Millar, Ciudad de Cuba")
                .build();
        System.out.println(o.toString());
    }
}
