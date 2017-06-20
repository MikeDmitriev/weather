package ru.bellintegrator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;
import org.springframework.jms.annotation.EnableJms;
import ru.bellintegrator.yahoo.request.impl.YahooRequestSenderImpl;

/**
 * Created by MADmitriev on 14.06.2017.
 */
@ImportResource("config.xml")
@SpringBootApplication
@EnableJms
public class Application {


    public static void main(String[] args) {
        System.setProperty("org.apache.activemq.SERIALIZABLE_PACKAGES","*");
        SpringApplication.run(Application.class, args);
    }

    @Bean
    YahooRequestSenderImpl client(){
        return new YahooRequestSenderImpl();
    }

}
