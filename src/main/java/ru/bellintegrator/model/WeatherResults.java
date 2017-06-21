package ru.bellintegrator.model;

import javax.persistence.*;

/**
 * Created by MADmitriev on 19.06.2017.
 */
@Entity
public class WeatherResults {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @OneToOne(targetEntity = WeatherChannel.class, cascade = CascadeType.ALL, orphanRemoval = true)
    private WeatherChannel channel;
    @OneToOne(targetEntity = WeatherQuery.class, cascade = CascadeType.ALL, orphanRemoval = true)
    private WeatherQuery query;

    public WeatherResults(){

    }

    public WeatherChannel getChannel() {
        return channel;
    }

    public void setChannel(WeatherChannel channel) {
        this.channel = channel;
    }

    public WeatherQuery getQuery() {
        return query;
    }

    public void setQuery(WeatherQuery query) {
        this.query = query;
    }
}
