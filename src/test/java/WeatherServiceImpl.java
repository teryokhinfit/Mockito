import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class WeatherServiceImpl implements WeatherService{

    @Override
    public Weather currentWeather() {
        return Weather.SUNNY;
    }

    // TODO: 10.09.2022 создаст объект-заглушку, но будет передавать
    //  все свои вызовы реальному объекту, из которого был создан.
    //  А правильно ли написан код, если вы юзаете мокито спай
    @Test
    void testSpyWeatherService () {
        WeatherService weatherService = Mockito.spy(WeatherServiceImpl.class);

        Mockito.when(weatherService.currentWeather()).thenReturn(Weather.STORMY);

        Assertions.assertEquals(Weather.STORMY, weatherService.currentWeather());

        Mockito.verify(weatherService, Mockito.only()).currentWeather();


    }
}
