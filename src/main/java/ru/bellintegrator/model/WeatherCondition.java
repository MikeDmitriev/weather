package ru.bellintegrator.model;

import javax.persistence.*;

/**
 * Created by MADmitriev on 20.06.2017.
 */
@Entity
public class WeatherCondition {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private int code;
    @Column
    private String date;
    @Column
    private int temp;
    @Column
    private String text;
    @OneToOne(targetEntity = WeatherItem.class, cascade = CascadeType.ALL, orphanRemoval = true)
    private WeatherItem item;

    public WeatherCondition(){

    }

    public WeatherCondition(int code, String date, int temp, String text){
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

    public WeatherItem getItem() {
        return item;
    }

    public void setItem(WeatherItem item) {
        this.item = item;
    }
}
