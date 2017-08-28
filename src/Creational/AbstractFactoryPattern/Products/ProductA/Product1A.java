package Creational.AbstractFactoryPattern.Products.ProductA;

import Creational.AbstractFactoryPattern.Interfaces.IProduct;

/**
 * Created by Pawan on 28-08-2017.
 */
public class Product1A implements IProduct {
    @Override
    public String Name() {
        return "TypeA - Screw";
    }

    @Override
    public String Type() {
        return "Screw";
    }

    @Override
    public int Price() {
        return 10;
    }
}
