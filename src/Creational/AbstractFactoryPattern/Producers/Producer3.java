package Creational.AbstractFactoryPattern.Producers;

import Creational.AbstractFactoryPattern.Interfaces.IProduct;
import Creational.AbstractFactoryPattern.Interfaces.IProductFactory;
import Creational.AbstractFactoryPattern.Products.ProductA.Product3A;
import Creational.AbstractFactoryPattern.Products.ProductB.Product3B;

/**
 * Created by Pawan on 28-08-2017.
 */
public class Producer3 implements IProductFactory {
    @Override
    public IProduct createProductsTypeA() {
        return new Product3A();
    }

    @Override
    public IProduct createProductsTypeB() {
        return new Product3B();
    }
}