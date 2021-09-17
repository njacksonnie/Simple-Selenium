package com.selenium.chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorDemo {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "/Users/niloymazumder/Documents/IdeaProjects/WebDriver/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");
        /*
         cssSelector Syntax - tagName[attribute='value']
         cssSelector Syntax - tagName#id (works with id only)
         cssSelector Syntax - tagName.className (works with className only)
        */
        driver.findElement(By.cssSelector("input[name=email]")).sendKeys("hello world");
        driver.findElement(By.cssSelector("input[type=password]")).sendKeys("hello");
        driver.findElement(By.cssSelector("button[name='login']")).click();
    }
}
