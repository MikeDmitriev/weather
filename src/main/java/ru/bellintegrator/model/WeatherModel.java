package ru.bellintegrator.model;

import javax.persistence.*;

/**
 * Created by MADmitriev on 14.06.2017.
 */
@Entity
public class WeatherModel {

    @Id
    private String city;
    @OneToOne(targetEntity = WeatherQuery.class, cascade = CascadeType.ALL, orphanRemoval = true)
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
