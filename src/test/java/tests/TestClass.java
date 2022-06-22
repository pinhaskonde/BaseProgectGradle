package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class TestClass extends TestBase{

    String webSite = "https://www.google.com/";

    @Test
    public void f1(){
        wd.get(webSite);
    }

    @AfterSuite
    public void tearDown(){

        wd.quit();
    }



}
