package selenium.class2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class PartialTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        driver.findElement(By.partialLinkText("in inf")).click();
        Thread.sleep(3000);
        List<WebElement> elements = driver.findElements(By.tagName("a"));
        for(WebElement ele: elements)
        {
            System.out.println(ele.getText() + " URL: "+ ele.getAttribute("href") );
        }
    }
}