package cn.fangbin.creational.abstract_factory;

/**
 * 矮人国王
 */
public class OrcKing implements King {

    static final String DESCRIPTION = "这是矮人国王!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
