package ru.bellintegrator.model;

import javax.persistence.*;

/**
 * Created by MADmitriev on 19.06.2017.
 */
@Entity
public class WeatherQuery {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private int count;
    @Column
    private String created;
    @Column
    private String lang;
    @OneToOne(targetEntity = WeatherResults.class, cascade = CascadeType.ALL, orphanRemoval = true)
    private WeatherResults results;
    @OneToOne(targetEntity = WeatherModel.class, cascade = CascadeType.ALL, orphanRemoval = true)
    private WeatherModel model;

    public WeatherQuery(){

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

    public WeatherResults getResults() {
        return results;
    }

    public void setResults(WeatherResults results) {
        this.results = results;
    }

    public WeatherModel getModel() {
        return model;
    }

    public void setModel(WeatherModel model) {
        this.model = model;
    }
}
