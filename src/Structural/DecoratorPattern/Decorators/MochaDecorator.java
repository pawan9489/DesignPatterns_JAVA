package Structural.DecoratorPattern.Decorators;

import Structural.DecoratorPattern.AbstractClass.Beverage;

/**
 * Created by Pawan on 27-08-2017.
 */
public class MochaDecorator extends Beverage {
    Beverage b;
    public MochaDecorator(Beverage b) {
        this.b = b;
    }

    @Override
    public String getDescription() {
        return this.b.getDescription() + " with MochaDecorator";
    }

    @Override
    public int price() {
        return this.b.price() + 40;
    }
}