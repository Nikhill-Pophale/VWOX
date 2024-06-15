package org.example.POM;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class HomePage {

    static WebDriver driver;
    public HomePage(WebDriver driver2){
        this.driver=driver2;
    }
    private By usename = By.xpath("(//input)[1]");
    private By pass = By.xpath("(//input)[2]");
    private By login_btn_OnDashBoardPage = By.xpath("//a[text()=\"Login\"]");
    private By login_btn_toLogin = By.xpath("//button[@type=\"submit\"]");
    private By view_profile_tab = By.xpath("//div[@class=\"view-profile-wrapper\"]/a");
    private By resume_Headline = By.xpath("//span[@class=\"edit icon\"]");
    private By textspance_of_Headline = By.id("resumeHeadlineTxt");
    private By Save_Btn = By.xpath("//button[text()=\"Save\"]");


    public WebElement setUsername() {
        return driver.findElement(usename);
    }

    public WebElement setPass() {
        return driver.findElement(pass);
    }

    public WebElement getLoginBtnOn_dashboardPage() {
        return driver.findElement(login_btn_OnDashBoardPage);
    }

    public WebElement getLoginBtn() {
        return driver.findElement(login_btn_toLogin);
    }

    public WebElement ViewProfile_btn() {
        return driver.findElement(view_profile_tab);
    }

    public WebElement resumeHeadlineBtn() {
        return driver.findElement(resume_Headline);
    }

    public WebElement Edit_textspace() {
        return driver.findElement(textspance_of_Headline);
    }

    public WebElement getSaveBtn() {
        return driver.findElement(Save_Btn);
    }
//    public homepage update_Profile_with_dot() throws IOException {
//
//        FileInputStream fis = new FileInputStream("C:\\Users\\nikpo\\IdeaProjects\\LumaEcart\\src\\main\\java\\org\\TTA\\Resources\\data.properties");
//        Properties prop = new Properties();
//        prop.load(fis);
//
//        String naukri_url = prop.getProperty("naukri_url");
//        openUrl(naukri_url);
//        clickElemnet(login_btn_OnDashBoardPage);
//        implicitWait(50);
//        enterInput(usename, prop.getProperty("naukri_email"));
//        enterInput(pass, prop.getProperty("naukri_password"));
//        clickElemnet(login_btn_toLogin);
//        clickElemnet(view_profile_tab);
//        clickElemnet(resume_Headline);
//        enterInput(textspance_of_Headline,".");
//        clickElemnet(Save_Btn);
//        return this;
//    }
//    public homepage update_Profile_remove_dot() throws IOException {
//
//        FileInputStream fis = new FileInputStream("C:\\Users\\nikpo\\IdeaProjects\\LumaEcart\\src\\main\\java\\org\\TTA\\Resources\\data.properties");
//        Properties prop = new Properties();
//        prop.load(fis);
//
//        String naukri_url = prop.getProperty("naukri_url");
//        openUrl(naukri_url);
//        clickElemnet(login_btn_OnDashBoardPage);
//        implicitWait(50);
//        enterInput(usename, prop.getProperty("naukri_email"));
//        enterInput(pass, prop.getProperty("naukri_password"));
//        clickElemnet(login_btn_toLogin);
//        clickElemnet(view_profile_tab);
//        clickElemnet(resume_Headline);
//        enterInput(textspance_of_Headline, String.valueOf(Keys.BACK_SPACE));
//        clickElemnet(Save_Btn);
//        return this;
//    }
}