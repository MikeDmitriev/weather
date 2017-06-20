package ru.bellintegrator.jms.receiver;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;
import org.springframework.jms.config.DefaultJmsListenerContainerFactory;
import ru.bellintegrator.service.WeatherService;
import ru.bellintegrator.service.impl.WeatherServiceImpl;

/**
 * Created by MADmitriev on 16.06.2017.
 */
@Configuration
@EnableJms
public class ReceiverConfig {
    private final Logger log = LoggerFactory.getLogger(ReceiverConfig.class);

    @Value("${activemq.broker-url:vm://127.0.0.1:61616}")
    private String brokerUrl;

    @Bean
    public ActiveMQConnectionFactory activeMQConnectionFactory() {
        ActiveMQConnectionFactory activeMQConnectionFactory = new ActiveMQConnectionFactory();
        activeMQConnectionFactory.setBrokerURL("vm://localhost:61616");

        return activeMQConnectionFactory;
    }

    @Bean
    public DefaultJmsListenerContainerFactory jmsListenerContainerFactory() {
        DefaultJmsListenerContainerFactory factory = new DefaultJmsListenerContainerFactory();
        factory.setConnectionFactory(activeMQConnectionFactory());
        factory.setConcurrency("3-10");

        return factory;
    }

//    @Bean
//    public Topic topic(ActiveMQConnectionFactory activeMQConnectionFactory) {
//
//        try {
//            Connection connection = activeMQConnectionFactory.createConnection();
//            Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
//            return session.createTopic("weather");
//        }catch (JMSException e){
//            log.info("Exception:", e);
//        }
//        return null;
//    }

    @Bean
    public Receiver receiver() {
        return new Receiver();
    }
}
