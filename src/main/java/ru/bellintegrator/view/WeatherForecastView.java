package ru.bellintegrator.view;

import javax.persistence.Embeddable;
import java.io.Serializable;

/**
 * Created by MADmitriev on 20.06.2017.
 */
public class WeatherForecastView implements Serializable {
   private int code;
   private String date;
   private String day;
   private int high;
   private int low;
   private String text;

   public WeatherForecastView(){

   }

   public WeatherForecastView(int code, String date, String day, int high, int low, String text){
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
}
