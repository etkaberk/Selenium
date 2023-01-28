package SessionAttempts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HomePage {
    //testcase1:valid username / valid password
    //testcase2:invalid username/valid password
    //testcase3:invalid username/invalid password

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        //valid username valid password
        WebElement usernameBox = driver.findElement(By.id("user-name"));
        WebElement passwordBow = driver.findElement(By.id("password"));

        usernameBox.sendKeys("standard_user");
        passwordBow.sendKeys("secret_souce");
        driver.findElement(By.id("login-button")).click();

        Assert.assertEquals(driver.getCurrentUrl(),"https://www.saucedemo.com/inventory.html");
        driver.findElement(By.id("add-to-cart-sauce-labs-onesie"));



    }
}
