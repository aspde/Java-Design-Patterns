package cn.fangbin.behavioral.observer.generic;

import cn.fangbin.behavioral.observer.WeatherType;
import lombok.extern.slf4j.Slf4j;

/**
 * 泛型兽人
 */
@Slf4j
public class GenOrcs implements Race {
    @Override
    public void update(GenWeather weather, WeatherType weatherType) {
        LOGGER.info("兽人正处于{}天气", weatherType.getDescription());
    }
}
