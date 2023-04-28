package cn.fangbin.creational.factory;

/**
 * 铜币实现
 */
public class CopperCoin implements Coin {

    static final String DESCRIPTION = "这是一个铜币";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
