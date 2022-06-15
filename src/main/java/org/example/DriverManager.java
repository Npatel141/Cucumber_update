package org.example;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;

public class DriverManager extends Utils {

    // String browserName = "safari";
    LodeProp loadProp = new LodeProp();
    DesiredCapabilities caps = new DesiredCapabilities();
    public final String AUTOMATE_USERNAME = loadProp.getProperty("bsUsername");
    public final String AUTOMATE_ACCESS_KEY = loadProp.getProperty("bsAccessKey");
    public final String BrowserStackURL = "https://" + AUTOMATE_USERNAME + ":" + AUTOMATE_ACCESS_KEY + "@hub-cloud.browserstack.com/wd/hub";
    boolean cloud = Boolean.parseBoolean(System.getProperty("cloud"));
    //String browserName ="Safari";
    String browserName = System.getProperty("browser");

    public void openBrowser() {
        //making decision cloud true or false
        //this will be run if cloud true (In cloud)
        if (cloud) {
            System.out.println("running cloud");
            //applying conditional loop for different browser options
            if (browserName.equalsIgnoreCase("Chrome")) {
                caps.setCapability("browserName", "Chrome");
                caps.setCapability("browserVersion", "latest");
                HashMap<String, Object> browserstackOptions = new HashMap<String, Object>();
                browserstackOptions.put("os", "Windows");
                browserstackOptions.put("osVersion", "11");
                caps.setCapability("bstack:options", browserstackOptions);
            } else if (browserName.equalsIgnoreCase("Firefox")) {
                DesiredCapabilities caps = new DesiredCapabilities();
                caps.setCapability("os", "Windows");
                caps.setCapability("os_version", "11");
                caps.setCapability("browser", "Firefox");
                caps.setCapability("browser_version", "latest");
                caps.setCapability("browserstack.local", "false");
                caps.setCapability("browserstack.selenium_version", "4.1.0");

            } else if (browserName.equalsIgnoreCase(("Edge"))) {
                caps.setCapability("os", "Windows");
                caps.setCapability("os_version", "10");
                caps.setCapability("browser", "Edge");
                caps.setCapability("browser_version", "latest");
                caps.setCapability("browserstack.local", "false");
                caps.setCapability("browserstack.selenium_version", "3.5.2");

            } else {
                System.out.println("your browser is wrong");
            }
            try {
                driver = new RemoteWebDriver(new URL(BrowserStackURL), caps);
            } catch (MalformedURLException e) {
                e.printStackTrace();
        }}else{
            //this is to run locally if cloud false(locally)
             if(browserName.equalsIgnoreCase("chrome")){
                 System.setProperty("webdriver.chrome.driver:", "src/test/java/drivers/chromedriver.exe");
                 driver=new ChromeDriver();
             }else if(browserName.equalsIgnoreCase("Firefox")){
                  System.setProperty("Webdriver.firefox.driver:","src/test/java/drivers/geckodriver.exe");
                 driver=new FirefoxDriver();
            }else if(browserName.equalsIgnoreCase("Edge")){
                 System.setProperty("webdriver.edge.driver:","src/test/java/drivers/msedgedriver.exe");
            }else{
                 System.out.println("your browser name is incorrect");
             }

            }

            //implicitly wait
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
            //to maximize the window
            driver.manage().window().maximize();
            //type url
            driver.get("https://demo.nopcommerce.com/");
        }

    void browserClose()
    {
         driver.quit();
    }
    }



