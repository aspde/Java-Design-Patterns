package cn.fangbin.behavioral.observer;

import cn.fangbin.behavioral.observer.generic.GenHobbits;
import cn.fangbin.behavioral.observer.generic.GenOrcs;
import cn.fangbin.behavioral.observer.generic.GenWeather;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class App {

    public static void main(String[] args) {

        Weather weather = new Weather();
        weather.addObserver(new Orcs());
        weather.addObserver(new Hobbits());

        weather.timePasses();
        weather.timePasses();
        weather.timePasses();
        weather.timePasses();

        // 由java泛型和集合启发的泛型观察者
        LOGGER.info("----------运行泛型版本----------");
        GenWeather genericWeather = new GenWeather();
        genericWeather.addObserver(new GenOrcs());
        genericWeather.addObserver(new GenHobbits());

        genericWeather.timePasses();
        genericWeather.timePasses();
        genericWeather.timePasses();
        genericWeather.timePasses();
    }
}
