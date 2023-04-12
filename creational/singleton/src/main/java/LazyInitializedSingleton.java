/**
 * 懒汉式单例，线程安全，效率很低
 */
public class LazyInitializedSingleton {

    private static LazyInitializedSingleton instance;

    // 私有构造函数，以避免使用构造函数
    private LazyInitializedSingleton(){};

    public static synchronized LazyInitializedSingleton getInstance(){
        if(instance == null){
            instance = new LazyInitializedSingleton();
        }
        return instance;
    }

}
