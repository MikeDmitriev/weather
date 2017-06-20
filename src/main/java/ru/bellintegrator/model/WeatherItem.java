package ru.bellintegrator.model;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.List;

/**
 * Created by MADmitriev on 20.06.2017.
 */
@Embeddable
public class WeatherItem implements Serializable {
    private String title;
    private double lat;
    private double someValue;
    private String link;
    private String pubDate;
    private WeatherCondition condition;
    private List<WeatherForecast> forecast;
    private String description;
    private WeatherGuid guid;

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
