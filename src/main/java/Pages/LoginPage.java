package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    private By UsernameBox = By.id("inputUsername");
    private By PasswordBox = By.name("inputPassword");
    //private By LoginButton = By.cssSelector("button[type='submit']");
    private By LoginButton = By.className("signInBtn") ;

    public void UserLogin(String Username, String Password) {

    driver.findElement(UsernameBox).sendKeys(Username);
    driver.findElement(PasswordBox).sendKeys(Password);

    }
    public void ClickButton ()
    {
        driver.findElement(LoginButton).click();
    }

}
