package Creational.AbstractFactoryPattern.Producers;

import Creational.AbstractFactoryPattern.Interfaces.IProduct;
import Creational.AbstractFactoryPattern.Interfaces.IProductFactory;
import Creational.AbstractFactoryPattern.Products.ProductA.Product2A;
import Creational.AbstractFactoryPattern.Products.ProductB.Product2B;

/**
 * Created by Pawan on 28-08-2017.
 */
public class Producer2 implements IProductFactory {
    @Override
    public IProduct createProductsTypeA() {
        return new Product2A();
    }

    @Override
    public IProduct createProductsTypeB() {
        return new Product2B();
    }
}