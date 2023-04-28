package cn.fangbin.creational.factory;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.function.Supplier;

/**
 * 不同类型硬币的枚举
 */
@RequiredArgsConstructor
@Getter
public enum CoinType {

    COPPER(CopperCoin::new),
    COLD(GoldCoin::new);

    private final Supplier<Coin> constructor;
}
