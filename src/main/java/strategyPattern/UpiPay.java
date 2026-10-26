package strategyPattern;

public class UpiPay implements Pay {
    @Override
    public void payment() {
        System.out.println("Amount paid via UPI Transaction");
    }
}
