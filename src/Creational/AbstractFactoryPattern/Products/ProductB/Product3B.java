package Creational.AbstractFactoryPattern.Products.ProductB;

import Creational.AbstractFactoryPattern.Interfaces.IProduct;

/**
 * Created by Pawan on 28-08-2017.
 */
public class Product3B implements IProduct {
    @Override
    public String Name() {
        return "TypeB - Pen";
    }

    @Override
    public String Type() {
        return "Pen";
    }

    @Override
    public int Price() {
        return 200;
    }
}
