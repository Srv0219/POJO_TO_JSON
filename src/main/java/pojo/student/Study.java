package pojo.student;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class Study {

    @JsonProperty("10th")
    public List<_10th> _10th;
    @JsonProperty("12th")
    public List<_12th> _12th;
    @JsonProperty("UnderGraduation")
    public List<UnderGraduation> underGraduation;
    @JsonProperty("PostGraduation")
    public List<PostGraduation> postGraduation;
}
