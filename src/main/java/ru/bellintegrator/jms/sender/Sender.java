package ru.bellintegrator.jms.sender;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import ru.bellintegrator.yahoo.response.YahooWeatherModel;

/**
 * Created by MADmitriev on 16.06.2017.
 */
public class Sender {

    private static final Logger LOGGER = LoggerFactory.getLogger(Sender.class);

    @Autowired
    private JmsTemplate jmsTemplate;

    public void send(YahooWeatherModel message) {
        LOGGER.info("sending message='{}'", message.toString());
        jmsTemplate.convertAndSend("weather.topic", message);
    }

}
