package ru.bellintegrator.view;

import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by MADmitriev on 19.06.2017.
 */
public class WeatherQueryView implements Serializable {

    private int count;
    private String created;
    private String lang;
    private WeatherResultsView results;

    public WeatherQueryView(){

    }

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

    public WeatherResultsView getResults() {
        return results;
    }

    public void setResults(WeatherResultsView results) {
        this.results = results;
    }
}
