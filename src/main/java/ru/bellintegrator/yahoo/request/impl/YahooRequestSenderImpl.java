package ru.bellintegrator.yahoo.request.impl;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import ru.bellintegrator.yahoo.request.YahooRequestSender;
import ru.bellintegrator.jms.sender.Sender;
import ru.bellintegrator.yahoo.response.YahooWeatherModel;

import java.io.IOException;


/**
 * Created by MADmitriev on 14.06.2017.
 */
public class YahooRequestSenderImpl implements YahooRequestSender {

    final private Logger log = LoggerFactory.getLogger(YahooRequestSenderImpl.class);

    @Autowired
    private Sender sender;

    @Override
    public boolean getWeather(String city) {

        log.info("city = " + city);

        RestTemplate restTemplate = new RestTemplate();
        String yql = "select * from weather.forecast where woeid in (select woeid from geo.places(1) where text=\"" + city + "\")";

        String yahooWeather = "https://query.yahooapis.com/v1/public/yql?q={q}&format={format}";

        ResponseEntity<String> response = restTemplate.getForEntity(yahooWeather, String.class, yql, "json");

        log.info("still not in the exception " + response.getStatusCode().toString());

        String body = response.getBody();

        ObjectMapper mapper = new ObjectMapper();
        YahooWeatherModel weather;

        try{
            weather = mapper.readValue(body, YahooWeatherModel.class);
            log.info(body);
            sender.send(weather);
            return true;
        }catch (IOException e){
            log.info("Exception!!! ", e);
            return false;
        }

    }

}
