import java.time.LocalDate;


public class WeatherData {
    private String city;
    private LocalDate date;
    private double temp;
    private double precipitation;
    private int humidity;

    public WeatherData(String city, LocalDate date, double temp, double precipitation, int humidity) {
        this.city = city;
        this.date = date;
        this.temp = temp;
        this.precipitation = precipitation;
        this.humidity = humidity;
    }

    public String getCity() {
        return city;
    }

    public LocalDate getDate() {
        return date;
    }

    public double getTemp() {
        return temp;
    }

    public double getPrecipitation() {
        return precipitation;
    }

    public int getHumidity() {
        return humidity;
    }

    @Override
    public String toString() {
        return  city +
                " - " + date +
                " - " + temp +
                "°C - " + precipitation +
                " - " + humidity ;
    }
}
