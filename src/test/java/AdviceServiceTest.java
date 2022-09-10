import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;


import java.util.Set;
class AdviceServiceTest  {
    // TODO: 10.09.2022  Заглушки в тесте сокращают зависимость тестируемого сервиса
    //  но усложняют разработку тестов
//    @Test
//    void test_get_advice_in_bad_weather() {
//        WeatherServiceMock weatherService = new WeatherServiceMock();
//        weatherService.setValue(Weather.STORMY);
//
//
//        PreferencesServiceMock preferencesService = new PreferencesServiceMock();
//        preferencesService.setValue(Set.of(Preference.FOOTBALL, Preference.WATCHING_FILMS,
//                Preference.READING));
//
//
//
//        AdviceService adviceService = new AdviceService(preferencesService, weatherService);
//        Set<Preference> preferences = adviceService.getAdvice("user1");
//
//
//        Set<Preference> expected = Set.of(Preference.READING, Preference.WATCHING_FILMS);
//        Assertions.assertEquals(expected, preferences);
//    }

    // TODO: 08.09.2022 with mockito
//    @Test
//    void test_get_advice_in_bad_weather_mockito() {
//        WeatherService weatherService = Mockito.mock(WeatherService.class);
//        Mockito.when(weatherService.currentWeather())
//                .thenReturn(Weather.STORMY);
//
//        PreferencesService preferencesService = Mockito.mock(PreferencesService.class);
////        Mockito.when(preferencesService.get("user1"))
//        Mockito.when(preferencesService.get(Mockito.any(String.class)))
//                .thenReturn(Set.of(Preference.FOOTBALL, Preference.WATCHING_FILMS, Preference.READING));
//
//        AdviceService adviceService = new AdviceService(preferencesService, weatherService);
//        Set<Preference> preferences = adviceService.getAdvice("user1");
//
//        Set<Preference> expected = Set.of(Preference.READING, Preference.WATCHING_FILMS);
//        Assertions.assertEquals(expected, preferences);
//    }

    // TODO: 10.09.2022 сколько раз был вызван тот или иной метод во время.

//    @Test
//    void test_get_advice_in_bad_weather_mockito_verify() {
//        WeatherService weatherService = Mockito.mock(WeatherService.class);
//        Mockito.when(weatherService.currentWeather()).thenReturn(Weather.STORMY);
//
//        PreferencesService preferencesService = Mockito.mock(PreferencesService.class);
//        Mockito.when(preferencesService.get(Mockito.any())).thenReturn(Set.of(Preference.FOOTBALL));
//
//        AdviceService adviceService = new AdviceService(preferencesService, weatherService);
//        adviceService.getAdvice("user1");
////        adviceService.getAdvice("user2");
//
//        Mockito.verify(weatherService, Mockito.times(1)).currentWeather();
//        Mockito.verify(preferencesService, Mockito.times(1)).get(Mockito.any());
//        Mockito.verify(preferencesService, Mockito.times(1)).get("user1");
//        Mockito.verify(preferencesService, Mockito.times(0)).get("user2");
//    }

    // TODO: 10.09.2022 библиотека позволяет получать значения с которыми были вызваны методы мок объекта
    //  Перехватчик аргументов
//    @Test
//    void test_get_advice_in_bad_weather_mockito_captor() {
//        WeatherService weatherService = Mockito.mock(WeatherService.class);
//        Mockito.when(weatherService.currentWeather()).thenReturn(Weather.STORMY);
//
//        PreferencesService preferencesService = Mockito.mock(PreferencesService.class);
//        Mockito.when(preferencesService.get(Mockito.any())).thenReturn(Set.of(Preference.FOOTBALL));
//
//        ArgumentCaptor<String> argumentCaptor = ArgumentCaptor.forClass(String.class);
//
//        AdviceService adviceService = new AdviceService(preferencesService, weatherService);
//        adviceService.getAdvice("user1");
//
//        Mockito.verify(preferencesService).get(argumentCaptor.capture());
//        Assertions.assertEquals("user1", argumentCaptor.getValue());
//    }



}