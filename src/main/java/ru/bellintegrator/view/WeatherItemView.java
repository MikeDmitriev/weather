package ru.bellintegrator.view;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by MADmitriev on 20.06.2017.
 */
public class WeatherItemView implements Serializable {
    private String title;
    private double lat;
    @JsonProperty("long")
    private double someValue;
    private String link;
    private String pubDate;
    private WeatherConditionView condition;
    private List<WeatherForecastView> forecast;
    private String description;
    private WeatherGuidView guid;

    public WeatherItemView() {
        this.forecast = new ArrayList<WeatherForecastView>();
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

    public WeatherConditionView getCondition() {
        return condition;
    }

    public void setCondition(WeatherConditionView condition) {
        this.condition = condition;
    }

    public List<WeatherForecastView> getForecast() {
        return forecast;
    }

    public void setForecast(List<WeatherForecastView> forecast) {
        this.forecast = forecast;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public WeatherGuidView getGuid() {
        return guid;
    }

    public void setGuid(WeatherGuidView guid) {
        this.guid = guid;
    }

    public void addForecast(WeatherForecastView forecast) {
        this.forecast.add(forecast);
    }
}
