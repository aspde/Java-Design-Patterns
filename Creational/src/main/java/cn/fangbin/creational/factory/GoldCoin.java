package cn.fangbin.creational.factory;

/**
 * 金币实现
 */
public class GoldCoin implements Coin {

    static final String DESCRIPTION = "这是一个金币";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
