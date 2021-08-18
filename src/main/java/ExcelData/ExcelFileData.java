package ExcelData;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import pojo.student.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExcelFileData {
    public Profile dataExcel() throws IOException {
        String Id = "";
        String Name = "";
        String Email = "";
        String Mob_no = "";
        String Age = "";
        String Gender = "";
        String Country = "";
        String State = "";
        String City = "";
        String Pincode = "";
        String TenthName = "";
        String TenthMarks = "";
        String TenthStream = "";
        String TwelthName = "";
        String TwelthMarks = "";
        String TwelthStream = "";
        String UgName = "";
        String UgMarks = "";
        String UgStream = "";
        String PgName = "";
        String PgMarks = "";
        String PgStream = "";


        Scanner sc = new Scanner(System.in);
        File excel = new File("D:\\demo\\details.xlsx");
        FileInputStream fis = new FileInputStream(excel);
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sheet = wb.getSheetAt(0);
        WriteData WriteDataInFile = new WriteData();


        Profile profile = new Profile();
        Student student = new Student();
        Registration registration = new Registration();
        GetDataSheet data = new GetDataSheet();

        System.out.print("Search : ");
        String search = sc.nextLine();

        System.out.println("1. Write Data In xlsx");
        System.out.println("2.  Print json format");

        System.out.println("Select : ");
        int num = sc.nextInt();
        if (num == 1) {
            WriteDataInFile.writeData(sheet, excel, fis, wb);
        } else if (num == 2) {

            for (int sheetIndex = 0; sheetIndex < wb.getNumberOfSheets(); sheetIndex++) {
                sheet = wb.getSheetAt(sheetIndex);
                for (int rowIndex = 1; rowIndex <= sheet.getLastRowNum(); rowIndex++) {
                    XSSFRow row = sheet.getRow(rowIndex);

                    if (row != null && row.getCell(1).getStringCellValue().equalsIgnoreCase(search)) {


                        for (int j = 0; j < row.getPhysicalNumberOfCells(); j++) {

                            Cell cell = row.getCell(j);
                            if (cell.getColumnIndex() == 0) {
                                Id = cell.toString();
                            } else if (cell.getColumnIndex() == 1) {
                                Name = cell.toString();
                            } else if (cell.getColumnIndex() == 2) {
                                Email = cell.toString();
                            } else if (cell.getColumnIndex() == 3) {
                                Mob_no = cell.toString();
                            } else if (cell.getColumnIndex() == 4) {
                                Age = cell.toString();
                            } else if (cell.getColumnIndex() == 5) {
                                Gender = cell.toString();
                            } else if (cell.getColumnIndex() == 6) {
                                Country = cell.toString();
                            } else if (cell.getColumnIndex() == 7) {
                                State = cell.toString();
                            } else if (cell.getColumnIndex() == 8) {
                                City = cell.toString();
                            } else if (cell.getColumnIndex() == 9) {
                                Pincode = cell.toString();
                            } else if (cell.getColumnIndex() == 10) {
                                TenthName = cell.toString();
                            } else if (cell.getColumnIndex() == 11) {
                                TenthMarks = cell.toString();
                            } else if (cell.getColumnIndex() == 12) {
                                TenthStream = cell.toString();
                            } else if (cell.getColumnIndex() == 13) {
                                TwelthName = cell.toString();
                            } else if (cell.getColumnIndex() == 14) {
                                TwelthMarks = cell.toString();
                            } else if (cell.getColumnIndex() == 15) {
                                TwelthStream = cell.toString();
                            } else if (cell.getColumnIndex() == 16) {
                                UgName = cell.toString();
                            } else if (cell.getColumnIndex() == 17) {
                                UgMarks = cell.toString();
                            } else if (cell.getColumnIndex() == 18) {
                                UgStream = cell.toString();
                            } else if (cell.getColumnIndex() == 19) {
                                PgName = cell.toString();
                            } else if (cell.getColumnIndex() == 20) {
                                PgMarks = cell.toString();
                            } else if (cell.getColumnIndex() == 21) {
                                PgStream = cell.toString();
                            }
                        }
                        System.out.println(Id + " " + Name);
                    }
                }
            }

            if (Id != "") {
                data.setId(Id);
                data.setName(Name);
                data.setEmail(Email);
                data.setMob_no(Mob_no);
                data.setAge(Age);
                data.setGender(Gender);
                data.setCountry(Country);
                data.setState(State);
                data.setCity(City);
                data.setPincode(Pincode);
                data.setTenthName(TenthName);
                data.setTenthMarks(TenthMarks);
                data.setTenthStream(TenthStream);
                data.setTwelthName(TwelthName);
                data.setTwelthMarks(TwelthMarks);
                data.setTwelthStream(TwelthStream);
                data.setUgName(UgName);
                data.setUgMarks(UgMarks);
                data.setUgStream(UgStream);
                data.setPgName(PgName);
                data.setPgMarks(PgMarks);
                data.setPgStream(PgStream);


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
                List<UnderGraduation> underGraduations = new ArrayList<>();
                UnderGraduation ug = new UnderGraduation();
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

            } else {
                System.out.println(search + " not exists in data");

            }
        }


        //System.out.println(data.getName());






        return profile;
    }
}
