package ru.bellintegrator.yahoo.response;

import java.io.Serializable;

/**
 * Created by MADmitriev on 14.06.2017.
 */
public class YahooWeatherModel implements Serializable {

    private YahooWeatherQuery query;

    public YahooWeatherQuery getQuery() {
        return query;
    }

    public void setQuery(YahooWeatherQuery query) {
        this.query = query;
    }
}
