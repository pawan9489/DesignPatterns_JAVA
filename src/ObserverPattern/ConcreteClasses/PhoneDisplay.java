package ObserverPattern.ConcreteClasses;

import ObserverPattern.interfaces.IObserver;

/**
 * Created by Pawan on 26-08-2017.
 */
public class PhoneDisplay implements IObserver {
    @Override
    public void update(int temp) {
        System.out.println("Mobile" + temp);
        System.out.println("***************");
        System.out.println("***************");
        System.out.println("****       ****");
        System.out.println("****       ****");
        System.out.println("**** " + temp + "   ****");
        System.out.println("****       ****");
        System.out.println("****       ****");
        System.out.println("****       ****");
        System.out.println("****       ****");
        System.out.println("****       ****");
        System.out.println("***************");
        System.out.println("***************");
        System.out.println("***************");
    }
}
