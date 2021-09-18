package com.selenium.chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class UpdatedDropdown {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","/Users/niloymazumder/Documents/IdeaProjects/WebDriver/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.spicejet.com/");
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("#divpaxinfo")).click();
        Thread.sleep(1000);

        WebElement staticDropdown = driver.findElement(By.xpath("//div[@class='book']//p[1]//select[1]"));
        Select dropdown = new Select(staticDropdown);
        dropdown.selectByIndex(3);




    }


}
