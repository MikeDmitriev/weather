package ru.bellintegrator.mapping;

import ru.bellintegrator.model.*;
import ru.bellintegrator.view.*;

/**
 * Created by MADmitriev on 21.06.2017.
 */
public class ModelToViewMapper {

    private WeatherAstronomyView mapAstronomy(WeatherAstronomy weatherAstronomy) {
        return new WeatherAstronomyView(weatherAstronomy.getSunrise(), weatherAstronomy.getSunset());
    }

    private WeatherAtmosphereView mapAtmosphere(WeatherAtmosphere weatherAtmosphere) {
        return new WeatherAtmosphereView(weatherAtmosphere.getHumidity(),
                weatherAtmosphere.getPressure(),
                weatherAtmosphere.getRising(),
                weatherAtmosphere.getVisibility());
    }

    private WeatherConditionView mapCondition(WeatherCondition weatherCondition) {
        return new WeatherConditionView(weatherCondition.getCode(),
                weatherCondition.getDate(),
                weatherCondition.getTemp(),
                weatherCondition.getText());
    }

    private WeatherForecastView mapForecast(WeatherForecast weatherForecast) {
        return new WeatherForecastView(weatherForecast.getCode(),
                weatherForecast.getDate(),
                weatherForecast.getDay(),
                weatherForecast.getHigh(),
                weatherForecast.getLow(),
                weatherForecast.getText());
    }

    private WeatherGuidView mapGuid(WeatherGuid weatherGuid) {
        return new WeatherGuidView(weatherGuid.isPermaLink());
    }

    private WeatherImageView mapImage(WeatherImage weatherImage) {
        return new WeatherImageView(weatherImage.getTitle(),
                weatherImage.getWidth(),
                weatherImage.getHeight(),
                weatherImage.getLink(),
                weatherImage.getUrl());
    }

    private WeatherItemView mapItem(WeatherItem weatherItem) {
        WeatherItemView weatherItemView = new WeatherItemView();

        weatherItemView.setCondition(mapCondition(weatherItem.getCondition()));
        weatherItemView.setDescription(weatherItem.getDescription());
        weatherItemView.setGuid(mapGuid(weatherItem.getGuid()));
        weatherItemView.setLat(weatherItem.getLat());
        weatherItemView.setLink(weatherItem.getLink());
        weatherItemView.setPubDate(weatherItem.getPubDate());
        weatherItemView.setSomeValue(weatherItem.getSomeValue());
        weatherItemView.setTitle(weatherItem.getTitle());

        for (WeatherForecast forecast : weatherItem.getForecast()) {
            weatherItemView.addForecast(mapForecast(forecast));
        }
        return weatherItemView;
    }

    private WeatherLocationView mapLocation(WeatherLocation weatherLocation) {
        return new WeatherLocationView(weatherLocation.getCity(),
                weatherLocation.getCountry(),
                weatherLocation.getRegion());
    }

    private WeatherUnitsView mapUnits(WeatherUnits weatherUnits) {
        return new WeatherUnitsView(weatherUnits.getDistance(),
                weatherUnits.getPressure(),
                weatherUnits.getSpeed(),
                weatherUnits.getTemperature());
    }

    private WeatherWindView mapWind(WeatherWind weatherWind) {
        return new WeatherWindView(weatherWind.getChill(),
                weatherWind.getDirection(),
                weatherWind.getSpeed());
    }

    private WeatherChannelView mapChannel(WeatherChannel weatherChannel) {
        WeatherChannelView weatherChannelView = new WeatherChannelView();

        weatherChannelView.setAstronomy(mapAstronomy(weatherChannel.getAstronomy()));
        weatherChannelView.setAtmosphere(mapAtmosphere(weatherChannel.getAtmosphere()));
        weatherChannelView.setDescription(weatherChannel.getDescription());
        weatherChannelView.setImage(mapImage(weatherChannel.getImage()));
        weatherChannelView.setItem(mapItem(weatherChannel.getItem()));
        weatherChannelView.setLanguage(weatherChannel.getLanguage());
        weatherChannelView.setLastBuildDate(weatherChannel.getLastBuildDate());
        weatherChannelView.setLink(weatherChannel.getLink());
        weatherChannelView.setLocation(mapLocation(weatherChannel.getLocation()));
        weatherChannelView.setTitle(weatherChannel.getTitle());
        weatherChannelView.setTtl(weatherChannel.getTtl());
        weatherChannelView.setUnits(mapUnits(weatherChannel.getUnits()));
        weatherChannelView.setWind(mapWind(weatherChannel.getWind()));

        return weatherChannelView;
    }

    private WeatherResultsView mapResults(WeatherResults weatherResults) {
        WeatherResultsView weatherResultsView = new WeatherResultsView();

        weatherResultsView.setChannel(mapChannel(weatherResults.getChannel()));

        return weatherResultsView;
    }

    private WeatherQueryView mapQuery(WeatherQuery weatherQuery) {
        WeatherQueryView weatherQueryView = new WeatherQueryView();

        weatherQueryView.setCount(weatherQuery.getCount());
        weatherQueryView.setCreated(weatherQuery.getCreated());
        weatherQueryView.setLang(weatherQuery.getLang());
        weatherQueryView.setResults(mapResults(weatherQuery.getResults()));

        return weatherQueryView;
    }

    public WeatherView mapModel(WeatherModel weatherModel) {
        WeatherView view = new WeatherView();

        view.setQuery(mapQuery(weatherModel.getQuery()));

        return view;
    }
}
