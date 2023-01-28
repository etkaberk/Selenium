package SessionAttempts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// test cases...
//selenium codes
public class Demo1 {
    public static void main(String[] args) throws  NoClassDefFoundError {

System.setProperty("webdriver.chrome.driver","C:/Users/etkab/Desktop/chromedriver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.wikipedia.org/");
        String str = driver.getCurrentUrl();

        System.out.println("Test 1 : " + (str));

        driver.quit();



    }
}