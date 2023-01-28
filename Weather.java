public class Weather { // will be using this to create an object to return after calling weather api
    private String country;
    private String region;
    private String localtime;
    private String temp_f;
    private String wind_mph;
    private String humidity;
    private String feelslike_f;

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

    public String getLocalTime() {
        return localtime;
    }

    public void setLocalTime(String localtime) {
        this.localtime = localtime;
    }

    public String getTemp_f() {
        return temp_f;
    }

    public void setTemp_f(String temp_f) {
        this.temp_f = temp_f;
    }

    public String getWind_mph() {
        return wind_mph;
    }

    public void setWind_mph(String wind_mph) {
        this.wind_mph = wind_mph;
    }

    public String getHumidity() {
        return humidity;
    }

    public void setHumidity(String humidity) {
        this.humidity = humidity;
    }

    public String getFeelsLike_f() {
        return feelslike_f;
    }

    public void setFeelsLike_f(String feelslike_f) {
        this.feelslike_f = feelslike_f;
    }

    public String toString() {
        return "Country{" + "region: " + region + "local time: " + localtime + "temp: " + temp_f + "wind speed: "
                + wind_mph + "humidity: " + humidity + "feels like: " + feelslike_f + "}";
    }

}
