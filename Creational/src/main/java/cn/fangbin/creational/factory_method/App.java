package cn.fangbin.creational.factory_method;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class App {

    private static final String MANUFACTURED = "{}制造了{}";

    public static void main(String[] args) {

        Blacksmith blacksmith = new OrcBlacksmith();
        Weapon weapon = blacksmith.manufactureWeapon(WeaponType.SPEAR);
        LOGGER.info(MANUFACTURED, blacksmith, weapon);
        weapon = blacksmith.manufactureWeapon(WeaponType.AXE);
        LOGGER.info(MANUFACTURED, blacksmith, weapon);

        blacksmith = new ElfBlacksmith();
        weapon = blacksmith.manufactureWeapon(WeaponType.SPEAR);
        LOGGER.info(MANUFACTURED, blacksmith, weapon);
        weapon = blacksmith.manufactureWeapon(WeaponType.AXE);
        LOGGER.info(MANUFACTURED, blacksmith, weapon);
    }
}
