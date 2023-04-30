package cn.fangbin.behavioral.observer.generic;

import cn.fangbin.behavioral.observer.WeatherType;
import lombok.extern.slf4j.Slf4j;

/**
 * 泛型霍比特人
 */
@Slf4j
public class GenHobbits implements Race {
    @Override
    public void update(GenWeather weather, WeatherType weatherType) {
        LOGGER.info("霍比特人正处于{}天气", weatherType.getDescription());
    }
}
