package cn.fangbin.creational.abstract_factory;

/**
 * 矮人城堡
 */
public class OrcCastle implements Castle {

    static final String DESCRIPTION = "这是矮人城堡!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
