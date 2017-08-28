package Creational.AbstractFactoryPattern.Products.ProductA;

import Creational.AbstractFactoryPattern.Interfaces.IProduct;

/**
 * Created by Pawan on 28-08-2017.
 */
public class Product2A implements IProduct {
    @Override
    public String Name() {
        return "TypeA - Bolt";
    }

    @Override
    public String Type() {
        return "Bolt";
    }

    @Override
    public int Price() {
        return 2;
    }
}
