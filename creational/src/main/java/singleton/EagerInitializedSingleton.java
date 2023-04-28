package singleton;

/**
 * 饿汉式单例，线程安全
 */
public class EagerInitializedSingleton {

    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

    // 私有构造函数，以避免使用构造函数
    private EagerInitializedSingleton(){}

    public static EagerInitializedSingleton getInstance(){
        return instance;
    }

}
