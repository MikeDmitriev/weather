package ru.bellintegrator.service;

import ru.bellintegrator.model.WeatherModel;
import ru.bellintegrator.view.WeatherView;

/**
 * Created by MADmitriev on 20.06.2017.
 */
public interface WeatherService {
    WeatherView getWeather(String city);

    void setWeather(WeatherModel weather);
}
