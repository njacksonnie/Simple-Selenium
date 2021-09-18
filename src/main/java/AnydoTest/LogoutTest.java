package AnydoTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LogoutTest {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "/Users/niloymazumder/Documents/IdeaProjects/WebDriver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);

        driver.get("https://www.any.do/");

//        Login Process
        driver.findElement(By.xpath("//a[contains(@class,'-secondary')]")).click();
        driver.findElement(By.xpath("//div[contains(text(),'Continue with Email or Apple')]")).click();
        driver.findElement(By.xpath("//input[contains(@placeholder,'your@email.com')]")).sendKeys("neeloy.mazumder29@gmail.com");
        driver.findElement(By.xpath("//button[contains(@type,'submit')]")).click();


        driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("zizky6-quhhed-Xebtem");
        driver.findElement(By.xpath("//button[contains(@type,'submit')]")).click();


//        Logout Process
        Thread.sleep(4000);
        driver.findElement(By.xpath("//button[@aria-label='Settings']")).click();
        driver.findElement(By.xpath("//div[normalize-space()='My Profile']")).click();
        driver.findElement(By.xpath("//div[normalize-space()='Sign Out']")).click();


    }
}
