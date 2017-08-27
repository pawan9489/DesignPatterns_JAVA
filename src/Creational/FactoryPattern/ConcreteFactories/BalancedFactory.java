package Creational.FactoryPattern.ConcreteFactories;

import Creational.FactoryPattern.ConcreteAnimals.FactoryCat;
import Creational.FactoryPattern.ConcreteAnimals.FactoryDog;
import Creational.FactoryPattern.ConcreteAnimals.FactoryDuck;
import Creational.FactoryPattern.Interfaces.IAnimal;
import Creational.FactoryPattern.Interfaces.IAnimalFactory;

/**
 * Created by Pawan on 27-08-2017.
 */
public class BalancedFactory implements IAnimalFactory {
    private static IAnimal lastCreated;
    @Override
    public IAnimal createAnimal() {
        if(lastCreated == null){
            int temp = flipCoin();
            if(temp <= 3) {
                lastCreated = new FactoryDuck();
            } else if(temp >= 7) {
                lastCreated =  new FactoryDog();
            } else {
                lastCreated =  new FactoryCat();
            }
            return lastCreated;
        } else {
            if(lastCreated instanceof FactoryDuck) {
                lastCreated = new FactoryDog();
            } else if (lastCreated instanceof FactoryDog) {
                lastCreated = new FactoryCat();
            } else {
                lastCreated = new FactoryDuck();
            }
            return lastCreated;
        }
    }

    private int flipCoin() {
        return new Double(Math.random() * 10 + 1).intValue();
    }
}
