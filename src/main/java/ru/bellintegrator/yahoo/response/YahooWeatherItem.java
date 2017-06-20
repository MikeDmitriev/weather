package ru.bellintegrator.yahoo.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.List;

/**
 * Created by MADmitriev on 20.06.2017.
 */
public class YahooWeatherItem implements Serializable {
    private String title;
    private double lat;
    @JsonProperty("long")
    private double someValue;
    private String link;
    private String pubDate;
    private YahooWeatherCondition condition;
    private List<YahooWeatherForecast> forecast;
    private String description;
    private YahooWeatherGuid guid;

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

    public YahooWeatherCondition getCondition() {
        return condition;
    }

    public void setCondition(YahooWeatherCondition condition) {
        this.condition = condition;
    }

    public List<YahooWeatherForecast> getForecast() {
        return forecast;
    }

    public void setForecast(List<YahooWeatherForecast> forecast) {
        this.forecast = forecast;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public YahooWeatherGuid getGuid() {
        return guid;
    }

    public void setGuid(YahooWeatherGuid guid) {
        this.guid = guid;
    }

    public void addForecast(YahooWeatherForecast forecast){
        this.forecast.add(forecast);
    }
}
