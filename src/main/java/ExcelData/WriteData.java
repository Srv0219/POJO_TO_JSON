package ExcelData;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.util.Date;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class WriteData {
    public void writeData(XSSFSheet sheet, File excel, FileInputStream fis, XSSFWorkbook wb) {

        //int rownum1 = sheet.getLastRowNum() + 1;
        int rownum1 = sheet.getLastRowNum() + 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Id: ");
        String id = Integer.toString(rownum1);
        System.out.println(id);
        System.out.println("Name: ");
        String Name = sc.nextLine();
        System.out.println("Email: ");
        String Email = sc.nextLine();
        System.out.println("Mob-no: ");
        String Mob = sc.nextLine();
        System.out.println("Age: ");
        String Age = sc.nextLine();
        System.out.println("Gender: ");
        String Gender = sc.nextLine();
        System.out.println("Country: ");
        String Country = sc.nextLine();
        System.out.println("State: ");
        String State = sc.nextLine();
        System.out.println("City: ");
        String City = sc.nextLine();
        System.out.println("Pincode: ");
        String Pincode = sc.nextLine();
        System.out.println("TenthName: ");
        String TenthName = sc.nextLine();
        System.out.println("TenthMarks: ");
        String TenthMarks = sc.nextLine();
        System.out.println("TenthStream: ");
        String TenthStream = sc.nextLine();
        System.out.println("TwelveName: ");
        String TwelveName = sc.nextLine();
        System.out.println("TwelveMarks: ");
        String TwelveMarks = sc.nextLine();
        System.out.println("TwelveStream: ");
        String TwelveStream = sc.nextLine();
        System.out.println("UgName: ");
        String UgName = sc.nextLine();
        System.out.println("UgMarks: ");
        String UgMarks = sc.nextLine();
        System.out.println("UgStream: ");
        String UgStream = sc.nextLine();
        System.out.println("PgName: ");
        String PgName = sc.nextLine();
        System.out.println("PgMarks: ");
        String PgMarks = sc.nextLine();
        System.out.println("PgStream: ");
        String PgStream = sc.nextLine();
        HashMap<String, Object[]> newData = new HashMap<String, Object[]>();
        newData.put(id, new Object[]{id
                ,Name
                , Email,Mob,Age,Gender,Country,State,
                City,Pincode,TenthName,TenthMarks,
                TenthStream,TwelveMarks,TwelveName,
                TwelveStream,UgName,UgMarks,UgStream,
                PgName,PgMarks,PgStream});

        Set<String> keyset = newData.keySet();
        int rownum = sheet.getLastRowNum() + 1;
        for (String key : keyset) {
            Row row = sheet.createRow(rownum++);
            Object[] objArr = newData.get(key);
            int cellnum = 0;
            for (Object obj : objArr) {
                Cell cell = row.createCell(cellnum++);
                if (obj instanceof String) {
                    cell.setCellValue((String) obj);
                } else if (obj instanceof Boolean) {
                    cell.setCellValue((Boolean) obj);
                } else if (obj instanceof Date) {
                    cell.setCellValue((Date) obj);
                } else if (obj instanceof Double) {
                    cell.setCellValue((Double) obj);
                }
            }
        }
        try {
            FileOutputStream os = new FileOutputStream(excel);
            wb.write(os);
            os.close();
            wb.close();
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Data Added successfull in xlsx file");
        }
    }
}
