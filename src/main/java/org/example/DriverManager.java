package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class DriverManager extends Utils {

    String browserName = "firefox";

    public void openBrowser()
    {
        if (browserName.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "src/test/java/drivers/chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "src/test/java/drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        } else {
            System.out.println("your browser name is not correct" + browserName);
        }

        //implicitly wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        //to maximize the window
        driver.manage().window().maximize();
        //type url
        driver.get("https://demo.nopcommerce.com/");
    }
    public void closeBrowser(){
        //driver.quit();


        driver.quit();
    }
}