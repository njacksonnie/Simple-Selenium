package com.selenium.chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RegularExpressionDemo {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","/Users/niloymazumder/Documents/IdeaProjects/WebDriver/chromedriver");
        WebDriver driver = new ChromeDriver();

        /*
         Xpath Regular Expression - tagName[contains(@attribute,'value')]
         Css Regular Expression - tagName[Attribute*='value']
        */

        driver.get("https://rediff.com");
        driver.findElement(By.cssSelector("a[title*='Sign in']")).click();  // tagName[Attribute*='value']
        driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("hello"); //tagName#id (works with id only)
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("goodbye");
        driver.findElement(By.xpath("//input[contains(@name,'procee')]")).click(); // tagName[contains(@attribute,'value')] procee is subtext of proceed
    }
}
