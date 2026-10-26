package observerPattern;

import java.util.ArrayList;
import java.util.List;

public class MainObserve {
    private List<Observer> observerList=new ArrayList<Observer>();
    private int temperature;

    public void setTemperature(int temperature) {
        this.temperature = temperature;

        for (Observer observer : observerList) {
            observer.update(this.temperature);
        }
    }
    public void addObserver(Observer observer) {
        observerList.add(observer);
    }
}
