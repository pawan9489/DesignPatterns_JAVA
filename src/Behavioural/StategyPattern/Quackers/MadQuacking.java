package StategyPattern.Quackers;

import StategyPattern.Interfaces.IQuackable;

/**
 * Created by Pawan on 26-08-2017.
 */
public class MadQuacking implements IQuackable {
    @Override
    public void quack() {
        System.out.println("Wild Quacking");
    }
}