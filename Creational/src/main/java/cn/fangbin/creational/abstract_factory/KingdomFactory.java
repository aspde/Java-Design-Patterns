package cn.fangbin.creational.abstract_factory;

/**
 * 王国工厂工厂接口
 */
public interface KingdomFactory {

    Castle createCastle();

    King createKing();

    Army createArmy();
}
