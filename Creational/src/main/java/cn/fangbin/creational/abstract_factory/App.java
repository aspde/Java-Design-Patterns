package cn.fangbin.creational.abstract_factory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class App implements Runnable {

    private final Kingdom kingdom = new Kingdom();

    public Kingdom getKingdom() {
        return kingdom;
    }

    public static void main(String[] args) {
        App app = new App();
        app.run();
    }

    @Override
    public void run() {
        LOGGER.info("精灵王国");
        createKingdom(Kingdom.FactoryMaker.KingdomType.ELF);
        LOGGER.info(kingdom.getArmy().getDescription());
        LOGGER.info(kingdom.getCastle().getDescription());
        LOGGER.info(kingdom.getKing().getDescription());

        LOGGER.info("矮人王国");
        createKingdom(Kingdom.FactoryMaker.KingdomType.ORC);
        LOGGER.info(kingdom.getArmy().getDescription());
        LOGGER.info(kingdom.getCastle().getDescription());
        LOGGER.info(kingdom.getKing().getDescription());
    }

    /**
     * 创建王国
     */
    public void createKingdom(final Kingdom.FactoryMaker.KingdomType kingdomType) {
        final KingdomFactory kingdomFactory = Kingdom.FactoryMaker.makeFactory(kingdomType);
        kingdom.setKing(kingdomFactory.createKing());
        kingdom.setCastle(kingdomFactory.createCastle());
        kingdom.setArmy(kingdomFactory.createArmy());
    }
}