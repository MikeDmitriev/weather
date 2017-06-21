package ru.bellintegrator.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by MADmitriev on 20.06.2017.
 */
@Entity
public class WeatherItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String title;
    @Column
    private double lat;
    @Column
    private double someValue;
    @Column
    private String link;
    @Column
    private String pubDate;
    @OneToOne(targetEntity = WeatherCondition.class, cascade = CascadeType.ALL, orphanRemoval = true)
    private WeatherCondition condition;
    @OneToMany(mappedBy="id")
    private List<WeatherForecast> forecast;
    @Column(length = 1024)
    private String description;
    @OneToOne(targetEntity = WeatherGuid.class, cascade = CascadeType.ALL, orphanRemoval = true)
    private WeatherGuid guid;
    @OneToOne(targetEntity = WeatherChannel.class, cascade = CascadeType.ALL, orphanRemoval = true)
    private WeatherChannel channel;

    public WeatherItem(){
        this.forecast = new ArrayList<WeatherForecast>();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getSomeValue() {
        return someValue;
    }

    public void setSomeValue(double someValue) {
        this.someValue = someValue;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getPubDate() {
        return pubDate;
    }

    public void setPubDate(String pubDate) {
        this.pubDate = pubDate;
    }

    public WeatherCondition getCondition() {
        return condition;
    }

    public void setCondition(WeatherCondition condition) {
        this.condition = condition;
    }

    public List<WeatherForecast> getForecast() {
        return forecast;
    }

    public void setForecast(List<WeatherForecast> forecast) {
        this.forecast = forecast;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public WeatherGuid getGuid() {
        return guid;
    }

    public void setGuid(WeatherGuid guid) {
        this.guid = guid;
    }

    public void addForecast(WeatherForecast forecast){
        this.forecast.add(forecast);
    }
}
