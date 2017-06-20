package ru.bellintegrator.model;

import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by MADmitriev on 19.06.2017.
 */
@Embeddable
public class WeatherAstronomy implements Serializable {
    private String sunrise;
    private String sunset;

    public String getSunrise() {
        return sunrise;
    }

    public void setSunrise(String sunrise) {
        this.sunrise = sunrise;
    }

    public String getSunset() {
        return sunset;
    }

    public void setSunset(String sunset) {
        this.sunset = sunset;
    }
}
