package ru.bellintegrator.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import ru.bellintegrator.dao.WeatherDAO;
import ru.bellintegrator.model.WeatherModel;
import ru.bellintegrator.service.WeatherService;
import ru.bellintegrator.view.WeatherView;

/**
 * Created by MADmitriev on 20.06.2017.
 */
@Service
@Scope(value = "session", proxyMode = ScopedProxyMode.INTERFACES)
public class WeatherServiceImpl implements WeatherService{

    private WeatherDAO weatherDAO;

    @Autowired
    public WeatherServiceImpl(WeatherDAO weatherDAO) {

        this.weatherDAO = weatherDAO;
    }

    @Override
    public WeatherView getWeather(String city){
        return new WeatherView(weatherDAO.getById(city));
    }

    @Override
    public void setWeather(WeatherModel weather){
        weatherDAO.insert(weather);
    }
}
