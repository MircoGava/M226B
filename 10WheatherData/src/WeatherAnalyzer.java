import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class WeatherAnalyzer {
    public static void main(String[] args) {
        List<WeatherData> weatherData = Arrays.asList(
                new WeatherData("Roma", LocalDate.of(2024, 1, 15), 8.5, 12.0, 75),
                new WeatherData("Milano", LocalDate.of(2024, 1, 15), 2.0, 5.5, 80),
                new WeatherData("Roma", LocalDate.of(2024, 7, 20), 32.5, 0.0, 45),
                new WeatherData("Milano", LocalDate.of(2024, 7, 20), 29.0, 2.5, 55),
                new WeatherData("Napoli", LocalDate.of(2024, 1, 15), 12.0, 8.0, 70),
                new WeatherData("Napoli", LocalDate.of(2024, 7, 20), 35.0, 0.5, 40),
                new WeatherData("Torino", LocalDate.of(2024, 1, 15), -1.0, 15.0, 85),
                new WeatherData("Torino", LocalDate.of(2024, 7, 20), 28.5, 10.0, 60),
                new WeatherData("Roma", LocalDate.of(2024, 4, 10), 18.0, 3.0, 65),
                new WeatherData("Milano", LocalDate.of(2024, 4, 10), 15.5, 8.0, 70)
        );

        System.out.println("1. GIORNI CON TEMPERATURA > 25°C (CALDO):");
         weatherData.stream()
                .filter(d -> d.getTemp() > 25)
                .forEach(Date -> System.out.println(Date.getCity() + " - " + Date.getDate() + " - " + Date.getTemp() + "°C"));

        System.out.println("2. DATI ORDINATI PER TEMPERATURA (dal più caldo):");
        weatherData.stream()
                .sorted(Comparator.comparing(WeatherData::getTemp)
                .reversed())
                .forEach(Date -> System.out.println(Date.getTemp() + "°C - " + Date.getCity() + " - " + Date.getDate()));

        System.out.println("3. CITTA' CON PRECIPITAZIONI > 10mm (PIOGGIA INTENSA):");
        weatherData.stream()
                .filter(d -> d.getPrecipitation() > 10)
                .map(WeatherData::getCity)
                .forEach(Date -> System.out.println(Date));


        Optional<WeatherData> maxNumber = weatherData.stream()
                .max(Comparator.comparing(WeatherData::getTemp));
        maxNumber.ifPresent(max -> System.out.println("4.TEMP MASSIMA: " + max.getTemp() + "°C a " + max.getCity() + " il " + max.getDate()));

        Optional<WeatherData> minNumber = weatherData.stream()
                .min(Comparator.comparing(WeatherData::getTemp));
        minNumber.ifPresent(min -> System.out.println("TEMP MINIMA: " + min.getTemp() + "°C a " + min.getCity() + " il " + min.getDate()));

        System.out.println("5. GIORNI ESTIVI CON UMIDITA' < 50% (CLIMA SECCO):");
        weatherData.stream()
                .filter(d -> d.getHumidity() < 50)
                .filter(d -> d.getDate().getMonthValue() > 5 && d.getDate().getMonthValue() < 9)
                .forEach(Date -> System.out.println(Date.getCity() + " - " + Date.getDate() + " - Umidità: " + Date.getHumidity() + "%"));







    }
}