package homepage;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static homepage.CapitalOneHomePageWebElement.*;

public class CapitalOneHomePage extends WebAPI {

    @FindBy(how = How.XPATH, using = locationSearchBoxLocator) public WebElement locationSearchBox;
    @FindBy(how = How.CSS, using = locationsSearchButtonLocator) public WebElement locationsearchButton;
    @FindBy(how = How.XPATH, using = carSearchBoxLocator) public WebElement carSearchBox;
    @FindBy(how = How.XPATH, using = carSearchButtonLocator) public WebElement carSearchButton;




    public void checkCommercialLink(){
        getTextByXpath(commercialLocator);
    }
    public void checkCommercialAndIndustrialLink(){
        checkCommercialLink();
        mouseHoverByXpath(commercialAndIndustrialLocator);
    }

//    public void checkCommercialRealEstateLink() throws InterruptedException {
//        getTextByXpath(commercialLocator);
//        sleepFor(2);
//        mouseHoverByXpath(commercialRealEstateLocator);
//    }
//
//    public void checkIndustryExpertiseLInk() throws InterruptedException {
//
//        clickByXpath(industryExpertiseLocator);
//    }

    public void checkCommercialLending(){
        checkCommercialLink();
        getTextByXpath(commercialLendingLocator);
    }

//    public void checkDepositoryServicesLink(){
//        checkCommercialLink();
//        clickByLinkText("Depository Services");
//        clickByXpath(businessPaymentSecurityLocator);
//    }

//    public void checkTreasuryManagementLink(){
//        checkCommercialLink();
//        clickByXpath(treasuryManagementLocator);
//    }
//    public void checkCapitalMarketLocator(){
//        checkCommercialLink();
//        getTextByXpath(capitalMarketLocator);
//    }
    public void checkLocations(){
        clickByXpath(locationsLocator);
        locationSearchBox.sendKeys(zipcodeLocator);
        clickOnElement(locationsSearchButtonLocator);
    }
    public void checkCreditCardProducts(){
        clickByXpath(supportLocator);
        clickByLinkText("Credit Card Products");
    }

    public void checkActivateCreditCardLink(){
        checkCreditCardProducts();
        getTextByXpath(activateCreditCardLocator);

    }
//    public void checkActivateNewCardOnlineLink(){
//        checkCreditCardProducts();
//        getTextByXpath(activateCreditCardLocator);
//        clickByXpath(activateNewCardOnlineLocator);
//    }

    public void checkMailCreditCardPaymentLink(){
        checkCreditCardProducts();
        clickByXpath(mailCreditCardLocator);
    }

    public void checkCreditCardExpirationLink(){
        clickByXpath(supportLocator);
        clickByLinkText("Credit Card Products");
        getTextByXpath(creditCardExpirationLink);
    }
    public void checkCardOverseas(){
        checkCreditCardProducts();
        getTextByXpath(cardOverseasLocator);
    }

    public void checkLostStolenAndDamagedCardLInk(){
        clickByXpath(supportLocator);
        clickByLinkText("Credit Card Products");
        getTextByXpath(lostStolenAndDamagedCardLocator);
    }
//    public void checkReplacementCardLink(){
//        checkCreditCardProducts();
//        getTextByXpath(lostStolenAndDamagedCardLocator);
//        clickByXpath(getReplacementCardLocator);
//    }

    public void checkCreditLimitIncreaseLink(){
        checkCreditCardProducts();
        getTextByXpath(creditLimitIncreaseLocator);
    }

//    public void checkRequestCreditLineIncrease(){
//        clickByXpath(supportLocator);
//        clickByLinkText("Credit Card Products");
//        getTextByXpath(creditLimitIncreaseLocator);
//        clickByLinkText("request a credit line increase");
//    }

//    public void checkAutoLoanLInks(){
//        getTextByXpath(autoLoansLocator);
//        clickByXpath(searchCarLocator);
//        carSearchBox.sendKeys(carModelLocator);
//        carSearchButton.click();
//    }

    public void checkCardDeliveryLink(){
        checkCreditCardProducts();
        getTextByXpath(carDeliveryLocator);
    }

    public void checkLockCardLink(){
        clickByXpath(supportLocator);
        clickByLinkText("Credit Card Products");
        getTextByXpath(lockCardLocator);
    }
    public void checkManageCardUserLink(){
        checkCreditCardProducts();
        clickOnElement(manageCardUserLink);
    }
    public void checkBankingContact(){
        clickByXpath(supportLocator);
        getTextByXpath(bankingContactLocator);
    }





}
