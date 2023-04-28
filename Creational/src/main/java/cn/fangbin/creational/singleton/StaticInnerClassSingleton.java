package cn.fangbin.creational.singleton;

/**
 * 静态内部类，线程安全
 */
public class StaticInnerClassSingleton {

    private StaticInnerClassSingleton(){};

    private static class SingletonHelper{
        private static final StaticInnerClassSingleton INSTANCE = new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance (){
        return SingletonHelper.INSTANCE;
    }

}
