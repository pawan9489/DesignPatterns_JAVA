package ObserverPattern.interfaces;

/**
 * Created by Pawan on 26-08-2017.
 */
public interface IObservable {
    void registerObserver(IObserver observer);
    void removeObserver(IObserver observer);
    void notifyObserver();
}
