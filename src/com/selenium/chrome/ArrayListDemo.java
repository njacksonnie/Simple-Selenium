package com.selenium.chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {

    public static void main(String[] args) throws InterruptedException {

        String[] veggies = {"Cucumber", "Brocolli"};
        System.setProperty("webdriver.chrome.driver", "/Users/niloymazumder/Documents/IdeaProjects/WebDriver/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
        Thread.sleep(4000);
        List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

        for (int i = 0; i < products.size(); i++) {

            String[] name = products.get(i).getText().split("-");
            String formattedName = name[0].trim();
            List al = Arrays.asList(veggies);

            int j = 0;
            if (al.contains(formattedName)) {

//          if (name.contains("Cucumber")){
                j++;

                driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click();
//                break; // Cannot use break statement with Array List
                if (j == 3) {
                    break;
                }
            }
        }
    }
}
