package TestBase;

import DriverManager.DriverManger;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestBase {

    protected String loginURL= "https://www.amazon.in/";
    protected WebDriver driver;

    @Before
    public void initBrowser()
    {
        driver = DriverManger.getDriverManager("Chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5000, TimeUnit.MILLISECONDS);
    }



}
