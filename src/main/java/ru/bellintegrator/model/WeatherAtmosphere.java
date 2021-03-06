package ru.bellintegrator.model;

import javax.persistence.*;

/**
 * Created by MADmitriev on 19.06.2017.
 */
@Entity
public class WeatherAtmosphere {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private int humidity;
    @Column
    private double pressure;
    @Column
    private int rising;
    @Column
    private double visibility;
    @OneToOne(targetEntity = WeatherChannel.class, cascade = CascadeType.ALL, orphanRemoval = true)
    private WeatherChannel channel;

    public WeatherAtmosphere(){

    }
    public WeatherAtmosphere(int humidity, double pressure, int rising, double visibility){
        this.humidity = humidity;
        this.pressure = pressure;
        this.rising = rising;
        this.visibility = visibility;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public double getPressure() {
        return pressure;
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
    }

    public int getRising() {
        return rising;
    }

    public void setRising(int rising) {
        this.rising = rising;
    }

    public double getVisibility() {
        return visibility;
    }

    public void setVisibility(double visibility) {
        this.visibility = visibility;
    }

    public WeatherChannel getChannel() {
        return channel;
    }

    public void setChannel(WeatherChannel channel) {
        this.channel = channel;
    }
}
