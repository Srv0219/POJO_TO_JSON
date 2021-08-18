package logic;

import ExcelData.ExcelFileData;
import ExcelData.GetDataSheet;
import pojo.student.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class RequestBuilder {

    public  Profile createProfile() throws IOException {
        ExcelFileData e1 =new ExcelFileData();
        e1.dataExcel();
        Profile profile = new Profile();
        Student student = new Student();
        Registration registration = new Registration();
        GetDataSheet data = new GetDataSheet();
        System.out.println(data.getName());

        registration.setId(Integer.parseInt(data.getId()));
        registration.setName(data.getName());
        registration.setEmail(data.getEmail());
        registration.setMobNo(Long.parseLong(data.getMob_no()));
        registration.setAge(Integer.parseInt(data.getAge()));
        registration.setGender(data.getGender());
        registration.setCity(data.getCity());
        registration.setCountry(data.getCountry());
        registration.setState(data.getState());
        registration.setPincode(Integer.parseInt(data.getPincode()));

        Study study = new Study();
        //tenth
        List<_10th> _10thlist = new ArrayList<>();
        _10th ten = new _10th();
        ten.setName(data.getTenthName());
        ten.setMarks(data.getTenthMarks());
        ten.setStream(data.getTenthStream());
        _10thlist.add(ten);
        study.set_10th(_10thlist);
        //twelveth
        List<_12th> _12thlist = new ArrayList<>();
        _12th twelve = new _12th();
        twelve.setName(data.getTwelthName());
        twelve.setMarks(data.getTwelthMarks());
        twelve.setStream(data.getTwelthStream());
        _12thlist.add(twelve);
        study.set_12th(_12thlist);

        //Ug
        List<UnderGraduation> underGraduations=new ArrayList<>();
        UnderGraduation ug= new UnderGraduation();
        ug.setName(data.getUgName());
        ug.setMarks(data.getUgMarks());
        ug.setStream(data.getTwelthStream());
        underGraduations.add(ug);
        study.setUnderGraduation(underGraduations);
        //pg
        List<PostGraduation> postGraduations = new ArrayList<>();
        PostGraduation pg = new PostGraduation();
        pg.setName(data.getPgName());
        pg.setMarks(data.getPgMarks());
        pg.setStream(data.getPgStream());
        postGraduations.add(pg);
        study.setPostGraduation(postGraduations);


         registration.setStudy(study);
         student.setRegistration(registration);
         profile.setStudent(student);

        return profile;

    }
}
