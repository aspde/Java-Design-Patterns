package cn.fangbin.behavioral.strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class LambdaStrategy {

    public enum Strategy implements DragonSlayingStrategy {

        MeleeStrategy(() -> LOGGER.info(
                "你用王者之剑砍下龙头!")),
        ProjectileStrategy(() -> LOGGER.info(
                "你用带有魔法的十字弓射杀了它!")),
        SpellStrategy(() -> LOGGER.info(
                "你施展分解咒，龙在一堆尘土中泯灭!"));

        private final DragonSlayingStrategy dragonSlayingStrategy;

        Strategy(DragonSlayingStrategy dragonSlayingStrategy) {
            this.dragonSlayingStrategy = dragonSlayingStrategy;
        }

        @Override
        public void execute() {
            dragonSlayingStrategy.execute();
        }
    }
}
