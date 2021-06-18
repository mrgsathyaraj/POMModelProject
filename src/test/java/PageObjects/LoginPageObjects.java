package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPageObjects {

    private WebDriver driver;

    private By searchboxmain = By.id("twotabsearchtextbox");
    private By submitsearchbutton =  By.id("nav-search-submit-button");


    public LoginPageObjects(WebDriver driver)
    {
        this.driver=driver;
    }

    public void searchMain(String searchcharacter)
    {

        driver.findElement(searchboxmain).sendKeys(searchcharacter);
        driver.findElement(submitsearchbutton).submit();
    }





}
