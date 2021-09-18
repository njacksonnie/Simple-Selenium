package com.selenium.chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathDemo {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","/Users/niloymazumder/Documents/IdeaProjects/WebDriver/chromedriver");
        WebDriver driver = new ChromeDriver();

        /*
         Xpath Syntax - //tagName[@attribute='value']
         Xpath Syntax - //*[@attribute='value']
        */

        driver.get("https://www.facebook.com/");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("hello");
        driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("hello world");
        driver.findElement(By.xpath("//button[@name='login']")).click();
    }
}
