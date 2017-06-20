package ru.bellintegrator.model;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by MADmitriev on 14.06.2017.
 */
public class WeatherModel implements Serializable {

    private String city;

    private WeatherQuery query;

    public WeatherModel(){

    }

    public WeatherQuery getQuery() {
        return query;
    }

    public void setQuery(WeatherQuery query) {
        this.query = query;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
