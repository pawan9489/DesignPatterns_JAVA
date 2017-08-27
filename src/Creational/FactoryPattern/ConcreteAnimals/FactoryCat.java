package Creational.FactoryPattern.ConcreteAnimals;

import Creational.FactoryPattern.Interfaces.IAnimal;

/**
 * Created by Pawan on 27-08-2017.
 */
public class FactoryCat implements IAnimal {
    @Override
    public void walk() {
        System.out.println("Cat is Walking");
    }

    @Override
    public void jump() {
        System.out.println("Cat is Jumping");
    }

    @Override
    public void run() {
        System.out.println("Cat is Running");
    }
}
