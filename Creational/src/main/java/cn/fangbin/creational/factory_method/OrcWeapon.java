package cn.fangbin.creational.factory_method;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * 矮人武器
 */
@RequiredArgsConstructor
@Getter
public class OrcWeapon implements Weapon {

    private final WeaponType weaponType;

    @Override
    public String toString() {
        return "一个矮人" + weaponType;
    }
}
