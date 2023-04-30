package cn.fangbin.behavioral.observer;

/**
 * 观察者接口
 */
public interface WeatherObserver {
    void update(WeatherType currentWeather);
}
