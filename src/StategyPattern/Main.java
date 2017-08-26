package StategyPattern;

import StategyPattern.Displayers.GraphicsDisplay;
import StategyPattern.Displayers.NormalDisplay;
import StategyPattern.Flyers.JetFlying;
import StategyPattern.Flyers.NoFlying;
import StategyPattern.Flyers.NormalFlying;
import StategyPattern.Quackers.MadQuacking;
import StategyPattern.Quackers.NormalQuack;

public class Main {

    public static void main(String[] args) {
        Duck wildDuck = new Duck(new MadQuacking(),new NormalDisplay(),new NormalFlying());
        Duck cityDuck = new Duck(new NormalQuack(),new NormalDisplay(),new NormalFlying());
        Duck plasticDuck = new Duck(new NormalQuack(),new GraphicsDisplay(),new NoFlying());
        Duck mountainDuck = new Duck(new MadQuacking(),new NormalDisplay(),new JetFlying());
        Duck cloudDuck = new Duck(new MadQuacking(),new GraphicsDisplay(),new JetFlying());

        runMethods(wildDuck);
        runMethods(cityDuck);
        runMethods(plasticDuck);
        runMethods(mountainDuck);
        runMethods(cloudDuck);
    }

    private static void runMethods(Duck d) {
        System.out.println();
        System.out.println(d);
        d.Quack();
        d.Display();
        d.Fly();
        System.out.println();
    }
}
