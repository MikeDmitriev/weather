package ru.bellintegrator.yahoo.response;

import java.io.Serializable;

/**
 * Created by MADmitriev on 19.06.2017.
 */
public class YahooWeatherQuery implements Serializable {

    private int count;
    private String created;
    private String lang;
    private YahooWeatherResults results;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public String getLang() {
        return lang;
    }

    public void setLang(String lang) {
        this.lang = lang;
    }

    public YahooWeatherResults getResults() {
        return results;
    }

    public void setResults(YahooWeatherResults results) {
        this.results = results;
    }
}
