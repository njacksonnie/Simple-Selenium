package com.selenium.chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassDemo {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","/Users/niloymazumder/Documents/IdeaProjects/WebDriver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); // Maximizing window

        driver.get("https://www.amazon.in/");
        Actions actions = new Actions(driver);
        WebElement move = driver.findElement(By.id("nav-link-accountList"));

        actions.moveToElement(driver.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
        actions.moveToElement(driver.findElement(By.id("nav-link-accountList"))).build().perform(); // Moving mouse to an element


    }
}
