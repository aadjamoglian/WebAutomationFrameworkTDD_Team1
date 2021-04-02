package cignawebsoftwaretest;

import cignawebsoftware.AboutUsPage;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AboutUsPageTest extends WebAPI {


    AboutUsPage aboutUsPage;

    @BeforeMethod
    public void getInit() {
        aboutUsPage = PageFactory.initElements(driver, AboutUsPage.class);
    }
    @Test(enabled = false)
    public void aboutUsDisplayedTest() {
        aboutUsPage.aboutUsDisplayed();
        boolean aboutUsDisplay=aboutUsPage.aboutUs.isDisplayed();
        Assert.assertEquals(aboutUsDisplay,true);
    }

    @Test(enabled = false)
    public void aboutUsTest() {
        aboutUsPage.aboutUs();
        String expectedTitle = "About Cigna | More than a Health Insurance Company";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(expectedTitle, actualTitle);
    }

    @Test(enabled = false)
    public void companyProfileTest() {
        aboutUsPage.companyProfile();
        String expectedUrl = "https://www.cigna.com/";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);
    }
    @Test(enabled = false)
    public void aboutUsTextTest() {
        aboutUsPage.aboutUs();
        String expectedText = "About Us";
        String actualText =aboutUsPage.aboutUsText.getText() ;
        Assert.assertEquals(expectedText, actualText,"test fail");
    }
    @Test(enabled = false)
    public void understandingInsuranceTest() throws InterruptedException {
        aboutUsPage.understandingInsurance();
        Thread.sleep(3000);
        String expectedText = "Popular Insurance Articles";
        String actualText =aboutUsPage.popularInsurance.getText() ;
        Assert.assertEquals(expectedText, actualText,"test fail");
    }
    @Test(enabled = false)
    public void contactUsTextTest() {
        aboutUsPage.contactUs();
        String expectedText = "Contact Us";
        String actualText =aboutUsPage.contactUsText.getText() ;
        Assert.assertEquals(expectedText, actualText,"test fail");
    }
    @Test(enabled = false)
    public void contactUsTest() {
        aboutUsPage.contactUs();
        String expectedUrl = "https://www.cigna.com/contact-us/";
        String actualUrl =driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl,"test fail");
    }
    @Test(enabled = false)
    public void checkPhoneNumberTextTest() {
        aboutUsPage.contactUs();
        String expectedText = "Phone Number";
        String actualText =aboutUsPage.phoneNumberText.getText() ;
        Assert.assertEquals(expectedText, actualText,"test fail");
    }
    @Test(enabled = false)
    public void customerServiceDisplayedTest() {
        aboutUsPage.customerServiceDisplayed();
        boolean customerServiceDisplay=aboutUsPage.customerService.isDisplayed();
        Assert.assertEquals(customerServiceDisplay,true);
    }
    @Test(enabled = false)
    public void onlineHelpDisplayedTest() {
        aboutUsPage.onlineHelpDisplayed();
        boolean onlineHelpDisplay=aboutUsPage.onlineHelp.isDisplayed();
        Assert.assertEquals(onlineHelpDisplay,true);
    }
    @Test(enabled = false)
    public void mailingAddressDisplayedTest() {
        aboutUsPage.mailingAddressDisplayed();
        boolean mailingAddressDisplay=aboutUsPage.mailingAddress.isDisplayed();
        Assert.assertEquals(mailingAddressDisplay,true);
    }
    @Test(enabled = false)
    public void languageSwitcherDisplayedTest() {
        aboutUsPage.languageSwitcherDisplayed();
        boolean languageSwitcherDisplay=aboutUsPage.english.isDisplayed();
        Assert.assertEquals(languageSwitcherDisplay,true);
    }
}

