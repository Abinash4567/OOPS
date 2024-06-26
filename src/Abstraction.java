public class Abstraction {
    public static void main(String[] args) {
        Payment creditMethod = new CreditCardPayment();
        PaymentProcessor handlePayment = new PaymentProcessor(creditMethod);
        handlePayment.processPayment(1200.89);
    }
}

abstract class Payment {
    public abstract void initiatePayment(double amount);
    public abstract void processPayment();
    public abstract void confirmPayment();
}

class CreditCardPayment extends Payment {
    int cvv = 123;
    @Override
    public void initiatePayment(double amount) {
        System.out.println("Initiating credit card payment of $" + amount);
    }

    @Override
    public void processPayment() {
        System.out.println("Processing credit card payment...");
    }

    @Override
    public void confirmPayment() {
        System.out.println("Credit card payment confirmed.");
    }
}


class PaymentProcessor {
    private Payment payment;

    PaymentProcessor(Payment payment) {
        this.payment = payment;
    }

    void processPayment(double amount) {
        payment.initiatePayment(amount);
        payment.processPayment();
        payment.confirmPayment();
    }
}