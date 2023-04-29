package cn.fangbin.structural.decorator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class App {

    public static void main(String[] args) {
        // 普通巨魔
        LOGGER.info("一个普通巨魔走了过来");
        Troll simpleTroll = new SimpleTroll();
        simpleTroll.attack();
        simpleTroll.fleeBattle();
        LOGGER.info("普通巨魔力量: {}\n", simpleTroll.getAttackPower());

        // 通过添加装饰器增强普通巨魔
        LOGGER.info("一个拿着大棍子的巨魔走了过来");
        Troll clubbedTroll = new ClubbedTroll(simpleTroll);
        clubbedTroll.attack();
        clubbedTroll.fleeBattle();
        LOGGER.info("大棍子巨魔力量: {}\n", clubbedTroll.getAttackPower());
    }
}
