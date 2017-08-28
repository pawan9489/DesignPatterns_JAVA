package Creational.SingletonPattern;

/**
 * Created by Pawan on 28-08-2017.
 */
public class main {
    public static void main(String[] args) {
        SingleTon y = SingleTon.getInstance("same instance");
        System.out.println(y.getX());

        SingleTon z = SingleTon.getInstance("asd");
        System.out.println(z.getX());
    }
}
