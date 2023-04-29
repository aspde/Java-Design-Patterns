package cn.fangbin.creational.abstract_factory;

/**
 * 精灵军队
 */
public class ElfArmy implements Army {

    static final String DESCRIPTION = "这是精灵军队!";

    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
