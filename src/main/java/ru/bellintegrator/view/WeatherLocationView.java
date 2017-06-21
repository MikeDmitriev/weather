package ru.bellintegrator.view;

import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by MADmitriev on 19.06.2017.
 */
public class WeatherLocationView implements Serializable {
   private String city;
   private String country;
   private String region;

   public WeatherLocationView(){

   }

   public WeatherLocationView(String city, String country, String region){
      this.city = city;
      this.country = country;
      this.region = region;
   }

   public String getCity() {
      return city;
   }

   public void setCity(String city) {
      this.city = city;
   }

   public String getCountry() {
      return country;
   }

   public void setCountry(String country) {
      this.country = country;
   }

   public String getRegion() {
      return region;
   }

   public void setRegion(String region) {
      this.region = region;
   }
}
