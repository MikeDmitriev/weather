package ru.bellintegrator.model;

import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by MADmitriev on 20.06.2017.
 */
@Embeddable
public class WeatherCondition implements Serializable {
    private int code;
    private String date;
    private int temp;
    private String text;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
