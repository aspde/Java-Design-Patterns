package cn.fangbin.behavioral.observer.generic;

import cn.fangbin.behavioral.observer.WeatherType;
import lombok.extern.slf4j.Slf4j;

/**
 * 泛型天气
 */
@Slf4j
public class GenWeather extends Observable<GenWeather, Race, WeatherType>  {

    private WeatherType currentWeather;

    public GenWeather() {
        currentWeather = WeatherType.SUNNY;
    }

    /**
     * 随着时间流逝天气改变
     */
    public void timePasses() {
        WeatherType[] enumValues = WeatherType.values();
        currentWeather = enumValues[(currentWeather.ordinal() + 1) % enumValues.length];
        LOGGER.info("天气变为{}.", currentWeather.getDescription());
        notifyObservers(currentWeather);
    }
}
