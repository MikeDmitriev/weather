package ru.bellintegrator.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;
import ru.bellintegrator.dao.WeatherDAO;
import ru.bellintegrator.mapping.ModelToViewMapper;
import ru.bellintegrator.model.WeatherModel;
import ru.bellintegrator.model.WeatherQuery;
import ru.bellintegrator.service.WeatherService;
import ru.bellintegrator.view.WeatherView;

import javax.annotation.PostConstruct;

/**
 * Created by MADmitriev on 20.06.2017.
 */
@Service
//@Scope(value = "session", proxyMode = ScopedProxyMode.INTERFACES)
public class WeatherServiceImpl implements WeatherService{

    private WeatherDAO weatherDAO;

    @Autowired
    public WeatherServiceImpl(WeatherDAO weatherDAO) {

        this.weatherDAO = weatherDAO;
    }

//    @PostConstruct
//    private void init() {
//        WeatherModel model = new WeatherModel();
//        model.setCity("penza");
//        model.setQuery(new WeatherQuery());
//
//        weatherDAO.create(model);
//    }

    @Override
    public WeatherView getWeather(String city){
        ModelToViewMapper modelToViewMapper = new ModelToViewMapper();
        WeatherModel model = weatherDAO.getById(city);
        WeatherView weatherView = modelToViewMapper.mapModel(model);
        return weatherView;
    }

    @Override
    public void setWeather(WeatherModel weather){
        weatherDAO.insert(weather);
    }
}
