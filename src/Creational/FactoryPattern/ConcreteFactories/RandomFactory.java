package Creational.FactoryPattern.ConcreteFactories;

import Creational.FactoryPattern.ConcreteAnimals.FactoryCat;
import Creational.FactoryPattern.ConcreteAnimals.FactoryDog;
import Creational.FactoryPattern.ConcreteAnimals.FactoryDuck;
import Creational.FactoryPattern.Interfaces.IAnimal;
import Creational.FactoryPattern.Interfaces.IAnimalFactory;

/**
 * Created by Pawan on 27-08-2017.
 */
public class RandomFactory implements IAnimalFactory {
    @Override
    public IAnimal createAnimal() {
        return flipCoin();
    }

    private IAnimal flipCoin() {
        int temp = new Double(Math.random() * 10 + 1).intValue();
        if(temp <= 3) {
            return new FactoryDuck();
        } else if(temp >= 7) {
            return new FactoryDog();
        } else {
            return new FactoryCat();
        }
    }
}
