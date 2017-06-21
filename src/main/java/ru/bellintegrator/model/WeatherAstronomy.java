package ru.bellintegrator.model;

import javax.persistence.*;


/**
 * Created by MADmitriev on 19.06.2017.
 */
@Entity
public class WeatherAstronomy {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String sunrise;
    @Column
    private String sunset;
    @OneToOne(targetEntity = WeatherChannel.class, cascade = CascadeType.ALL, orphanRemoval = true)
    private WeatherChannel channel;

    public WeatherAstronomy(){

    }

    public WeatherAstronomy(String sunrise, String sunset){
        this.sunrise = sunrise;
        this.sunset = sunset;
    }

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

    public WeatherChannel getChannel() {
        return channel;
    }

    public void setChannel(WeatherChannel channel) {
        this.channel = channel;
    }
}
