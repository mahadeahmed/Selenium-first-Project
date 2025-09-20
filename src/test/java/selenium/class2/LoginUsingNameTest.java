package selenium.class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class LoginUsingNameTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");

        System.out.println(driver.getCurrentUrl());
        System.out.println(driver.getTitle());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.findElement(By.name("user-name")).sendKeys("standard_user");
        Thread.sleep(2000);
        driver.findElement(By.name("password")).sendKeys("secret_sauce");
        Thread.sleep(2000);
        driver.findElement(By.name("login-button")).click();
        driver.findElement(By.name("add-to-cart-sauce-labs-backpack")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("remove-sauce-labs-backpack")).click();
        String name=driver.findElement(By.cssSelector("a[id='item_4_title_link'] div[class='inventory_item_name ']")).getText();
        System.out.println(name);
       // driver.quit();
    }
}
