package pojo.student;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class PostGraduation {
    @JsonProperty("Name")
    public String name;
    @JsonProperty("Marks")
    public String marks;
    @JsonProperty("Stream")
    public String stream;
}
