package org.example.Runner_Test;

import org.example.DriverManager.DriverManager;
import org.example.POM.HomePage;
import org.junit.Test;
import org.openqa.selenium.Keys;


import java.util.concurrent.TimeUnit;



public class testRunner extends DriverManager {
    @Test
    public void update_with_dot(){
        driverInitionalize();

        HomePage h=new HomePage(driver);
        h.getLoginBtnOn_dashboardPage().click();
        h.setUsername().sendKeys("nikhilpophale01@gmail.com");
        h.setPass().sendKeys("7878198nik");
        h.getLoginBtn().click();
        h.ViewProfile_btn().click();
        h.Edit_textspace().sendKeys(".");
        h.getSaveBtn().click();
        tearDown_driver();
    }
    @Test
    public void update_with_remove_dot(){
        driverInitionalize();
        HomePage h=new HomePage(driver);
        h.getLoginBtnOn_dashboardPage().click();
        h.setUsername().sendKeys("nikhilpophale01@gmail.com");
        h.setPass().sendKeys("7878198nik");
        h.getLoginBtn().click();
        h.ViewProfile_btn().click();
        h.Edit_textspace().sendKeys(Keys.BACK_SPACE);
        h.getSaveBtn().click();
       tearDown_driver();
    }
}