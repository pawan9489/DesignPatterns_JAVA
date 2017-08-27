package StategyPattern.Displayers;

import StategyPattern.Interfaces.IDisplayable;

/**
 * Created by Pawan on 26-08-2017.
 */
public class NormalDisplay implements IDisplayable{
    @Override
    public void display() {
        System.out.println("Normal Displaying");
    }
}
