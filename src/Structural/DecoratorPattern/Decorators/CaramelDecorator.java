package Structural.DecoratorPattern.Decorators;

import Structural.DecoratorPattern.AbstractClass.Beverage;

/**
 * Created by Pawan on 27-08-2017.
 */
public class CaramelDecorator extends Beverage {
    Beverage b;
    public CaramelDecorator(Beverage b) {
        this.b = b;
    }

    @Override
    public String getDescription() {
        return this.b.getDescription() + " with Caramel";
    }

    @Override
    public int price() {
        return this.b.price() + 10;
    }
}
