package ru.bellintegrator.controller.impl;

import com.fasterxml.jackson.annotation.JsonValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.bellintegrator.service.WeatherService;
import ru.bellintegrator.view.WeatherView;
import ru.bellintegrator.yahoo.request.YahooRequestSender;
import ru.bellintegrator.controller.Controller;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

/**
 * Created by MADmitriev on 14.06.2017.
 */
@RestController
public class ControllerImpl implements Controller {

    final private Logger log = LoggerFactory.getLogger(ControllerImpl.class);

    private final WeatherService weatherService;

    @Autowired
    public ControllerImpl(WeatherService weatherService){
        this.weatherService = weatherService;
    }

    @Autowired
    private YahooRequestSender yahooYahooRequestSender;

    @Override
    @RequestMapping(value = "/submit", method = RequestMethod.GET)
    public boolean getWeather(@RequestParam String city) {
        return yahooYahooRequestSender.getWeather(city);
    }

    @Override
    @RequestMapping(value = "/weather", produces = APPLICATION_JSON_VALUE, method = RequestMethod.GET)
    public WeatherView getWeatherInCity(@RequestParam String city) {
        return weatherService.getWeather(city);
    }
}
