package cn.fangbin.creational.factory_method;

import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;

/**
 * 矮人铁匠，用于创建新对象的具体子类
 */
public class OrcBlacksmith implements Blacksmith {

    private static final Map<WeaponType, OrcWeapon> ORCARSENAL;

    static {
        ORCARSENAL = new EnumMap<>(WeaponType.class);
        Arrays.stream(WeaponType.values()).forEach(type -> ORCARSENAL.put(type, new OrcWeapon(type)));
    }

    @Override
    public Weapon manufactureWeapon(WeaponType weaponType) {
        return ORCARSENAL.get(weaponType);
    }

    @Override
    public String toString() {
        return "矮人铁匠";
    }
}
