package strategyPattern;

public class MainClass {
    public static void main(String[] args) {
        Pay pay=new CardPay();
        pay.payment();
        pay=new UpiPay();
        pay.payment();

    }
}
