package SessionAttempts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowserWorks {
    public static void main(String[] args) {
        WebDriver Edgedriver = new EdgeDriver();
        Edgedriver.get("https://rahulshettyacademy.com");

        System.out.println(Edgedriver.getTitle());

        System.out.println(Edgedriver.getCurrentUrl());



    }
}
