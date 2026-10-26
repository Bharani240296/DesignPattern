package observerPattern;

public class MainClass {
    public static void main(String[] args) {
        MainObserve obj=new MainObserve();
        obj.addObserver(new SystemObserver());
        obj.addObserver(new PhoneObserver());
        obj.setTemperature(45);
        obj.setTemperature(79);
    }
}
