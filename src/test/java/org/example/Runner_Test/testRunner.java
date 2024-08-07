package org.example.Runner_Test;

import org.example.DriverManager.DriverManager;
import org.example.POM.HomePage;
import org.openqa.selenium.*;
import org.testng.annotations.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.util.concurrent.TimeUnit;


public class testRunner extends DriverManager {

    @Test
    public void update_with_dot() {
        driverInitionalize();
        implicitWait(50);
        HomePage h = new HomePage(driver);
        System.out.println("test started !!");
        h.getLoginBtnOn_dashboardPage().click();
        h.setUsername().sendKeys("nikhilpophale01@gmail.com");
        h.setPass().sendKeys("7878198nik");
        h.getLoginBtn().click();
        h.ViewProfile_btn().click();
        h.resumeHeadlineBtn().click();
        h.Edit_textspace().sendKeys(".");
        h.getSaveBtn().click();
        System.out.println(". is added !!");
        System.out.println("test Ended !!");
        tearDown_driver();
    }

    @Test
    public void update_with_remove_dot() {
        driverInitionalize();
        implicitWait(50);
        HomePage h = new HomePage(driver);
        System.out.println("test started !!");
        h.getLoginBtnOn_dashboardPage().click();
        h.setUsername().sendKeys("nikhilpophale01@gmail.com");
        h.setPass().sendKeys("7878198nik");
        h.getLoginBtn().click();
        h.ViewProfile_btn().click();
        h.resumeHeadlineBtn().click();
        h.Edit_textspace().sendKeys(Keys.BACK_SPACE);
        h.getSaveBtn().click();
        System.out.println(". is removed !!");
        System.out.println("test Ended !!");
        tearDown_driver();
    }

    @Test
    public void update_ProfileSummary() throws InterruptedException {
        driverInitionalize();
        implicitWait(50);
        HomePage h = new HomePage(driver);
        System.out.println("test started !!");
        h.getLoginBtnOn_dashboardPage().click();
        h.setUsername().sendKeys("nikhilpophale01@gmail.com");
        h.setPass().sendKeys("7878198nik");
        h.getLoginBtn().click();
        h.ViewProfile_btn().click();
        Thread.sleep(5000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        // scroll down by window
        js.executeScript("window.scrollBy(0,1320)");
        System.out.println(h.ProfileSummary_EditBtn().getText());
        h.ProfileSummary_EditBtn().click();
        h.ProfileSummary_textspace().sendKeys(".");
        h.getSaveBtn().click();
        tearDown_driver();
    }


}