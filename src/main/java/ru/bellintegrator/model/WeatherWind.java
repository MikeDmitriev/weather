package ru.bellintegrator.model;

import javax.persistence.*;

/**
 * Created by MADmitriev on 19.06.2017.
 */
@Entity
public class WeatherWind {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private int chill;
    @Column
    private int direction;
    @Column
    private int speed;
    @OneToOne(targetEntity = WeatherChannel.class, cascade = CascadeType.ALL, orphanRemoval = true)
    private WeatherChannel channel;

    public WeatherWind(){

    }

    public WeatherWind(int chill, int direction, int speed){
        this.chill = chill;
        this.direction = direction;
        this.speed = speed;
    }

    public int getChill() {
        return chill;
    }

    public void setChill(int chill) {
        this.chill = chill;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int direction) {
        this.direction = direction;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public WeatherChannel getChannel() {
        return channel;
    }

    public void setChannel(WeatherChannel channel) {
        this.channel = channel;
    }
}
