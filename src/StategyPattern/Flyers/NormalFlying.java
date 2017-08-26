package StategyPattern.Flyers;

import StategyPattern.Interfaces.IFlyable;

/**
 * Created by Pawan on 26-08-2017.
 */
public class NormalFlying implements IFlyable {
    @Override
    public void fly() {
        System.out.println("Normal Flying");
    }
}