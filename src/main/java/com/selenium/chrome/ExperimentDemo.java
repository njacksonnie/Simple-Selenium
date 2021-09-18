package com.selenium.chrome;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ExperimentDemo {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","/Users/niloymazumder/Documents/IdeaProjects/WebDriver/chromedriver");
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.mycontactform.com/samples/real_estate.php");

        driver.findElement(By.xpath("//input[@value='0']")).click();
        driver.findElement(By.cssSelector("input[value='1'][name='email_to[]']")).click();
        driver.findElement(By.cssSelector("input[value='2'][name='email_to[]']")).click();
        driver.findElement(By.cssSelector("input[value='3'][name='email_to[]']")).click();
        driver.findElement(By.cssSelector("input[value='4'][name='email_to[]']")).click();
        Thread.sleep(3000);

        driver.findElement(By.cssSelector("input[name='q[1]']")).sendKeys("Niloy Mazumder");
        driver.findElement(By.id("email")).sendKeys("hello@abc.com");
        driver.findElement(By.cssSelector("input[name='q[2]']")).sendKeys("999999999");
        driver.findElement(By.cssSelector("input[name='q[3]']")).sendKeys("1111111");
        driver.findElement(By.cssSelector("input[name='q[4]']")).sendKeys("123456");
        driver.findElement(By.cssSelector("input[name='q[5]']")).sendKeys("187/2 main road");
        driver.findElement(By.cssSelector("input[name='q[6]']")).sendKeys("kolkata");

        WebElement staticDropdown1 = driver.findElement(By.cssSelector("select[name='q[7]']"));
        Select dropdown1 = new Select(staticDropdown1);
        dropdown1.selectByIndex(17);
        Thread.sleep(2000);

        driver.findElement(By.id("q[9]")).sendKeys("kolkata");
        driver.findElement(By.cssSelector("input[value='Other']")).click();

        WebElement staticDropdown2 = driver.findElement(By.cssSelector("select[name='q[11]']"));
        Select dropdown2 = new Select(staticDropdown2);
        dropdown2.selectByIndex(4);

        driver.findElement(By.cssSelector("input[value='4'][name='q[12]']")).click();
        driver.findElement(By.cssSelector("input[value='2 1/2']")).click();
        driver.findElement(By.cssSelector("input[value='Yes'][name='q[14]']")).click();

/*
 WebElement staticDropdown3 = driver.findElement(By.cssSelector("'q[15]'"));
 Select dropdown3 = new Select(staticDropdown2);
 dropdown3.selectByIndex(1);
*/

        driver.findElement(By.cssSelector("textarea[name='q[16]']")).sendKeys("hello");
        driver.findElement(By.id("q[17]")).sendKeys("hiiiii");
        Thread.sleep(1000);

        driver.findElement(By.cssSelector("input[value='Yes'][name='q[18]']")).click();
        driver.findElement(By.cssSelector("input[value='Yes'][name='q[19]']")).click();
    }
}
