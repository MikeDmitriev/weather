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


//{
//    "query": {
//        "count": 1,
//        "created": "2017-06-20T07:23:32Z",
//        "lang": "ru-RU",
//        "results": {
//            "channel": {
//                "units": {
//                    "distance": "mi",
//                    "pressure": "in",
//                    "speed": "mph",
//                    "temperature": "F"
//                },
//                "title": "Yahoo! Weather - Nome, AK, US",
//                "link": "http://us.rd.yahoo.com/dailynews/rss/weather/Country__Country/*https://weather.yahoo.com/country/state/city-2460286/",
//                "description": "Yahoo! Weather for Nome, AK, US",
//                "language": "en-us",
//                "lastBuildDate": "Mon, 19 Jun 2017 11:23 PM AKDT",
//                "ttl": "60",
//                "location": {
//                    "city": "Nome",
//                    "country": "United States",
//                    "region": " AK"
//                },
//                "wind": {
//                    "chill": "43",
//                    "direction": "248",
//                    "speed": "18"
//                },
//                "atmosphere": {
//                    "humidity": "80",
//                    "pressure": "1006.0",
//                    "rising": "0",
//                    "visibility": "16.1"
//                },
//                "astronomy": {
//                    "sunrise": "1:47 am",
//                    "sunset": "4:19 am"
//                },
//                "image": {
//                    "title": "Yahoo! Weather",
//                    "width": "142",
//                    "height": "18",
//                    "link": "http://weather.yahoo.com",
//                    "url": "http://l.yimg.com/a/i/brand/purplelogo//uh/us/news-wea.gif"
//                },
//                "item": {
//                    "title": "Conditions for Nome, AK, US at 10:00 PM AKDT",
//                    "lat": "64.499474",
//                    "long": "-165.405792",
//                    "link": "http://us.rd.yahoo.com/dailynews/rss/weather/Country__Country/*https://weather.yahoo.com/country/state/city-2460286/",
//                    "pubDate": "Mon, 19 Jun 2017 10:00 PM AKDT",
//                    "condition": {
//                        "code": "27",
//                        "date": "Mon, 19 Jun 2017 10:00 PM AKDT",
//                        "temp": "47",
//                        "text": "Mostly Cloudy"
//                    },
//                    "forecast": [
//                        {
//                            "code": "26",
//                            "date": "19 Jun 2017",
//                            "day": "Mon",
//                            "high": "48",
//                            "low": "46",
//                            "text": "Cloudy"
//                        },
//                        {
//                            "code": "26",
//                            "date": "20 Jun 2017",
//                            "day": "Tue",
//                            "high": "50",
//                            "low": "45",
//                            "text": "Cloudy"
//                        },
//                        {
//                            "code": "26",
//                            "date": "21 Jun 2017",
//                            "day": "Wed",
//                            "high": "50",
//                            "low": "45",
//                            "text": "Cloudy"
//                        },
//                        {
//                            "code": "39",
//                            "date": "22 Jun 2017",
//                            "day": "Thu",
//                            "high": "48",
//                            "low": "46",
//                            "text": "Scattered Showers"
//                        },
//                        {
//                            "code": "26",
//                            "date": "23 Jun 2017",
//                            "day": "Fri",
//                            "high": "47",
//                            "low": "45",
//                            "text": "Cloudy"
//                        },
//                        {
//                            "code": "26",
//                            "date": "24 Jun 2017",
//                            "day": "Sat",
//                            "high": "48",
//                            "low": "46",
//                            "text": "Cloudy"
//                        },
//                        {
//                            "code": "26",
//                            "date": "25 Jun 2017",
//                            "day": "Sun",
//                            "high": "49",
//                            "low": "46",
//                            "text": "Cloudy"
//                        },
//                        {
//                            "code": "30",
//                            "date": "26 Jun 2017",
//                            "day": "Mon",
//                            "high": "56",
//                            "low": "46",
//                            "text": "Partly Cloudy"
//                        },
//                        {
//                            "code": "26",
//                            "date": "27 Jun 2017",
//                            "day": "Tue",
//                            "high": "56",
//                            "low": "53",
//                            "text": "Cloudy"
//                        },
//                        {
//                            "code": "30",
//                            "date": "28 Jun 2017",
//                            "day": "Wed",
//                            "high": "66",
//                            "low": "50",
//                            "text": "Partly Cloudy"
//                        }
//                    ],
//                    "description": "<![CDATA[<img src=\"http://l.yimg.com/a/i/us/we/52/27.gif\"/>\n<BR />\n<b>Current Conditions:</b>\n<BR />Mostly Cloudy\n<BR />\n<BR />\n<b>Forecast:</b>\n<BR /> Mon - Cloudy. High: 48Low: 46\n<BR /> Tue - Cloudy. High: 50Low: 45\n<BR /> Wed - Cloudy. High: 50Low: 45\n<BR /> Thu - Scattered Showers. High: 48Low: 46\n<BR /> Fri - Cloudy. High: 47Low: 45\n<BR />\n<BR />\n<a href=\"http://us.rd.yahoo.com/dailynews/rss/weather/Country__Country/*https://weather.yahoo.com/country/state/city-2460286/\">Full Forecast at Yahoo! Weather</a>\n<BR />\n<BR />\n(provided by <a href=\"http://www.weather.com\" >The Weather Channel</a>)\n<BR />\n]]>",
//                    "guid": {
//                        "isPermaLink": "false"
//                    }
//                }
//            }
//        }
//    }
//}