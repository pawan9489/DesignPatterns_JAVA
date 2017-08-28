package Creational.AbstractFactoryPattern.Products.ProductA;

import Creational.AbstractFactoryPattern.Interfaces.IProduct;

/**
 * Created by Pawan on 28-08-2017.
 */
public class Product3A implements IProduct {
    @Override
    public String Name() {
        return "TypeA - Pen";
    }

    @Override
    public String Type() {
        return "Pen";
    }

    @Override
    public int Price() {
        return 100;
    }
}
