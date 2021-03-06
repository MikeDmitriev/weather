package ru.bellintegrator.model;

import javax.persistence.*;

/**
 * Created by MADmitriev on 19.06.2017.
 */
@Entity
public class WeatherImage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column
    private String title;
    @Column
    private int width;
    @Column
    private int height;
    @Column
    private String link;
    @Column
    private String url;

    @OneToOne(targetEntity = WeatherChannel.class, cascade = CascadeType.ALL, orphanRemoval = true)
    private WeatherChannel channel;

    public WeatherImage(){

    }

    public WeatherImage(String title, int width, int height, String link, String url){
        this.title = title;
        this.width = width;
        this.height = height;
        this.link = link;
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public WeatherChannel getChannel() {
        return channel;
    }

    public void setChannel(WeatherChannel channel) {
        this.channel = channel;
    }
}