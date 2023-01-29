import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/*
 * since I only wanted to use some of the fields from the JSON file using 
 * @JsonIgnoreProperties allowed me to ignore all fields that werent explicetely called for in my class
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Location {
    private String name;
    private String region;
    private String localtime;

    public Location() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

}
