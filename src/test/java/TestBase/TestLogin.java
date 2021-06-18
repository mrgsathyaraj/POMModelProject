package TestBase;

import PageObjects.LoginPageObjects;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class TestLogin extends TestBase {



    @Test
    public void LoginPage()
    {
        driver.get(loginURL);
        LoginPageObjects login = new LoginPageObjects(driver);
        login.searchMain("watch");


    }
}
