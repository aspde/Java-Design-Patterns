package singleton;

/**
 * 懒汉式单例，线程不安全
 */
public class LazyInitializedSingleton {

    private static LazyInitializedSingleton instance;

    // 私有构造函数，以避免使用构造函数
    private LazyInitializedSingleton(){};

    public static LazyInitializedSingleton getInstance(){
        if(instance == null){
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }

}
