public class AdapterTest {

    public static void main(String[] args) {

        PaymentProcessor payPalPayment = new PayPalAdapter();
        payPalPayment.processPayment(1000);

        PaymentProcessor stripePayment = new StripeAdapter();
        stripePayment.processPayment(2000);
    }
}