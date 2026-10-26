package observerPattern;

public class PhoneObserver implements Observer {

    @Override
    public void update(int temperature) {
        System.out.println("Phone verified temperature: " + temperature);
    }
}
