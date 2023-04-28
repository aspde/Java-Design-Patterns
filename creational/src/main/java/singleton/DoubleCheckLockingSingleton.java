package singleton;

/**
 * 双重校验锁，线程安全，效率高
 */
public class DoubleCheckLockingSingleton {

    // 禁止指令重排序
    private static volatile DoubleCheckLockingSingleton instance;

    private DoubleCheckLockingSingleton(){};

    public static DoubleCheckLockingSingleton getInstance () {
        // 返回单例，避免多余的加锁操作
        if(instance == null){
            synchronized (DoubleCheckLockingSingleton.class){
                // 防止多线程创建多个实例
                if(instance == null){
                    instance = new DoubleCheckLockingSingleton();
                }
            }
        }
        return instance;
    }

}
