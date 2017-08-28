package Creational.AbstractFactoryPattern.Products.ProductB;

import Creational.AbstractFactoryPattern.Interfaces.IProduct;

/**
 * Created by Pawan on 28-08-2017.
 */
public class Product2B implements IProduct {
    @Override
    public String Name() {
        return "TypeB - Bolt";
    }

    @Override
    public String Type() {
        return "Bolt";
    }

    @Override
    public int Price() {
        return 4;
    }
}
