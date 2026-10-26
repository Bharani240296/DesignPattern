package strategyPattern;

public class CardPay implements Pay{
    @Override
    public void payment() {
        System.out.println("Amount paid via Card Transaction");
    }
}
