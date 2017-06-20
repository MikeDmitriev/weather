package ru.bellintegrator.model;

import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by MADmitriev on 19.06.2017.
 */
@Embeddable
public class WeatherChannel implements Serializable {

    private WeatherUnits units;
    private String title;
    private String link;
    private String description;
    private String language;
    private String lastBuildDate;
    private int ttl;
    private WeatherLocation location;
    private WeatherWind wind;
    private WeatherAtmosphere atmosphere;
    private WeatherAstronomy astronomy;
    private WeatherImage image;
    private WeatherItem item;

    public WeatherUnits getUnits() {
        return units;
    }

    public void setUnits(WeatherUnits units) {
        this.units = units;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getLastBuildDate() {
        return lastBuildDate;
    }

    public void setLastBuildDate(String lastBuildDate) {
        this.lastBuildDate = lastBuildDate;
    }

    public int getTtl() {
        return ttl;
    }

    public void setTtl(int ttl) {
        this.ttl = ttl;
    }

    public WeatherLocation getLocation() {
        return location;
    }

    public void setLocation(WeatherLocation location) {
        this.location = location;
    }

    public WeatherWind getWind() {
        return wind;
    }

    public void setWind(WeatherWind wind) {
        this.wind = wind;
    }

    public WeatherAtmosphere getAtmosphere() {
        return atmosphere;
    }

    public void setAtmosphere(WeatherAtmosphere atmosphere) {
        this.atmosphere = atmosphere;
    }

    public WeatherAstronomy getAstronomy() {
        return astronomy;
    }

    public void setAstronomy(WeatherAstronomy astronomy) {
        this.astronomy = astronomy;
    }

    public WeatherImage getImage() {
        return image;
    }

    public void setImage(WeatherImage image) {
        this.image = image;
    }

    public WeatherItem getItem() {
        return item;
    }

    public void setItem(WeatherItem item) {
        this.item = item;
    }
}
