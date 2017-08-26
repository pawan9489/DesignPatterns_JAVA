package StategyPattern;

import StategyPattern.Interfaces.IDisplayable;
import StategyPattern.Interfaces.IFlyable;
import StategyPattern.Interfaces.IQuackable;

/**
 * Created by Pawan on 26-08-2017.
 */
public class Duck {
    IQuackable qb;
    IDisplayable db;
    IFlyable fb;

    public Duck(IQuackable qb, IDisplayable db, IFlyable fb) {
        this.qb = qb;
        this.db = db;
        this.fb = fb;
    }

    public void Fly() {
        this.fb.fly();
    }

    public void Display() {
        this.db.display();
    }

    public void Quack() {
        this.qb.quack();
    }
}
