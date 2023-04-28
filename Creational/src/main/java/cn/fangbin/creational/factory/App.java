package cn.fangbin.creational.factory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class App {

    public static void main(String[] args) {
        LOGGER.info("硬币工厂开始生产");
        Coin coin1 = CoinFactory.getCoin(CoinType.COLD);
        Coin coin2 = CoinFactory.getCoin(CoinType.COPPER);
        LOGGER.info(coin1.getDescription());
        LOGGER.info(coin2.getDescription());
    }
}
