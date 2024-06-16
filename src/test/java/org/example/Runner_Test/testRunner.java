package org.example.Runner_Test;

import org.example.DriverManager.DriverManager;
import org.example.POM.HomePage;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
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

        h.getLoginBtnOn_dashboardPage().click();
        h.setUsername().sendKeys("nikhilpophale01@gmail.com");
        h.setPass().sendKeys("7878198nik");
        h.getLoginBtn().click();
        h.ViewProfile_btn().click();
        h.resumeHeadlineBtn().click();
        h.Edit_textspace().sendKeys(".");
        h.getSaveBtn().click();
        tearDown_driver();
    }
    @Test
    public void update_with_remove_dot() {
        driverInitionalize();
        implicitWait(50);
        HomePage h = new HomePage(driver);

        h.getLoginBtnOn_dashboardPage().click();
        h.setUsername().sendKeys("nikhilpophale01@gmail.com");
        h.setPass().sendKeys("7878198nik");
        h.getLoginBtn().click();
        h.ViewProfile_btn().click();
        h.resumeHeadlineBtn().click();
        h.Edit_textspace().sendKeys(Keys.BACK_SPACE);
        h.getSaveBtn().click();
        tearDown_driver();
    }


}