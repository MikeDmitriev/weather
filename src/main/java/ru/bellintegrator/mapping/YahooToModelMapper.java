package ru.bellintegrator.mapping;

import ru.bellintegrator.model.*;
import ru.bellintegrator.yahoo.response.*;

/**
 * Created by MADmitriev on 21.06.2017.
 */
public class YahooToModelMapper {

    private WeatherAstronomy mapAstronomy(YahooWeatherAstronomy yahooWeatherAstronomy) {
        return new WeatherAstronomy(yahooWeatherAstronomy.getSunrise(), yahooWeatherAstronomy.getSunset());
    }

    private WeatherAtmosphere mapAtmosphere(YahooWeatherAtmosphere yahooWeatherAtmosphere) {
        return new WeatherAtmosphere(yahooWeatherAtmosphere.getHumidity(),
                yahooWeatherAtmosphere.getPressure(),
                yahooWeatherAtmosphere.getRising(),
                yahooWeatherAtmosphere.getVisibility());
    }

    private WeatherCondition mapCondition(YahooWeatherCondition yahooWeatherCondition) {
        return new WeatherCondition(yahooWeatherCondition.getCode(),
                yahooWeatherCondition.getDate(),
                yahooWeatherCondition.getTemp(),
                yahooWeatherCondition.getText());
    }

    private WeatherForecast mapForecast(YahooWeatherForecast yahooWeatherForecast) {
        return new WeatherForecast(yahooWeatherForecast.getCode(),
                yahooWeatherForecast.getDate(),
                yahooWeatherForecast.getDay(),
                yahooWeatherForecast.getHigh(),
                yahooWeatherForecast.getLow(),
                yahooWeatherForecast.getText());
    }

    private WeatherGuid mapGuid(YahooWeatherGuid yahooWeatherGuid) {
        return new WeatherGuid(yahooWeatherGuid.isPermaLink());
    }

    private WeatherImage mapImage(YahooWeatherImage yahooWeatherImage) {
        return new WeatherImage(yahooWeatherImage.getTitle(),
                yahooWeatherImage.getWidth(),
                yahooWeatherImage.getHeight(),
                yahooWeatherImage.getLink(),
                yahooWeatherImage.getUrl());
    }

    private WeatherItem mapItem(YahooWeatherItem yahooWeatherItem) {
        WeatherItem weatherItem = new WeatherItem();

        weatherItem.setCondition(mapCondition(yahooWeatherItem.getCondition()));
        weatherItem.setDescription("no description");
        weatherItem.setGuid(mapGuid(yahooWeatherItem.getGuid()));
        weatherItem.setLat(yahooWeatherItem.getLat());
        weatherItem.setLink(yahooWeatherItem.getLink());
        weatherItem.setPubDate(yahooWeatherItem.getPubDate());
        weatherItem.setSomeValue(yahooWeatherItem.getSomeValue());
        weatherItem.setTitle(yahooWeatherItem.getTitle());

        for (YahooWeatherForecast yahooForecast : yahooWeatherItem.getForecast()) {
            weatherItem.addForecast(mapForecast(yahooForecast));
        }
        return weatherItem;
    }

    private WeatherLocation mapLocation(YahooWeatherLocation yahooWeatherLocation) {
        return new WeatherLocation(yahooWeatherLocation.getCity(),
                yahooWeatherLocation.getCountry(),
                yahooWeatherLocation.getRegion());
    }

    private WeatherUnits mapUnits(YahooWeatherUnits yahooWeatherUnits) {
        return new WeatherUnits(yahooWeatherUnits.getDistance(),
                yahooWeatherUnits.getPressure(),
                yahooWeatherUnits.getSpeed(),
                yahooWeatherUnits.getTemperature());
    }

    private WeatherWind mapWind(YahooWeatherWind yahooWeatherWind) {
        return new WeatherWind(yahooWeatherWind.getChill(),
                yahooWeatherWind.getDirection(),
                yahooWeatherWind.getSpeed());
    }

    private WeatherChannel mapChannel(YahooWeatherChannel yahooWeatherChannel) {
        WeatherChannel weatherChannel = new WeatherChannel();

        weatherChannel.setAstronomy(mapAstronomy(yahooWeatherChannel.getAstronomy()));
        weatherChannel.setAtmosphere(mapAtmosphere(yahooWeatherChannel.getAtmosphere()));
        weatherChannel.setDescription(yahooWeatherChannel.getDescription());
        weatherChannel.setImage(mapImage(yahooWeatherChannel.getImage()));
        weatherChannel.setItem(mapItem(yahooWeatherChannel.getItem()));
        weatherChannel.setLanguage(yahooWeatherChannel.getLanguage());
        weatherChannel.setLastBuildDate(yahooWeatherChannel.getLastBuildDate());
        weatherChannel.setLink(yahooWeatherChannel.getLink());
        weatherChannel.setLocation(mapLocation(yahooWeatherChannel.getLocation()));
        weatherChannel.setTitle(yahooWeatherChannel.getTitle());
        weatherChannel.setTtl(yahooWeatherChannel.getTtl());
        weatherChannel.setUnits(mapUnits(yahooWeatherChannel.getUnits()));
        weatherChannel.setWind(mapWind(yahooWeatherChannel.getWind()));

        return weatherChannel;
    }

    private WeatherResults mapResults(YahooWeatherResults yahooWeatherResults) {
        WeatherResults weatherResults = new WeatherResults();

        weatherResults.setChannel(mapChannel(yahooWeatherResults.getChannel()));

        return weatherResults;
    }

    private WeatherQuery mapQuery(YahooWeatherQuery yahooWeatherQuery) {
        WeatherQuery weatherQuery = new WeatherQuery();

        weatherQuery.setCount(yahooWeatherQuery.getCount());
        weatherQuery.setCreated(yahooWeatherQuery.getCreated());
        weatherQuery.setLang(yahooWeatherQuery.getLang());
        weatherQuery.setResults(mapResults(yahooWeatherQuery.getResults()));

        return weatherQuery;
    }

    public WeatherModel mapModel(YahooWeatherModel yahooWeatherModel) {
        WeatherModel weatherModel = new WeatherModel();
        YahooWeatherLocation yahooWeatherLocation = yahooWeatherModel.getQuery().getResults().getChannel().getLocation();
        String city = yahooWeatherLocation.getCity();
//        + " " + yahooWeatherLocation.getCountry() + " " + yahooWeatherLocation.getRegion();

        weatherModel.setQuery(mapQuery(yahooWeatherModel.getQuery()));
        weatherModel.setCity(city);

        return weatherModel;
    }
}
