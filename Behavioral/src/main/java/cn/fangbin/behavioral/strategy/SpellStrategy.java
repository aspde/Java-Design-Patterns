package cn.fangbin.behavioral.strategy;

import lombok.extern.slf4j.Slf4j;

/**
 * 咒术策略
 */
@Slf4j
public class SpellStrategy implements DragonSlayingStrategy {
    @Override
    public void execute() {
        LOGGER.info("你施展分解咒，龙在一堆尘土中泯灭!");
    }
}
