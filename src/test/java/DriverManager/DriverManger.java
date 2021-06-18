package DriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManger {

    public static WebDriver driver;

    public static WebDriver getDriverManager(String browsername)
    {
        if(browsername.equalsIgnoreCase("chrome"))
        {
            driver = new ChromeDriver();
        }
        else if (browsername.equalsIgnoreCase("firefox"))
        {
            driver = new FirefoxDriver();

        }
        else
        {
            System.out.println("No driver selected");
        }

        return driver;
    }

}
