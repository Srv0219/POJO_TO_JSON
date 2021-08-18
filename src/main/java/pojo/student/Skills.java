package pojo.student;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class Skills {

    @JsonProperty("Language")
    public List<String> language;
    @JsonProperty("Editor")
    public List<String> editor;
    @JsonProperty("Database")
    public List<String> database;
    @JsonProperty("Database Editor")
    public List<String> databaseEditor;
    @JsonProperty("FrameWork")
    public List<String> frameWork;
}
