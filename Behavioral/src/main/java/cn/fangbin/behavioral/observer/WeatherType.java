package cn.fangbin.behavioral.observer;

/**
 * 天气类型枚举
 */
public enum WeatherType {

    SUNNY("晴天"),
    RAINY("雨天"),
    WINDY("大风"),
    COLD("寒潮");

    private final String description;

    WeatherType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }

    @Override
    public String toString() {
        return this.name();
    }
}
