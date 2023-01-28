package SessionAttempts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Week1_Testcase03 {
    //view all orders attempts
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:/Users/etkab/Desktop/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://secure.smartbearsoftware.com/samples/TestComplete12/WebOrders/Login.aspx?ReturnUrl=%2fsamples%2fTestComplete12%2fWebOrders%2fDefault.aspx");
        driver.findElement(By.id("ctl00_MainContent_username")).sendKeys("Tester");
        driver.findElement(By.name("ctl00$MainContent$password")).sendKeys("test");
        driver.findElement(By.cssSelector("input#ctl00_MainContent_login_button")).click();
        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_orderGrid_ctl02_OrderSelector\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_orderGrid_ctl03_OrderSelector\"]")).click();
        driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_btnDelete\"]")).click();
       driver.findElement(By.id("ctl00_MainContent_btnCheckAll")).click();
       driver.findElement(By.id("ctl00_MainContent_btnUncheckAll")).click();



    }
}
