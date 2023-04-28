package cn.fangbin.creational.factory;

/**
 * 硬币工厂
 */
public class CoinFactory {

    // 工厂采用硬币类型作为参数，并调用相应的类
    public static Coin getCoin(CoinType type) {
        return type.getConstructor().get();
    }
}
