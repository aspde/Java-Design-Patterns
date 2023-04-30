package cn.fangbin.behavioral.strategy;

import lombok.extern.slf4j.Slf4j;

/**
 * 近战策略
 */
@Slf4j
public class MeleeStrategy implements DragonSlayingStrategy {
    @Override
    public void execute() {
        LOGGER.info("你用王者之剑砍下龙头!");
    }
}
