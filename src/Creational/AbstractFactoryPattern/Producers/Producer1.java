package Creational.AbstractFactoryPattern.Producers;

import Creational.AbstractFactoryPattern.Interfaces.IProduct;
import Creational.AbstractFactoryPattern.Interfaces.IProductFactory;
import Creational.AbstractFactoryPattern.Products.ProductA.Product1A;
import Creational.AbstractFactoryPattern.Products.ProductB.Product1B;

/**
 * Created by Pawan on 28-08-2017.
 */
public class Producer1 implements IProductFactory {
    @Override
    public IProduct createProductsTypeA() {
        return new Product1A();
    }

    @Override
    public IProduct createProductsTypeB() {
        return new Product1B();
    }
}
