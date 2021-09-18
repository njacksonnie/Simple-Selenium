package com.selenium.chrome.experiments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.safari.SafariDriver;

public class AxisBankTest {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new SafariDriver();
        driver.manage().window().maximize();

        driver.get("https://www.axisbank.com/#");
        Thread.sleep(5000);

        Actions action = new Actions(driver);
        action.moveToElement(driver.findElement(By.xpath("//div[@role='button']"))).build().perform();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[@role='button']/div/div/ul/li")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("MPINOption")).click();
        Thread.sleep(2000);

        driver.findElement(By.name("FORM_CUSTID")).sendKeys("Account No");
        driver.findElement(By.name("User_MPIN")).sendKeys("Password");
        driver.findElement(By.id("ABCustomLoginPortletFormSubmit")).click();

        Thread.sleep(3000);

        String balance = driver.findElement(By.xpath("//*[contains(@class,'fa-rupee')]")).getText();

        System.out.println("Balance is: " + balance);

        driver.quit();
    }
}