package ru.bellintegrator.view;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by MADmitriev on 20.06.2017.
 */
public class WeatherGuidView implements Serializable {
    @JsonProperty("isPermaLink")
    private boolean isPermaLink;

    public WeatherGuidView(){

    }
    public WeatherGuidView(boolean isPermaLink){
        this.isPermaLink = isPermaLink;
    }

    public boolean isPermaLink() {
        return isPermaLink;
    }

    public void setPermaLink(boolean isPermaLink) {
        this.isPermaLink = isPermaLink;
    }
}