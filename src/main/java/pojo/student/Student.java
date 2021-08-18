package pojo.student;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;


@Data
public class Student {
    @JsonProperty("Registration")
    private Registration registration;
}
