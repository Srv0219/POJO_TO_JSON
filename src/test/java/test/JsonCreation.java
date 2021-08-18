package test;

import ExcelData.ExcelFileData;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import logic.RequestBuilder;
import pojo.student.Profile;

import java.io.IOException;

public class JsonCreation {

    public static void main(String[] args) throws IOException {

        ExcelFileData excelFileData = new ExcelFileData();
        Profile profile = excelFileData.dataExcel();
        //method to create json
        ObjectMapper objectMapper = new ObjectMapper();
        String jsonInString = objectMapper.writeValueAsString(profile);

        System.out.println(jsonInString);

    }
}
