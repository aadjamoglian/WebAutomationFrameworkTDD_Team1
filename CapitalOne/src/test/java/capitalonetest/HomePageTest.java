package capitalonetest;

import common.WebAPI;
import homepage.CapitalOneHomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static homepage.CapitalOneHomePageWebElement.activateCreditCardLocator;
import static homepage.CapitalOneHomePageWebElement.relatedSolutionsLocator;

public class HomePageTest extends WebAPI {
    CapitalOneHomePage homepage;

    @BeforeMethod
    public void getInit(){
        homepage= PageFactory.initElements(driver,CapitalOneHomePage.class);
    }



    @Test
    public void testCommercialLink(){
        homepage.checkCommercialLink();
        String expectedText="Capital One Commercial Banking, Finance, and Investments";
        String actualText=driver.getTitle();
    }


    @Test
    public void testCommercialAndIndustrialLink(){
        homepage.checkCommercialLink();
        String expectedText="https://www.capitalone.com/commercial/industry-expertise/industrial-manufacturing/";
        String actualText=driver.getTitle();
    }
//    @Test
//    public void testCommercialRealEstateLink() throws InterruptedException {
//        homepage.checkCommercialRealEstateLink();
//        String expectedText="Related Solutions";
//        String actualText=getTextByXpath(relatedSolutionsLocator);
//    }

//    @Test
//    public void testIndustryExpertiseLink() throws InterruptedException {
//        homepage.checkIndustryExpertiseLInk();
//        String expectedText="https://www.capitalone.com/commercial/industry-expertise/";
//        String actualText=driver.getTitle();
//    }

    @Test
    public void testCommercialLendingLink(){
        homepage.checkCommercialLending();
        String expectedText="https://www.capitalone.com/commercial/solutions/lending/";
        String actualText=getTextByXpath(relatedSolutionsLocator);
    }
//    @Test
//    public void testDepositoryServicesLink(){
//        homepage.checkDepositoryServicesLink();
//        String expectedText="Tackling B2B Payment Fraud Risk";
//        String actualText=driver.getTitle();
//    }

//    @Test
//    public void testTreasuryManagementLink(){
//        homepage.checkTreasuryManagementLink();
//        String expectedText="Treasury Management Products and Services | Capital One";
//        String actualText=driver.getTitle();
//    }

//    @Test
//    public void testCaitalMarketLinkLink(){
//        homepage.checkCapitalMarketLocator();
//        String expectedText="Capital Markets, Investments and Financial Advisory | Capital One";
//        String actualText=driver.getTitle();
//    }

    @Test
    public void testLocations(){
        homepage.checkLocations();
        String expectedText="Capital One Locations Finder | Atms, Branches, Cafes";
        String actualText=driver.getTitle();
    }

    @Test
    public void testCreditCardLocators(){
        homepage.checkCreditCardProducts();
        String expectedText="Activate Credit Card | Support Center";
        String actualText=driver.findElement(By.xpath(activateCreditCardLocator)).getText();
    }

    @Test
    public void testActivateCreditCardLink(){
        homepage.checkActivateCreditCardLink();
        String expectedText="Activate Credit Card | Support Center";
        String actualText=driver.getTitle();
    }

//    @Test
//    public void testActivateNewCardOnlineLink(){
//        homepage.checkActivateNewCardOnlineLink();
//        String expectedText="Capital One Enrollment";
//        String actualText=driver.getTitle();
//    }

    @Test
    public void testMailCreditCardPaymentLink(){
        homepage.checkMailCreditCardPaymentLink();
        String expectedText="Mail Credit Card Payment | Support Center";
        String actualText=driver.getTitle();
    }

    @Test
    public void testCreditCardExpirationLink(){
        homepage.checkCreditCardExpirationLink();
        String expectedText="Credit Card Expiration | Support Center";
        String actualText=driver.getTitle();
    }

    @Test
    public void testCardOverseas(){
        homepage.checkCardOverseas();
        String expectedText="Notify Travel | Support Center";
        String actualText=driver.getTitle();
    }

    @Test
    public void testLostStolenAndDamagedCardLink(){
        homepage.checkLostStolenAndDamagedCardLInk();
        String expectedText="Lost, Stolen or Damaged Card | Support Center";
        String actualText=driver.getTitle();
    }
//    @Test
//    public void testReplacementCreditCardLink(){
//        homepage.checkReplacementCardLink();
//        String expectedText="Sign In";
//        String actualText=driver.findElement(By.xpath("/html/body/app-root/div/div/app-sign-in/ci-content-card/div/div/ngx-ent-signin/form/p[2]/button")).getText();
//    }

    @Test
    public void testCreditLimitIncreaseLink(){
        homepage.checkCreditLimitIncreaseLink();
        String expectedText="Credit Limit Increase";
        String actualText=driver.getTitle();
    }
//    @Test
//    public void testRequestCreditLineIncreaseLink(){
//        homepage.checkRequestCreditLineIncrease();
//        String expectedText="Sign In";
//        String actualText=driver.getTitle();
//    }

//    @Test
//    public void testAutoLoans(){
//        homepage.checkAutoLoanLInks();
//        String expectedText="New & Used Cars for Sale in Warren, MI";
//        String actualText=driver.getTitle();
//    }

    @Test
    public void testCardDeliveryLocator(){
        homepage.checkCardDeliveryLink();
        String expectedText="Card Delivery | Support Center";
        String actualText=driver.getTitle();
    }

    @Test
    public void testLockCardLink(){
        homepage.checkLockCardLink();
        String expectedText="Lock Debit Card | Support Center";
        String actualText=driver.getTitle();
    }

    @Test
    public void testManageCardUserLInk(){
        homepage.checkManageCardUserLink();
        String expectedText="Manage Card Users | Support Center";
        String actualText=driver.getTitle();
    }

    @Test
    public void testBankingContactLInk(){
        homepage.checkManageCardUserLink();
        String expectedText="Banking Contact | Support Center";
        String actualText=driver.getTitle();
    }











}