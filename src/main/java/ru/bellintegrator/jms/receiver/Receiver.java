package ru.bellintegrator.jms.receiver;

import java.util.concurrent.CountDownLatch;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import ru.bellintegrator.model.WeatherModel;
import ru.bellintegrator.service.WeatherService;
import ru.bellintegrator.yahoo.response.YahooWeatherModel;

/**
 * Created by MADmitriev on 16.06.2017.
 */
public class Receiver {

    private static final Logger LOGGER = LoggerFactory.getLogger(Receiver.class);

    private CountDownLatch latch = new CountDownLatch(1);

    public CountDownLatch getLatch() {
        return latch;
    }

    @JmsListener(destination = "weather.topic")
    public void receive(YahooWeatherModel message) {
        LOGGER.info("received message='{}'", message.toString());
        latch.countDown();
    }
}
