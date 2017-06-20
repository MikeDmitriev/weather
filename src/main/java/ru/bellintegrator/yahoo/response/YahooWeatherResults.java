package ru.bellintegrator.yahoo.response;

import java.io.Serializable;

/**
 * Created by MADmitriev on 19.06.2017.
 */
public class YahooWeatherResults implements Serializable {

    private YahooWeatherChannel channel;

    public YahooWeatherChannel getChannel() {
        return channel;
    }

    public void setChannel(YahooWeatherChannel channel) {
        this.channel = channel;
    }
}
