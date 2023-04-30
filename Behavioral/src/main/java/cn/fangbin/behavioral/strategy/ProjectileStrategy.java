package cn.fangbin.behavioral.strategy;

import lombok.extern.slf4j.Slf4j;

/**
 * 远程策略
 */
@Slf4j
public class ProjectileStrategy implements DragonSlayingStrategy {
    @Override
    public void execute() {
        LOGGER.info("你用带有魔法的十字弓射杀了它!");
    }
}
