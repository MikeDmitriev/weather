package ru.bellintegrator.view;

import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by MADmitriev on 19.06.2017.
 */
public class WeatherChannelView implements Serializable {

    private WeatherUnitsView units;
    private String title;
    private String link;
    private String description;
    private String language;
    private String lastBuildDate;
    private int ttl;
    private WeatherLocationView location;
    private WeatherWindView wind;
    private WeatherAtmosphereView atmosphere;
    private WeatherAstronomyView astronomy;
    private WeatherImageView image;
    private WeatherItemView item;

    public WeatherChannelView(){

    }

    public WeatherUnitsView getUnits() {
        return units;
    }

    public void setUnits(WeatherUnitsView units) {
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

    public WeatherLocationView getLocation() {
        return location;
    }

    public void setLocation(WeatherLocationView location) {
        this.location = location;
    }

    public WeatherWindView getWind() {
        return wind;
    }

    public void setWind(WeatherWindView wind) {
        this.wind = wind;
    }

    public WeatherAtmosphereView getAtmosphere() {
        return atmosphere;
    }

    public void setAtmosphere(WeatherAtmosphereView atmosphere) {
        this.atmosphere = atmosphere;
    }

    public WeatherAstronomyView getAstronomy() {
        return astronomy;
    }

    public void setAstronomy(WeatherAstronomyView astronomy) {
        this.astronomy = astronomy;
    }

    public WeatherImageView getImage() {
        return image;
    }

    public void setImage(WeatherImageView image) {
        this.image = image;
    }

    public WeatherItemView getItem() {
        return item;
    }

    public void setItem(WeatherItemView item) {
        this.item = item;
    }
}
