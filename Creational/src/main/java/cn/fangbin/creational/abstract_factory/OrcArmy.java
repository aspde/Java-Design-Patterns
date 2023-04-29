package cn.fangbin.creational.abstract_factory;

/**
 * 矮人军队
 */
public class OrcArmy implements Army {

    static final String DESCRIPTION = "这是矮人军队!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
