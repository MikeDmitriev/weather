package ru.bellintegrator.view;

import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by MADmitriev on 20.06.2017.
 */
public class WeatherConditionView implements Serializable {
    private int code;
    private String date;
    private int temp;
    private String text;

    public WeatherConditionView(){

    }

    public WeatherConditionView(int code, String date, int temp, String text){
        this.code = code;
        this.date = date;
        this.temp = temp;
        this.text = text;
    }

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
