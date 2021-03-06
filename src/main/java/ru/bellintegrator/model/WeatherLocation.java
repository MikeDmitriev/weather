package ru.bellintegrator.model;

import javax.persistence.*;

/**
 * Created by MADmitriev on 19.06.2017.
 */
@Entity
public class WeatherLocation {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private long id;
   @Column
   private String city;
   @Column
   private String country;
   @Column
   private String region;
   @OneToOne(targetEntity = WeatherChannel.class, cascade = CascadeType.ALL, orphanRemoval = true)
   private WeatherChannel channel;

   public WeatherLocation(){

   }

   public WeatherLocation(String city, String country, String region){
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

   public WeatherChannel getChannel() {
      return channel;
   }

   public void setChannel(WeatherChannel channel) {
      this.channel = channel;
   }
}
