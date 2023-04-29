package cn.fangbin.creational.factory_method;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * 精灵武器
 */
@RequiredArgsConstructor
@Getter
public class ElfWeapon implements Weapon {

    private final WeaponType weaponType;

    @Override
    public String toString() {
        return "一个精灵" + weaponType;
    }
}
