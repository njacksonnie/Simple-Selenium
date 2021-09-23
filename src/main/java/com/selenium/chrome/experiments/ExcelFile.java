package com.selenium.chrome.experiments;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelFile {

        File file;
        FileInputStream isr;
        XSSFWorkbook wb;
        FileOutputStream fio;

        public ExcelFile(String path) throws IOException
        {
            this.file=new File(path);
            this.isr=new FileInputStream(file);
            this.wb=new XSSFWorkbook(isr);

        }

        public void readData() throws IOException
        {

            XSSFSheet sh=wb.getSheet("Credentials");

            int rowCount=sh.getPhysicalNumberOfRows();
            int cellCount=sh.getRow(0).getPhysicalNumberOfCells();

            for(int i=1;i<rowCount;i++)
            {
                for(int j=0;j<cellCount;j++)
                {
                    String data=sh.getRow(i).getCell(j).getStringCellValue();
                    System.out.println(data);
                }
            }
        }

        public void readSpecificData(String sheetname, int row, int cell) throws IOException
        {

            XSSFSheet sh=wb.getSheet(sheetname);

            String data=sh.getRow(row).getCell(cell).getStringCellValue();
            System.out.println(data);

        }

        public void writeData(String sheetname, String username, String password) throws IOException
        {
            XSSFSheet sh=wb.getSheet(sheetname);
            int rowFilled=sh.getPhysicalNumberOfRows();

            sh.createRow(rowFilled);

            sh.getRow(rowFilled).createCell(0).setCellValue(username);
            sh.getRow(rowFilled).createCell(1).setCellValue(password);

            this.fio=new FileOutputStream(file);
            wb.write(fio);

        }

        public static void main(String[] args) throws IOException {

            ExcelFile obj=new ExcelFile("files/datasheet.xlsx");

            //obj.readData();

            //obj.readSpecificData("Credentials", 2, 1);

            obj.writeData("Credentials", "Akash", "ijk@234");
            System.out.println("Write Complete");

        }

        public Object[][] readEntireData()
        {
            XSSFSheet sh=wb.getSheet("Credentials");

            int rowCount=sh.getPhysicalNumberOfRows();
            int cellCount=sh.getRow(0).getPhysicalNumberOfCells();

            Object [][] data=new Object[rowCount-1][cellCount];

            for(int i=1;i<rowCount;i++)
            {
                for(int j=0;j<cellCount;j++)
                {
                    data[i-1][j]=sh.getRow(i).getCell(j).getStringCellValue();
                }
            }
            return data;
        }
    }
}
