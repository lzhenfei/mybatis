package com.lzf.export.util;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.List;

public class ExcelUtil {
    private static int count = 65535;

    public static void writerToExcel(int totalCount, ExportInterface exportInterface, Class<?> clazz) throws IllegalAccessException {
        int startRow = 0;
        int endRow = 500;
        int sheets = totalCount/count;
        if(totalCount%count!=0){
            sheets = sheets+1;
        }

        HSSFWorkbook workbook = new HSSFWorkbook();
        for(int i=0;i<sheets;i++) {

            Field[] fields = clazz.getDeclaredFields();
            HSSFSheet sheet = workbook.createSheet("用户表" + (i + 1));
            HSSFRow row = sheet.createRow(0);
            int n=0;
            for (Field field:fields){
                HSSFCell cell = row.createCell(n);
                cell.setCellValue(field.getName());
                n++;
            }
            int rowNum = 1;
            int queryCount = 500;
            while(true){
                List<Object> lists = (List<Object>) exportInterface.queryList(startRow,endRow);


                for(Object objectRow:lists){
                    int cellNum = 0;
                    HSSFRow row1 = sheet.createRow(rowNum);
                    for (Field field:fields){
                        HSSFCell cell1 = row1.createCell(cellNum);
                        cell1.setCellValue(convert(field.get(objectRow)));
                        cellNum++;
                    }
                    rowNum++;
                }
                startRow += 500;
                queryCount = queryCount+500;
                if(lists.size()<500||queryCount>count){
                    break;
                }
            }

        }
        try {
            FileOutputStream fos = new FileOutputStream("D:\\user1.xls");
            workbook.write(fos);
            System.out.println("写入成功");
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static String convert(Object value) {
        String str = "";
        str = String.valueOf(value);
        return str;
    }

    public static void write(Class<?> clazz){
        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet("用户表");
        Field[] fields = clazz.getDeclaredFields();
        HSSFRow row = sheet.createRow(0);
        int n=0;
        for (Field field:fields){
            HSSFCell cell = row.createCell(n);
            cell.setCellValue(field.getName());
            n++;
        }
        try {
            FileOutputStream fos = new FileOutputStream("D:\\user1.xls");
            workbook.write(fos);
            System.out.println("写入成功");
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
