package cn.fangbin.creational.factory_method;

import lombok.RequiredArgsConstructor;

/**
 * 武器类型枚举
 */
@RequiredArgsConstructor
public enum WeaponType {

    SHORT_SWORD("短剑"),
    SPEAR("长矛"),
    AXE("斧头"),
    UNDEFINED("");

    private final String title;

    @Override
    public String toString() {
        return title;
    }
}
