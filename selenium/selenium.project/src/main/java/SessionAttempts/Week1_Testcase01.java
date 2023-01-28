package SessionAttempts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

//invalid username and invalid password --> attempt
public class Week1_Testcase01 {
    public static void main(String[] args) throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","c:/Users/etkab/Desktop/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete12%2fWebOrders%2fDefault.aspx");
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("ebo");
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("izmir123");
        driver.findElement(By.cssSelector("input#ctl00_MainContent_login_button")).click();
        Assert.assertEquals(driver.findElement(By.id("ctl00_MainContent_status")).getText(),"Invalid Login or Password.");

    }
}
