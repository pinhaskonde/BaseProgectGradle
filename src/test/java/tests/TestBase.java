package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import pages.HomePage;
import pages.PageBase;

public class TestBase {
    protected HomePage homePage;

    Logger logger = LoggerFactory.getLogger(HomePage.class);

    protected WebDriver wd;

    @BeforeSuite
    public void init(){
        wd = new ChromeDriver();
        wd.manage().window().maximize();

        homePage = PageFactory.initElements(wd,HomePage.class);
        logger.info("Start method -->   ");
    }

    @AfterMethod
    public void tearDown(){
        logger.info("'wd.quit' - started!");
        wd.quit();
    }


}
