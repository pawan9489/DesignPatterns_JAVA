package Creational.FactoryPattern.ConcreteAnimals;

import Creational.FactoryPattern.Interfaces.IAnimal;

/**
 * Created by Pawan on 27-08-2017.
 */
public class FactoryDog implements IAnimal {
    @Override
    public void walk() {
        System.out.println("Dog is Walking");
    }

    @Override
    public void jump() {
        System.out.println("Dog is Jumping");
    }

    @Override
    public void run() {
        System.out.println("Dog is Running");
    }
}
