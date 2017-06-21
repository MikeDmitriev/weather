package ru.bellintegrator.model;

import javax.persistence.*;

/**
 * Created by MADmitriev on 19.06.2017.
 */
@Entity
public class WeatherChannel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @OneToOne(targetEntity = WeatherUnits.class, cascade = CascadeType.ALL, orphanRemoval = true)
    private WeatherUnits units;
    @Column
    private String title;
    @Column
    private String link;
    @Column
    private String description;
    @Column
    private String language;
    @Column
    private String lastBuildDate;
    @Column
    private int ttl;
    @OneToOne(targetEntity = WeatherLocation.class, cascade = CascadeType.ALL, orphanRemoval = true)
    private WeatherLocation location;
    @OneToOne(targetEntity = WeatherWind.class, cascade = CascadeType.ALL, orphanRemoval = true)
    private WeatherWind wind;
    @OneToOne(targetEntity = WeatherAtmosphere.class, cascade = CascadeType.ALL, orphanRemoval = true)
    private WeatherAtmosphere atmosphere;
    @OneToOne(targetEntity = WeatherAstronomy.class, cascade = CascadeType.ALL, orphanRemoval = true)
    private WeatherAstronomy astronomy;
    @OneToOne(targetEntity = WeatherImage.class, cascade = CascadeType.ALL, orphanRemoval = true)
    private WeatherImage image;
    @OneToOne(targetEntity = WeatherItem.class, cascade = CascadeType.ALL, orphanRemoval = true)
    private WeatherItem item;
    @OneToOne(targetEntity = WeatherResults.class, cascade = CascadeType.ALL, orphanRemoval = true)
    private WeatherResults results;

    public WeatherChannel(){

    }

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

    public WeatherResults getResults() {
        return results;
    }

    public void setResults(WeatherResults results) {
        this.results = results;
    }
}
