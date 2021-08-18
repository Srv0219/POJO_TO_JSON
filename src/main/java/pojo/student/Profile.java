package pojo.student;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
//lombok
public class Profile {

    @JsonProperty("Student")
    public Student student;
}
