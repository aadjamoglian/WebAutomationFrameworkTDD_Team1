package homepageTest;

import common.WebAPI;
import homepage.CapitalOneHomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.io.IOException;
import java.sql.SQLException;

import static homepage.CapitalOneHomePageWebElement.*;

public class CapitalOneHomePageTest extends WebAPI {
    CapitalOneHomePage homepage;

    @BeforeMethod
    public void getInit(){
        homepage= PageFactory.initElements(driver, CapitalOneHomePage.class);
    }

//    @Test
//    public void testSignIn() throws IOException, InterruptedException {
//        homepage.checkDataProvider();
//        String expectedText="Sign In";
//        String actualText=driver.getTitle();
//        Assert.assertEquals(actualText,expectedText,"Link is not working");
//    }

    @Ignore
    @Test
    public void testCommercialLink(){
        homepage.checkCommercialLink();
        String expectedText="Capital One Credit Cards, Bank, and Loans - Personal and Business";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not working");
    }

    @Test
    public void testCommercialAndIndustrialLink(){
        homepage.checkCommercialLink();
        String expectedText="Capital One Credit Cards, Bank, and Loans - Personal and Business";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not working");
    }

    @Test
    public void testLocations(){
        homepage.checkLocations();
        String expectedText="Capital One Locations Finder | Atms, Branches, Cafes";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not working");
    }

    @Test
    public void testCreditCardLocators(){
        homepage.checkCreditCardProducts();
        String expectedText="Activate Credit Card | Support Center";
        String actualText=driver.findElement(By.xpath(activateCreditCardLocator)).getText();
        Assert.assertEquals(actualText,expectedText,"Link is not working");
    }

    @Test
    public void testActivateCreditCardLink(){
        homepage.checkActivateCreditCardLink();
        String expectedText="Support Center Search Results";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not working");
    }

    @Test
    public void testActivateNewCardOnlineLink(){
        homepage.checkActivateNewCardOnlineLink();
        String expectedText="Support Center Search Results";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not working");
    }

    @Test
    public void testMailCreditCardPaymentLink(){
        homepage.checkMailCreditCardPaymentLink();
        String expectedText="Support Center Search Results";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not working");
    }

    @Test
    public void testCreditCardExpirationLink(){
        homepage.checkCreditCardExpirationLink();
        String expectedText="Support Center Search Results";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not working");
    }

    @Test
    public void testCardOverseas(){
        homepage.checkCardOverseas();
        String expectedText="Support Center Search Results";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not working");
    }

    @Test
    public void testLostStolenAndDamagedCardLink(){
        homepage.checkLostStolenAndDamagedCardLInk();
        String expectedText="Support Center Search Results";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not working");
    }

    @Test
    public void testCreditLimitIncreaseLink(){
        homepage.checkCreditLimitIncreaseLink();
        String expectedText="Support Center Search Results";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not working");
    }

    @Test
    public void testRequestCreditLineIncreaseLink(){
        homepage.checkRequestCreditLineIncrease();
        String expectedText="Support Center Search Results";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not working");
    }

//    @Test
//    public void testAutoLoans() throws ClassNotFoundException, SQLException, InterruptedException, IOException {
//        homepage.checkAutoLoanLInks();
//        String expectedText="New & Used Cars for Sale in Warren, MI";
//        String actualText=driver.getTitle();
//        Assert.assertEquals(actualText,expectedText,"Link is not working");
//    }

    @Test
    public void testCardDeliveryLocator(){
        homepage.checkCardDeliveryLink();
        String expectedText="Support Center Search Results";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not working");
    }

    @Test
    public void testLostStolenAndDamagedCardLinks(){
        homepage.checkLostStolenAndDamagedCardLInk();
        String expectedText="Support Center Search Results";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not working");
    }

    @Test
    public void testLockCardLink(){
        homepage.checkLockCardLink();
        String expectedText="Support Center Search Results";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not working");
    }

    @Test
    public void testManageCardUserLInk(){
        homepage.checkManageCardUserLink();
        String expectedText="Support Center Search Results";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not working");
    }

    @Test
    public void testBankingContactLInk(){
        homepage.checkManageCardUserLink();
        String expectedText="Support Center Search Results";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not working");
    }

    @Test
    public void testRightClick(){
        homepage.checkRightClickSetUpAccount();

    }

}
