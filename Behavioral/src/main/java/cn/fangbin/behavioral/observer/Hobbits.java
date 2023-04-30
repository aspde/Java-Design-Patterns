package cn.fangbin.behavioral.observer;

import lombok.extern.slf4j.Slf4j;

/**
 * 霍比特人
 */
@Slf4j
public class Hobbits implements WeatherObserver {
    @Override
    public void update(WeatherType currentWeather) {
        LOGGER.info("霍比特人正处于{}天气", currentWeather.getDescription());
    }
}
