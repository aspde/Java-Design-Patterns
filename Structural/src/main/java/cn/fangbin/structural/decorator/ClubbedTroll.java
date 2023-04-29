package cn.fangbin.structural.decorator;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * 装饰器为巨魔添加了一个棍子
 */
@Slf4j
@RequiredArgsConstructor
public class ClubbedTroll implements Troll {

    private final Troll decorated;

    @Override
    public void attack() {
        decorated.attack();
        LOGGER.info("巨魔拿棍子打你!");
    }

    @Override
    public int getAttackPower() {
        return decorated.getAttackPower() + 10;
    }

    @Override
    public void fleeBattle() {
        decorated.fleeBattle();
    }
}
