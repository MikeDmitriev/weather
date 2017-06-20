package ru.bellintegrator.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by MADmitriev on 20.06.2017.
 */
@Embeddable
public class WeatherGuid implements Serializable {
    @JsonProperty("isPermaLink")
    private boolean isPermaLink;

    public boolean isPermaLink() {
        return isPermaLink;
    }

    public void setPermaLink(boolean isPermaLink) {
        this.isPermaLink = isPermaLink;
    }
}