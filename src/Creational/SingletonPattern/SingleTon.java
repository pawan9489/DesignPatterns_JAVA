package Creational.SingletonPattern;

/**
 * Created by Pawan on 28-08-2017.
 */
public class SingleTon {
    private static SingleTon instance;
    private String x;
    private SingleTon(String x) {
        this.x = x;
    }
    public static SingleTon getInstance(String x){
        if(instance == null) {
            instance = new SingleTon(x);
        }
        return instance;
    }

    public String getX() {
        return x;
    }
}
