package supportpagetest;

import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import supportpage.SupportPage;

public class SupportPageTest extends WebAPI {
    SupportPage supportPage;
@BeforeMethod
    public void getInit() {
        supportPage = PageFactory.initElements(driver, SupportPage.class);
    }

    @Test(enabled = true)
    public void supportTest() {
        supportPage.support();
        String expectedText="Welcome to AT&T Support";
        String actualText = supportPage.welcomeToAtAndTSupport.getText();
        Assert.assertEquals(expectedText,actualText,"test fail");
    }

    @Test(enabled = false)
    public void supportDisplayedTest() {
        supportPage.supportDisplay();
        boolean display = supportPage.support.isDisplayed();
        Assert.assertEquals(display, true);
    }

    @Test(enabled = false)
    public void viewMyBillDisplayedTest() {
        supportPage.viewMyBillDisplayed();
        boolean display = supportPage.viewMyBill.isDisplayed();
        Assert.assertEquals(display, true);
    }
    @Test(enabled = false)
    public void viewMyBillTest(){
        supportPage.viewMyBill();
        String viewMyBillTitle=driver.getTitle();
        Assert.assertEquals(viewMyBillTitle,"Login Screen");
    }


    @Test(enabled =false)
    public void viewMyBillSignInTest(){
        supportPage.viewMyBillSignIn();
        String text = supportPage.errorCodeArea.getText();
        Assert.assertEquals(text,"CARE CODE: 201 [LU100]");
    }




    @Test(enabled = false)
    public void don_tHaveIdTextDisplayTest() {
        supportPage.don_tHaveIdTextDisplay();
        boolean display = supportPage.don_tHaveIdText.isDisplayed();
        Assert.assertEquals(display, true);
    }
    @Test(enabled = false)
    public void passwordLabelDisplayTest() {
        supportPage.passwordLabelDisplay();
        boolean display = supportPage.passwordLabel.isDisplayed();
        Assert.assertEquals(display, true);
    }
    @Test(enabled = false)
    public void userLabelDisplayTest() {
        supportPage.userLabelDisplay();
        boolean userLabelDisplayed = supportPage.userLabel.isDisplayed();
        Assert.assertEquals(userLabelDisplayed, true);
        System.out.println("user Label Displayed is "+userLabelDisplayed );
    }
    @Test(enabled = false)
    public void saveUserIdDisplayTest() {
        supportPage.saveUserIdDisplay();
        boolean display = supportPage.saveUserId.isDisplayed();
        Assert.assertEquals(display, true);
    }


    @Test(enabled = false)
    public void makeAPaymentTest(){
        supportPage.makeAPayment();
        String makeAPaymentUrl = driver.getCurrentUrl();
        Assert.assertEquals(makeAPaymentUrl,"https://signin.att.com/dynamic/iamLRR/LrrController?IAM_OP=login&appName=m10707&loginSuccessURL=https%3A%2F%2Foidc.idp.clogin.att.com%2Fmga%2Fsps%2Foauth%2Foauth20%2Fauthorize%3Fnonce%3DMsWgrdunFm%26redirect_uri%3Dhttps%253A%252F%252Fwww.att.com%252Fisam%252Fsps%252Foidc%252Frp%252Fconsumerfed%252Fredirect%252FolamOP%26response_mode%3Dform_post%26alt_dest%3Dhttps%25253A%25252F%25252Fwww.att.com%25252Folam%25252FpassthroughAction.myworld%25253FactionType%25253DMakePayment%26scope%3Dopenid%2BauthenticationTypes%26response_type%3Did_token%26state%3DRKmxBJ8DKt%26client_id%3Dm10707");
    }





    @Test(enabled = false)
    public void restMyPasswordTest(){
        supportPage.restMyPassword();
        String expectedText="Find your password";
        String ActualText = supportPage.FindYourPassword.getText();
        Assert.assertEquals(ActualText,expectedText,"test fail");
    }
    @Test(enabled = false)
    public void manageDataUseTest(){
        supportPage.manageDataUse();
        String expectedTitle="Login Screen";
        String actualTitle=driver.getTitle();
        Assert.assertEquals(expectedTitle,actualTitle,"test fail");
    }
    @Test(enabled = false)
    public void TradeInOrRecycleDeviceTest(){
        supportPage.TradeInOrRecycleDevice();
        String expectedUrl="https://www.att.com/support/article/wireless/KM1041824";
        String actualUrl=driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl,"test fail");
    }
    @Test(enabled = false)
    public void billAndAccountTest(){
        supportPage.billAndAccount();
        String expectedUrl="https://www.att.com/support/topic/my-account/";
        String actualUrl=driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl,"test fail");
    }
    @Test(enabled = false)
    public void wirelessDisplayedTest() {
        supportPage.wirelessDisplayed();
        boolean display = supportPage.wireless.isDisplayed();
        Assert.assertEquals(display, true);
    }
    @Test(enabled = false)
    public void at_tRepaidDisplayedTest() {
        supportPage.at_tRepaidDisplayed();
        boolean display = supportPage.at_tRepaid.isDisplayed();
        Assert.assertEquals(display, true);
    }
    @Test(enabled = false)
    public void tvDisplayedTest() {
        supportPage.tvDisplayed();
        boolean display = supportPage.tv.isDisplayed();
        Assert.assertEquals(display, true);

    }@Test(enabled = false)
    public void at_tTvTest(){
       supportPage.at_tTv();
        String expectedText="AT&T TV support";
        String actualText=supportPage.at_tTvSupport.getText();
        Assert.assertEquals(actualText,expectedText,"test fail");
    }
    @Test(enabled = false)
    public void hboMaxTest(){
        supportPage.hboMax();
        String expectedTitle="HBO Max Sign-in FAQ - Bill & account Support";
        String actualTitle=driver.getTitle();
        Assert.assertEquals(expectedTitle,actualTitle,"test fail");
    }
    @Test(enabled = false)
    public void internetDisplayedTest() {
        supportPage.internetDisplayed();
        boolean userLabelDisplayed = supportPage.internet.isDisplayed();
        Assert.assertEquals(userLabelDisplayed, true);
    }
    @Test(enabled = false)
    public void at_tInternetTest(){
        supportPage.at_tInternet();
        String expectedText="AT&T Internet support";
        String actualText=supportPage.at_tInternetSupport.getText();
        Assert.assertEquals(expectedText,actualText,"test fail");
    }
}
