package org.example;

import org.testng.Assert;

import java.util.Iterator;
import java.util.Set;

public class NopCommerceFacebookPAage extends Utils {


    public void handleMultiWindow() {
        //Main Window
        String MainWindow = driver.getWindowHandle();
        System.out.println("This is a main window: " + MainWindow);
        //To handle all new opened window
        Set<String> s1 = driver.getWindowHandles();
        Iterator<String> i1 = s1.iterator();
        System.out.println("This is a child window " + s1);

        while (i1.hasNext()) {
            String ChildWindow = i1.next();

            if (!MainWindow.equalsIgnoreCase(ChildWindow)) {

                // Switching to Child window
                driver.switchTo().window(ChildWindow);
                String actualchildtaURL = driver.getCurrentUrl();
                System.out.println(actualchildtaURL);
                Assert.assertTrue(actualchildtaURL.contains("facebook"), "you are on demo nopcommerce facebook page");

                // Closing the Child Window.
                driver.close();
            }
        }
        // Switching to Parent window i.e Main Window.
        driver.switchTo().window(MainWindow);
    }
}
