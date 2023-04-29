package cn.fangbin.creational.factory_method;

/**
 * 铁匠接口，包含生成对象的方法的接口
 */
public interface Blacksmith {
    Weapon manufactureWeapon(WeaponType weaponType);
}
