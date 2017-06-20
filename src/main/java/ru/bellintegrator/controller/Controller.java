package ru.bellintegrator.controller;

import ru.bellintegrator.view.WeatherView;

/**
 * Created by MADmitriev on 14.06.2017.
 */
public interface Controller {
    boolean getWeather(String city);
    WeatherView getWeatherInCity(String city);
}
