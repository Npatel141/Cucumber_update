package org.example;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

public class Utils extends BasePage{
    public static void typeElement(By by, String text)
    {
        driver.findElement(by).sendKeys(text);

    }
    public static void clickOnElement(By by)
    {
        driver.findElement(by).click();
    }
    public static String randomDate()
    {
        Date date =new Date();
        SimpleDateFormat format=new SimpleDateFormat("dd/MM/yyyyhhmmss");
        String strDate=format.format(date);
        return format.format(date);
    }
    public static String getTextFromElement(By by)
    {
        return driver.findElement(by).getText();

    }
    public static void WaitUntilExpectedURL(int time, String url)
    {
        WebDriverWait wait1=new WebDriverWait(driver, Duration.ofSeconds(time));
        wait1.until(ExpectedConditions.urlToBe(url));

    }
    public static void sleep(int time){
        try {
            Thread.sleep((1000*time));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void takeSnapShot(String a)  {

        //Convert web driver object to TakeScreenshot

        TakesScreenshot scrShot =((TakesScreenshot)driver);

        //Call getScreenshotAs method to create image file

        File srcFile=scrShot.getScreenshotAs(OutputType.FILE);

        //Move image file to new destination

        //File DestFile=new File("ScreenShot");

        //Copy file at destination

        try
        {
            FileUtils.copyFile(srcFile, new File("ScreenShot\\"+a+randomDate()+".png"));
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

    }



}
