package commercialpage;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.BeforeMethod;

import static commercialpage.SignInWebElements.*;

public class SignInPage extends WebAPI {
    @FindBy(xpath = signInLocator)
    public WebElement signIn;
    @FindBy(css = userNameLocator)
    public WebElement userName;
    @FindBy(css = passwordLocator)
    public WebElement password;
    @FindBy(xpath = checkBoxRememberMeLocator)
    public WebElement checkBoxRememberMe;
    @FindBy(xpath = signInButtonLocator)
    public WebElement signInButton;
    @FindBy(xpath = oopsTextLocator)
    public WebElement oopsText;

    public void checkSignIn() {
        userName.sendKeys("ameurcherif");
        password.sendKeys("gftdvbxvgsg");
        checkBoxRememberMe.click();
        signInButton.click();
    }

    public boolean signInButtonDisplayed() {
       return signInButton.isDisplayed();
    }

    public boolean userNameDisplayed() {
        return userName.isDisplayed();
    }


    public boolean passwordDisplayed() {
        return password.isDisplayed();
    }


    public boolean checkBoxRememberMeDisplayed() {
        return checkBoxRememberMe.isDisplayed();
    }






}
