package ObserverPattern;

import ObserverPattern.ConcreteClasses.PhoneDisplay;
import ObserverPattern.ConcreteClasses.TabletDisplay;
import ObserverPattern.ConcreteClasses.WeatherStation;

/**
 * Created by Pawan on 26-08-2017.
 */
public class main {
    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();
        PhoneDisplay pd = new PhoneDisplay();
        TabletDisplay td = new TabletDisplay();

        station.registerObserver(pd);
        station.registerObserver(td);

        station.goLive();
    }
}
