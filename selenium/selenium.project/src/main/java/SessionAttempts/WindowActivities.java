package SessionAttempts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class WindowActivities {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","c:/Users/etkab/Desktop/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://google.com");
        driver.navigate().to("https://rahulshettyacademy.com");
        driver.navigate().back();
        driver.navigate().forward();
    }
}
