package cignawebsoftwaretest;

import cignawebsoftware.LogInToMyCignaPage;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LogInToMyCignaPageTest extends WebAPI {

    LogInToMyCignaPage logInToMyCignaPage;


    @BeforeMethod
    public void getInit() {
        logInToMyCignaPage = PageFactory.initElements(driver, LogInToMyCignaPage.class);
//        registration = PageFactory.initElements(driver, Registration.class);
    }

    @Test(enabled = false)
    public void logInMyCignaDisplayedTest() {
        logInToMyCignaPage.logInMyCignaDisplayed();
        boolean logInMyCignaDisplay = logInToMyCignaPage.logInMyCigna.isDisplayed();
        Assert.assertEquals(logInMyCignaDisplay, true);
    }

    @Test(enabled = false)
    public void logInMyCignaTest() {
        logInToMyCignaPage.logInMyCigna();
//    String expectedText="Log Out";
//    String actualText=logInToMyCignaPage.logOut.getText();
//    Assert.assertEquals(expectedText,actualText,"true");
    }

    @Test(enabled = false)
    public void customerLogInDisplayedTEST() {
        logInToMyCignaPage.customerLogInDisplayed();
        boolean customerLogInDisplay = logInToMyCignaPage.customerLogIn.isDisplayed();
        Assert.assertEquals(customerLogInDisplay, true);
    }

}
