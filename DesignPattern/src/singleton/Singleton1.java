package singleton;

/**
 * 使用急切创建实例
 */

public class Singleton1 {

    private static Singleton1 instance = new Singleton1();

    public static Singleton1 getInstance() {
        return instance;
    }

    private Singleton1() {
    }
}
