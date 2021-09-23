package com.selenium.chrome.experiments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksCountDemo {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/niloymazumder/Documents/IdeaProjects/WebDriver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        

        driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
        System.out.println(driver.findElements(By.tagName("a")).size());

        Thread.sleep(3000);
        WebElement footerdriver = driver.findElement(By.id("gf-BIG")); // Limiting web driver scope

        System.out.println(footerdriver.findElements(By.tagName("a")).size());

        WebElement columndriver = footerdriver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
        System.out.println(columndriver.findElements(By.tagName("a")).size());

        for (int i = 1; i < columndriver.findElements(By.tagName("a")).size(); i++) {

            String clickonlinktab = Keys.chord(Keys.COMMAND,Keys.RETURN);
            columndriver.findElements(By.tagName("a")).get(i).sendKeys(clickonlinktab);
        }
    }
}
