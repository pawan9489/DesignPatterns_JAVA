package StategyPattern.Flyers;

import StategyPattern.Interfaces.IFlyable;

/**
 * Created by Pawan on 26-08-2017.
 */
public class NoFlying implements IFlyable {
    @Override
    public void fly() {
        System.out.println("Can't Fly");
    }
}