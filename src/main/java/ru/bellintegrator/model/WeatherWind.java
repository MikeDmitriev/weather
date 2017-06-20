package ru.bellintegrator.model;

import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by MADmitriev on 19.06.2017.
 */
@Embeddable
public class WeatherWind implements Serializable {
    private int chill;
    private int direction;
    private int speed;


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
}
