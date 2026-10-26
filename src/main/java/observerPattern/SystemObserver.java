package observerPattern;

public class SystemObserver implements Observer {
    @Override
    public void update(int temperature) {
        System.out.println("System verified temperature: " + temperature);
    }
}
