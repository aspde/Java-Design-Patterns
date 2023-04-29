package cn.fangbin.creational.factory_method;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;

/**
 * 精灵铁匠，用于创建新对象的具体子类
 */
public class ElfBlacksmith implements Blacksmith {

    private static final Map<WeaponType, ElfWeapon> ELFARSENAL;

    static {
        ELFARSENAL = new EnumMap<>(WeaponType.class);
        Arrays.stream(WeaponType.values()).forEach(type -> ELFARSENAL.put(type, new ElfWeapon(type)));
    }

    @Override
    public Weapon manufactureWeapon(WeaponType weaponType) {
        return ELFARSENAL.get(weaponType);
    }

    @Override
    public String toString() {
        return "精灵铁匠";
    }
}
