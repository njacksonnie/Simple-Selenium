package com.selenium.chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckBoxDemo {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","/Users/niloymazumder/Documents/IdeaProjects/WebDriver/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.spicejet.com/");
        Assert.assertFalse(driver.findElement(By.xpath("//body/form[contains(@method,'post')]/div/div/div/div/div/div/div/div/div/div[12]/div[1]/input[1]")).isSelected());
        driver.findElement(By.xpath("//body/form[contains(@method,'post')]/div/div/div/div/div/div/div/div/div/div[12]/div[1]/input[1]")).click();
        System.out.println(driver.findElement(By.xpath("//body/form[contains(@method,'post')]/div/div/div/div/div/div/div/div/div/div[12]/div[1]/input[1]")).isSelected());
        Thread.sleep(2000);
        driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
        System.out.println(driver.findElement(By.id("ctl00_mainContent_view_date2")).isEnabled());
    }
}
