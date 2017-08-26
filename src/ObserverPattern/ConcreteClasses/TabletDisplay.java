package ObserverPattern.ConcreteClasses;

import ObserverPattern.interfaces.IObserver;

/**
 * Created by Pawan on 26-08-2017.
 */
public class TabletDisplay implements IObserver {
    @Override
    public void update(int o) {
        System.out.println();
        System.out.println("*********TABLET**********" + o);
        System.out.println("*************************");
        System.out.println("*************************");
        System.out.println("****       ****");
        System.out.println("****       ****");
        System.out.println("**** " + o + "   ****");
        System.out.println("****       ****");
        System.out.println("***************");
        System.out.println("***************");
        System.out.println("***************");
        System.out.println();
    }
}
