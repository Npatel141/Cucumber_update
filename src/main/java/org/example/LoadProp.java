package org.example;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoadProp extends Utils
{
    static Properties prop = new Properties();
    static FileInputStream input;
    static String propertiesLocation = "src/test/java/TestConfig/TestData.properties";

    public String getProperty(String key)
    {
        try {
            input = new FileInputStream(propertiesLocation);
            prop.load(input);
            input.close();


        } catch (IOException e) {
            e.printStackTrace();
        }


        return prop.getProperty(key);
    }
    @Test
    public void verifymyLoadpro(){
        System.out.println(getProperty("url"));
        System.out.println(getProperty("firstName"));
        System.out.println(getProperty("LastName"));

    }
}

