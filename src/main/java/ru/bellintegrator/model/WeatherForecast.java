package ru.bellintegrator.model;

import javax.persistence.*;

/**
 * Created by MADmitriev on 20.06.2017.
 */
@Entity
public class WeatherForecast {
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private long id;
   @Column
   private int code;
   @Column
   private String date;
   @Column
   private String day;
   @Column
   private int high;
   @Column
   private int low;
   @Column
   private String text;
   @ManyToOne(targetEntity = WeatherItem.class, cascade = CascadeType.ALL)
   private WeatherItem item;


   public WeatherForecast(){

   }

   public WeatherForecast(int code, String date, String day, int high, int low, String text){
      this.code = code;
      this.date = date;
      this.day = day;
      this.high = high;
      this.low = low;
      this.text = text;
   }

   public int getCode() {
      return code;
   }

   public void setCode(int code) {
      this.code = code;
   }

   public String getDate() {
      return date;
   }

   public void setDate(String date) {
      this.date = date;
   }

   public String getDay() {
      return day;
   }

   public void setDay(String day) {
      this.day = day;
   }

   public int getHigh() {
      return high;
   }

   public void setHigh(int high) {
      this.high = high;
   }

   public int getLow() {
      return low;
   }

   public void setLow(int low) {
      this.low = low;
   }

   public String getText() {
      return text;
   }

   public void setText(String text) {
      this.text = text;
   }

   public WeatherItem getItem() {
      return item;
   }

   public void setItem(WeatherItem item) {
      this.item = item;
   }
}
