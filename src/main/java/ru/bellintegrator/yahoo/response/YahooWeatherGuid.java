package ru.bellintegrator.yahoo.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

/**
 * Created by MADmitriev on 20.06.2017.
 */
public class YahooWeatherGuid implements Serializable {
    @JsonProperty("isPermaLink")
    private boolean isPermaLink;

    public boolean isPermaLink() {
        return isPermaLink;
    }

    public void setPermaLink(boolean isPermaLink) {
        this.isPermaLink = isPermaLink;
    }
}