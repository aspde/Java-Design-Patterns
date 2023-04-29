package cn.fangbin.structural.decorator;

import lombok.extern.slf4j.Slf4j;

/**
 * 普通巨魔实现巨魔接口
 */
@Slf4j
public class SimpleTroll implements Troll {

    @Override
    public void attack() {
        LOGGER.info("巨魔想要抓住你!");
    }

    @Override
    public int getAttackPower() {
        return 10;
    }

    @Override
    public void fleeBattle() {
        LOGGER.info("巨魔惊恐地尖叫着逃跑了!");
    }
}
