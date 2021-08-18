package pojo.student;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Registration {

    @JsonProperty("Id")
    public int id;
    @JsonProperty("Name")
    public String name;
    @JsonProperty("Email")
    public String email;
    @JsonProperty("Mob-no")
    public long mobNo;
    @JsonProperty("Age")
    public int age;
    @JsonProperty("Gender")
    public String gender;
    @JsonProperty("Country")
    public String country;
    @JsonProperty("State")
    public String state;
    @JsonProperty("City")
    public String city;
    @JsonProperty("Pincode")
    public int pincode;
    @JsonProperty("Study")
    public Study study;
    @JsonProperty("Skills")
    public Skills skills;
}
