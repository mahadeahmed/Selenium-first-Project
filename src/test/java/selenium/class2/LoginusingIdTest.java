package selenium.class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginusingIdTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

//        System.out.println(driver.getCurrentUrl());
//        System.out.println(driver.getTitle());
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.id("username")).sendKeys("rdo_barisal");
        //Thread.sleep(2000);
        driver.findElement(By.id("password")).sendKeys("123456");
        //Thread.sleep(2000);
        driver.findElement(By.id("txtInput")).sendKeys("31");
        //driver.findElement(By.id("")).click();
        String name=driver.findElement(By.cssSelector("button[type='submit']")).getText();
        //Thread.sleep(2000);
        //driver.quit();
    }

}
