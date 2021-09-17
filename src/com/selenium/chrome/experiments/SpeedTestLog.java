//package com.selenium.chrome.experiments;
//
//import org.apache.poi.xssf.usermodel.XSSFRow;
//import org.apache.poi.xssf.usermodel.XSSFSheet;
//import org.apache.poi.xssf.usermodel.XSSFWorkbook;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.safari.SafariDriver;
//
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.time.LocalDateTime;
//import java.time.format.DateTimeFormatter;
//import java.util.Map;
//import java.util.TreeMap;
//
//
//public class SpeedTestLog {
//
//    public static void main(String[] args) throws InterruptedException, IOException {
//
//        LocalDateTime myDateObj = LocalDateTime.now();
//
//        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss a");
//        String formattedDate = myDateObj.format(myFormatObj);
//
//        WebDriver driver = new SafariDriver();
//        driver.manage().window().maximize();
//
//        driver.get("https://www.speedtest.net/");
//        Thread.sleep(2000);
//        driver.findElement(By.xpath("//span[@class=\"start-text\"]")).click();
//        Thread.sleep(50000);
//        String z = driver.findElement(By.xpath("//*[contains(@class,'ping-speed')]")).getText();
//        Thread.sleep(2000);
//        String x = driver.findElement(By.xpath("//*[contains(@class,'download-speed')]")).getText();
//        Thread.sleep(2000);
//        String y = driver.findElement(By.xpath("//*[contains(@class,'upload-speed')]")).getText();
//
//        XSSFWorkbook workbook = new XSSFWorkbook(); // Blank Workbook
//        XSSFSheet spreadsheet = workbook.createSheet(" SpeedTest Logs "); // BlankSheet
//        XSSFRow row;
//
//        Map<String, Object[]> netTest = new TreeMap<>();
//        netTest.put("1", new Object[]{
//                "Date & Time", "Ping Response", "Download Speed", "Upload Speed"});
//
//        try (FileOutputStream out = new FileOutputStream(
//                "/Users/niloymazumder/Documents/Timesheet1.xlsx")) {
//
//            workbook.write(out);
//
//        int sheet = workbook.getNumberOfSheets();
//        for (int i = 0;i < sheet; i++) {
//
//            if (workbook.getSheetName(i).equalsIgnoreCase(" SpeedTest Logs ")) {
//
//                XSSFSheet sh = workbook.getSheetAt(i);
//                int rowFilled = sh.getPhysicalNumberOfRows();
//
//                //Write the workbook in file system
//                try (FileOutputStream out = new FileOutputStream(
//                        "/Users/niloymazumder/Documents/Timesheet1.xlsx")) {
//
//                    workbook.write(out);
//                }
//                System.out.println("Timesheet1.xlsx written successfully");
//            }
//        }
//    }
//}}