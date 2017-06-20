package ru.bellintegrator.model;

import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by MADmitriev on 19.06.2017.
 */
@Embeddable
public class WeatherResults implements Serializable {

    private WeatherChannel channel;

    public WeatherChannel getChannel() {
        return channel;
    }

    public void setChannel(WeatherChannel channel) {
        this.channel = channel;
    }
}
