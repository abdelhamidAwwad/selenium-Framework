package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class HomePageDropDown {


    WebDriver driver;
    private Select DrobDownList ;  // Create object

    public HomePageDropDown(WebDriver driver) {
        this.driver = driver;
    }

    private By ChangeCurrencyDropDown = By.id("ctl00_mainContent_DropDownListCurrency");


    public void DrobDown ()
    {

        DrobDownList =new Select(driver.findElement(ChangeCurrencyDropDown));
        DrobDownList.selectByIndex(3);
    }

}



