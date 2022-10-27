//双重校验锁，线程安全，效率高
public class DoubleCheckLockingSingleton {

    private static volatile DoubleCheckLockingSingleton instance;

    private DoubleCheckLockingSingleton(){};

    public static DoubleCheckLockingSingleton getInstance () {
        if(instance == null){
            synchronized (DoubleCheckLockingSingleton.class){
                if(instance == null){
                    instance = new DoubleCheckLockingSingleton();
                }
            }
        }
        return instance;
    }

}
