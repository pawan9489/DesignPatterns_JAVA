package StategyPattern.Flyers;

import StategyPattern.Interfaces.IFlyable;

/**
 * Created by Pawan on 26-08-2017.
 */
public class JetFlying implements IFlyable {
    @Override
    public void fly() {
        System.out.println("Jet Flying");
    }
}
