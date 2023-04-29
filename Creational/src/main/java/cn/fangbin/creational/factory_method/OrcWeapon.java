package cn.fangbin.creational.factory_method;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * 兽人武器
 */
@RequiredArgsConstructor
@Getter
public class OrcWeapon implements Weapon {

    private final WeaponType weaponType;

    @Override
    public String toString() {
        return "一个兽人" + weaponType;
    }
}
