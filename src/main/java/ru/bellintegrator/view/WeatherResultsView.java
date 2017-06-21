package ru.bellintegrator.view;

import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by MADmitriev on 19.06.2017.
 */
public class WeatherResultsView implements Serializable {

    private WeatherChannelView channel;

    public WeatherResultsView(){

    }

    public WeatherChannelView getChannel() {
        return channel;
    }

    public void setChannel(WeatherChannelView channel) {
        this.channel = channel;
    }
}
