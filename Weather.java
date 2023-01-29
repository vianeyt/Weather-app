import com.fasterxml.jackson.annotation.JsonProperty;
/*
 * @JsonProperty is annotation from the jackson library which is used to convert a JSON String to a java object
 * This can be useful when the field name in the class does not match the property name in the JSON, or when you want to use a specific property name for serialization and deserialization.
 * allows you to specify the name of the property that the field maps to, in case it's different from the field name
 */
// import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

public class Weather { // will be using this to create an object to return after calling weather api

    @JsonProperty("location")
    private Location location;
    @JsonProperty("current")
    private Current current;

    public Weather() {
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public Current getCurrent() {
        return current;
    }

    public void setCurrent(Current current) {
        this.current = current;
    }

    // public String toString() {
    // return "Country{" + "region: " + region + "local time: " + localtime + "temp:
    // " + temp_f + "wind speed: "
    // + wind_mph + "humidity: " + humidity + "feels like: " + feelslike_f + "}";
    // }

}