package Creational.AbstractFactoryPattern.Products.ProductB;

import Creational.AbstractFactoryPattern.Interfaces.IProduct;

/**
 * Created by Pawan on 28-08-2017.
 */
public class Product1B implements IProduct {
    @Override
    public String Name() {
        return "TypeB - Screw";
    }

    @Override
    public String Type() {
        return "Screw";
    }

    @Override
    public int Price() {
        return 20;
    }
}
