package selenium.class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;

public class ProthomAli {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://www.prothomalo.com/");
        System.out.println("Mahade");
        //driver.findElement(By.partialLinkText("in inf")).click();
        Thread.sleep(3000);
        List<WebElement> elements = driver.findElements(By.tagName("a"));
        for (WebElement ele : elements) {
            System.out.println(ele.getText() + " URL: " + ele.getAttribute("href"));
        }
    }
}