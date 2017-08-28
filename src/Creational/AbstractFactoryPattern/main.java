package Creational.AbstractFactoryPattern;

import Creational.AbstractFactoryPattern.Interfaces.IProduct;
import Creational.AbstractFactoryPattern.Producers.*;

/**
 * Created by Pawan on 28-08-2017.
 */
public class main {
    public static void main(String[] args) {
        IProduct p1 = new Producer2().createProductsTypeA();
        System.out.println(p1.Name());
        System.out.println(p1.Price());
    }
}
