# weather broker

## тестовый проект.

Данный проект реализует запрос к сайту Yahoo.com прогноза погоды и отправки результатов на 
front часть. Для запуска программы необходимо воспользоваться maven из директории с проектом.
(в командной строке написать «mvn spring-boot:run») После чего запустится сервер по адресу localhost:8080

## Работа с сервером:

Для отправки запроса со стороны front части по адресу /submit приходит название города.
С помощью RestTemplate на адрес *query.yahooapis.com* отправляется запрос с названием города.
 
Полученый в ответ на запрос JSON мапится в Java-объект с помощью Jackson и публикуется в JMS-Topic
JMS-Listener, получив сообщение, сохраняет его в H2 базу данных с использованием Hibernate.
  
При отправки с front части запроса по адресу /weather с указанием города, из базы данных считывается сохраненный ранее
прогноз погоды и отправляется на front часть в виде JSON-а, полученного от yahoo.

## Пример ответа, отправленного на front после запроса погоды по городу Пенза

```
{
    "query": {
        "count": 1,
        "created": "2017-06-21T14:42:52Z",
        "lang": "en-US",
        "results": {
            "channel": {
                "units": {
                    "distance": "mi",
                    "pressure": "in",
                    "speed": "mph",
                    "temperature": "F"
                },
                "title": "Yahoo! Weather - Penza, Penza Oblast, RU",
                "link": "http://us.rd.yahoo.com/dailynews/rss/weather/Country__Country/*https://weather.yahoo.com/country/state/city-2122796/",
                "description": "Yahoo! Weather for Penza, Penza Oblast, RU",
                "language": "en-us",
                "lastBuildDate": "Wed, 21 Jun 2017 05:42 PM MSK",
                "ttl": 60,
                "location": {
                    "city": "Penza",
                    "country": "Russia",
                    "region": " Penza Oblast"
                },
                "wind": {
                    "chill": 66,
                    "direction": 248,
                    "speed": 11
                },
                "atmosphere": {
                    "humidity": 78,
                    "pressure": 979,
                    "rising": 0,
                    "visibility": 16.1
                },
                "astronomy": {
                    "sunrise": "3:33 am",
                    "sunset": "8:31 pm"
                },
                "image": {
                    "title": "Yahoo! Weather",
                    "width": 142,
                    "height": 18,
                    "link": "http://weather.yahoo.com",
                    "url": "http://l.yimg.com/a/i/brand/purplelogo//uh/us/news-wea.gif"
                },
                "item": {
                    "title": "Conditions for Penza, Penza Oblast, RU at 05:00 PM MSK",
                    "lat": 53.203819,
                    "link": "http://us.rd.yahoo.com/dailynews/rss/weather/Country__Country/*https://weather.yahoo.com/country/state/city-2122796/",
                    "pubDate": "Wed, 21 Jun 2017 05:00 PM MSK",
                    "condition": {
                        "code": 12,
                        "date": "Wed, 21 Jun 2017 05:00 PM MSK",
                        "temp": 67,
                        "text": "Rain"
                    },
                    "forecast": [],
                    "description": "<![CDATA[<img src=\"http://l.yimg.com/a/i/us/we/52/12.gif\"/>\n<BR />\n<b>Current Conditions:</b>\n<BR />Rain\n<BR />\n<BR />\n<b>Forecast:</b>\n<BR /> Wed - Scattered Thunderstorms. High: 75Low: 54\n<BR /> Thu - Mostly Sunny. High: 67Low: 50\n<BR /> Fri - Mostly Cloudy. High: 67Low: 49\n<BR /> Sat - Scattered Showers. High: 67Low: 49\n<BR /> Sun - Partly Cloudy. High: 66Low: 52\n<BR />\n<BR />\n<a href=\"http://us.rd.yahoo.com/dailynews/rss/weather/Country__Country/*https://weather.yahoo.com/country/state/city-2122796/\">Full Forecast at Yahoo! Weather</a>\n<BR />\n<BR />\n(provided by <a href=\"http://www.weather.com\" >The Weather Channel</a>)\n<BR />\n]]>",
                    "guid": {
                        "permaLink": false,
                        "isPermaLink": false
                    },
                    "long": 44.99931
                }
            }
        }
    }
}
```

