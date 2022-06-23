package tests;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.lang.reflect.Method;

public class TestClass extends TestBase {

    String webSite = "https://www.google.com/";

    @Test
    public void f1(Method m) {
        wd.get(webSite);
        logger.info(">>>    Logger from method  -   " + m.getName());
    }

    String youtoobe = "https://www.youtube.com/";
    @Test
    public void f2(Method m) {
        wd = new ChromeDriver();
        wd.get(youtoobe);
        logger.info(">>>    Logger from method  -   " + m.getName());
    }
}
