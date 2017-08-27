package Creational.FactoryPattern;

import Creational.FactoryPattern.ConcreteFactories.BalancedFactory;
import Creational.FactoryPattern.ConcreteFactories.RandomFactory;
import Creational.FactoryPattern.Interfaces.IAnimal;
import Creational.FactoryPattern.Interfaces.IAnimalFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pawan on 27-08-2017.
 */
public class main {
    public static void main(String[] args) {
        IAnimalFactory bf = new BalancedFactory();
        IAnimalFactory rf = new RandomFactory();

        List<IAnimal> animals = new ArrayList<IAnimal>();
        for(int i = 0; i < 10; i++) {
            animals.add(rf.createAnimal());
            animals.get(i).walk();
        }

        System.out.println();
        System.out.println("-----------------");

        List<IAnimal> BalancedAnimals = new ArrayList<IAnimal>();
        for(int i = 0; i < 10; i++) {
            BalancedAnimals.add(bf.createAnimal());
            BalancedAnimals.get(i).run();
        }
    }
}
