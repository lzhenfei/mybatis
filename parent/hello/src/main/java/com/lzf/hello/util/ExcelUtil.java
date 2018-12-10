package com.lzf.hello.util;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.formula.functions.T;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class ExcelUtil {
    private static int count = 65535;

    public static void writerToExcel(List<T> users){
        int sheets = users.size()/count;
        if(users.size()%count!=0){
            sheets = sheets+1;
        }

        HSSFWorkbook workbook = new HSSFWorkbook();
        for(int i=0;i<sheets;i++) {
            HSSFSheet sheet = workbook.createSheet("用户表" + (i + 1));
            HSSFRow row = sheet.createRow(0);
            HSSFCell cell = row.createCell(0);
            cell.setCellValue("acct_id");
            int num = count * i;
            for (int j = 0; j < count; j++) {

                if(num+j>=users.size()){
                    break;
                }
                HSSFRow row1 = sheet.createRow(j + 1);
                HSSFCell cell1 = row1.createCell(0);
                //cell1.setCellValue(users.get(num+j));
                //row.createCell(0).setCellValue(users.get(i+j+1));
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
}
