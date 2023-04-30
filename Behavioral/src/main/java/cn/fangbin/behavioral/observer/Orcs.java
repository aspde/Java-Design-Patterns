package cn.fangbin.behavioral.observer;

import lombok.extern.slf4j.Slf4j;

/**
 * 兽人
 */
@Slf4j
public class Orcs implements WeatherObserver {
    @Override
    public void update(WeatherType currentWeather) {
        LOGGER.info("兽人正处于{}天气", currentWeather.getDescription());
    }
}
