package ObserverPattern.ConcreteClasses;

import ObserverPattern.interfaces.IObservable;
import ObserverPattern.interfaces.IObserver;

import java.util.*;

/**
 * Created by Pawan on 26-08-2017.
 */
public class WeatherStation implements IObservable {
    private int temperature;
    Scanner sc = new Scanner(System.in);
    List<IObserver> observers = new ArrayList<IObserver>();

    @Override
    public void registerObserver(IObserver observer) {
        this.observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        this.observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        for (IObserver observer:observers) {
            observer.update(getTemperature());
        }
    }

    private int getTemperature() {
        return this.temperature;
    }

    public void goLive(){
        while (true) {
            temperature = sc.nextInt();
            notifyObserver();
        }
    }
}
