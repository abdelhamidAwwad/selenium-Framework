import Pages.HomePageDropDown;
import Pages.LoginPage;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;

public class LoginTest extends TestBase {

    LoginPage loginPage;
    HomePageDropDown homePageDropDown ;

    @Test
    @Severity(SeverityLevel.BLOCKER)

    public void UserRegisterSuccessfully() {
        loginPage = new LoginPage(driver);

        loginPage.UserLogin("Abdo", "rahulshettyacademy");
        loginPage.ClickButton();

    }

   // @Test
    public void ChangeCurrency() {

        homePageDropDown= new HomePageDropDown(driver) ;
        homePageDropDown.DrobDown();


    }
}
