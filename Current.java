
/*
 * same methods apply however due to the API documentation having a data type of "decimal"
 * I had to use "bigDecimal" to be able to handle the decimal numbers
 * BigDecimal is used in APIs because it is a more precise way to represent decimal numbers in Java
 */
import java.math.BigDecimal;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)

public class Current {
    private double temp_f;
    private double wind_mph;
    private int humidity;
    @JsonProperty("feelslike_f")
    private BigDecimal feelslike_f;
    @JsonProperty("feelslike_c")
    private BigDecimal feelslike_c;

    public double getTemp_f() {
        return temp_f;
    }

    public void setTemp_f(double temp_f) {
        this.temp_f = temp_f;
    }

    public double getWind_mph() {
        return wind_mph;
    }

    public void setWind_mph(double wind_mph) {
        this.wind_mph = wind_mph;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public BigDecimal getFeelsLike_f() {
        return feelslike_f;
    }

    public void setFeelsLike_f(BigDecimal feelslike_f) {
        this.feelslike_f = feelslike_f;
    }

    public BigDecimal getFeelsLike_c() {
        return feelslike_c;
    }

    public void setFeelsLike_c(BigDecimal feelslike_c) {
        this.feelslike_c = feelslike_c;
    }
}
