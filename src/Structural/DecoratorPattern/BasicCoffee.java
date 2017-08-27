package Structural.DecoratorPattern;

import Structural.DecoratorPattern.AbstractClass.Beverage;

/**
 * Created by Pawan on 27-08-2017.
 */
public class BasicCoffee extends Beverage {
    @Override
    public String getDescription() {
        return "Normal Coffee";
    }

    @Override
    public int price() {
        return 10;
    }
}
