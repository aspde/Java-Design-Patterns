package cn.fangbin.behavioral.strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class App {

    private static final String RED_DRAGON_EMERGES = "红龙出现在你面前";
    private static final String GREEN_DRAGON_SPOTTED = "绿龙出现在你面前";
    private static final String BLACK_DRAGON_LANDS = "黑龙出现在你面前";

    public static void main(String[] args) {

        // GoF 策略模式
        LOGGER.info(GREEN_DRAGON_SPOTTED);
        DragonSlayer dragonSlayer = new DragonSlayer(new MeleeStrategy());
        dragonSlayer.goToBattle();
        LOGGER.info(RED_DRAGON_EMERGES);
        dragonSlayer.changeStrategy(new ProjectileStrategy());
        dragonSlayer.goToBattle();
        LOGGER.info(BLACK_DRAGON_LANDS);
        dragonSlayer.changeStrategy(new SpellStrategy());
        dragonSlayer.goToBattle();

        // Java8 函数式实现策略模式
        LOGGER.info(GREEN_DRAGON_SPOTTED);
        dragonSlayer = new DragonSlayer(
                () -> LOGGER.info("你用王者之剑砍下龙头!"));
        dragonSlayer.goToBattle();
        LOGGER.info(RED_DRAGON_EMERGES);
        dragonSlayer = new DragonSlayer(
                () -> LOGGER.info("你用带有魔法的十字弓射杀了它!"));
        dragonSlayer.goToBattle();
        LOGGER.info(BLACK_DRAGON_LANDS);
        dragonSlayer = new DragonSlayer(
                () -> LOGGER.info("你施展分解咒，龙在一堆尘土中泯灭!"));
        dragonSlayer.goToBattle();

        // 带枚举策略模式的 Java8 lambda 实现
        LOGGER.info(GREEN_DRAGON_SPOTTED);
        dragonSlayer.changeStrategy(LambdaStrategy.Strategy.MeleeStrategy);
        dragonSlayer.goToBattle();
        LOGGER.info(RED_DRAGON_EMERGES);
        dragonSlayer.changeStrategy(LambdaStrategy.Strategy.ProjectileStrategy);
        dragonSlayer.goToBattle();
        LOGGER.info(BLACK_DRAGON_LANDS);
        dragonSlayer.changeStrategy(LambdaStrategy.Strategy.SpellStrategy);
        dragonSlayer.goToBattle();
    }
}
