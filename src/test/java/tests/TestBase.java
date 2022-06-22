package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import pages.PageBase;

public class TestBase {

    WebDriver wd;

    @BeforeSuite
    public void init(){
        wd = new ChromeDriver();
        wd.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown(){

    }


}
