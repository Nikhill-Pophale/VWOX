package org.example.DriverManager;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;



/**
 * Hello world!
 *
 */
public class DriverManager
{
    public static WebDriver driver;

    public static void driverInitionalize(){
        driver=new ChromeDriver();
        driver.get("https://www.naukri.com");
    }
    public void implicitWait(int sec){
        getDriver().manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
    }

    public static WebDriver getDriver(){
        return driver;
    }


    public static void tearDown_driver(){
        driver.quit();
    }
}
