package Structural.DecoratorPattern;

import Structural.DecoratorPattern.AbstractClass.Beverage;
import Structural.DecoratorPattern.Decorators.*;

/**
 * Created by Pawan on 27-08-2017.
 */
public class main {
    public static void main(String[] args) {
        Beverage b = new CaramelDecorator(new SoyDecorator(new BasicCoffee()));
        System.out.println(b.getDescription());
        System.out.println(b.price());

        Beverage b1 = new MochaDecorator(new WhippedCreamDecorator(new ChocolateDecorator(new BasicCoffee())));
        System.out.println(b1.getDescription());
        System.out.println(b1.price());

    }
}
