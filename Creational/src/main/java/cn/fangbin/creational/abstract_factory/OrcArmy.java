package cn.fangbin.creational.abstract_factory;

/**
 * 兽人军队
 */
public class OrcArmy implements Army {

    static final String DESCRIPTION = "这是兽人军队!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
