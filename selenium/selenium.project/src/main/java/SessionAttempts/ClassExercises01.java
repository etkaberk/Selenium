package SessionAttempts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ClassExercises01 {
    public static void main(String[] args) {
        //System.setProperty("webdriver.chrome.driver","C:/Users/etkab/Desktop/chromedriver/chromedriver.exe");
        //System.setProperty("webdriver.gecko.driver","C:/Users/etkab/Desktop/drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://rahulshettyacademy.com");

        System.out.println(driver.getTitle());

        System.out.println(driver.getCurrentUrl());

        driver.quit();
    }
}
