package ru.bellintegrator.model;

import javax.persistence.*;

/**
 * Created by MADmitriev on 20.06.2017.
 */
@Entity
public class WeatherGuid {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private boolean isPermaLink;
    @OneToOne(targetEntity = WeatherItem.class, cascade = CascadeType.ALL, orphanRemoval = true)
    private WeatherItem item;

    public WeatherGuid(){

    }
    public WeatherGuid(boolean isPermaLink){
        this.isPermaLink = isPermaLink;
    }

    public boolean isPermaLink() {
        return isPermaLink;
    }

    public void setPermaLink(boolean isPermaLink) {
        this.isPermaLink = isPermaLink;
    }

    public WeatherItem getItem() {
        return item;
    }

    public void setItem(WeatherItem item) {
        this.item = item;
    }
}