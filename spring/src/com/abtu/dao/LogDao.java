package com.abtu.dao;

import com.abtu.entity.Log;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class LogDao {
    public List<Log> findAll(String filePath){
        FileInputStream fis =null;
        Workbook wookbook = null;
        List<Log> logs= new ArrayList<>();
        try {
            fis = new FileInputStream(filePath);
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            wookbook = new XSSFWorkbook(fis);
        } catch(
                IOException e)
        {
            e.printStackTrace();
        }
        Sheet sheet = wookbook.getSheetAt(0);
        int totalRowNum = sheet.getLastRowNum();
        for(int i = 1 ; i <= totalRowNum ; i++){
            Log log=new Log();
            Row row = sheet.getRow(i);
            log.setId(row.getCell((short)0).getStringCellValue());
            log.setName(row.getCell((short)1).getStringCellValue());
            log.setChinese( row.getCell((short)2).getNumericCellValue());
            log.setMath(row.getCell((short)3).getNumericCellValue());
            log.setEnglish(row.getCell((short)4).getNumericCellValue());
            log.setPhysics(row.getCell((short)5).getNumericCellValue());
            log.setChemistry(row.getCell((short)6).getNumericCellValue());
            log.setGeography(row.getCell((short)7).getNumericCellValue());
            logs.add(log);
        }
        return logs;
    }


}
