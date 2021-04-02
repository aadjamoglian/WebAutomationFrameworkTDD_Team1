package cignawebsoftware;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static cignawebsoftware.logInToMyCignaWebElements.*;

public class LogInToMyCignaPage extends WebAPI {

    @FindBy(xpath = logInMyCignaLocator)
    public WebElement logInMyCigna;
    @FindBy(xpath = userNameLocator)
    public WebElement userName;
    @FindBy(xpath = passwordLocator)
    public WebElement password;
    @FindBy(xpath = logInButtonLocator)
    public WebElement logInButton;
    @FindBy(css = customerLogInLocator)
    public WebElement customerLogIn;


    public boolean logInMyCignaDisplayed() {
        return logInMyCigna.isDisplayed();
    }

    public void logInMyCigna() {
        logInMyCigna.click();
        userName.sendKeys("cherif005");
        password.sendKeys("Madjid22#");
        logInButton.click();
    }

    public boolean customerLogInDisplayed(){
        logInMyCigna.click();
        return customerLogIn.isDisplayed();
    }
}
