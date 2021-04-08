package homepage;

import common.WebAPI;
import databases.ConnectToSqlDB;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import utilities.DataReader;

import java.io.IOException;
import java.sql.SQLException;

import static homepage.CapitalOneHomePageWebElement.*;

public class CapitalOneHomePage extends WebAPI {

    @FindBy(how = How.XPATH, using = locationSearchBoxLocator)
    public WebElement locationSearchBox;
    @FindBy(how = How.CSS, using = locationsSearchButtonLocator)
    public WebElement locationsearchButton;
    @FindBy(how = How.XPATH, using = carSearchBoxLocator)
    public WebElement carSearchBox;
    @FindBy(how = How.XPATH, using = carSearchButtonLocator)
    public WebElement carSearchButton;
    @FindBy(how = How.XPATH, using = userNameLocator)
    public WebElement userName;
    @FindBy(how = How.XPATH, using = passwordLocator)
    public WebElement password;

    //
//    public void checkDataProvider() throws IOException, InterruptedException {
//        DataReader read = new DataReader();
//        String[][] data = read.fileReader1("datatest/ReadData.xlsx", 1);
//        String readdata = data[1][0];
//        String readDat = data[1][1];
//        clickByXpath(signInLocator);
//        userName.sendKeys(readdata);
//        password.sendKeys(readDat);
//        sleepFor(3);
//        clickByXpath(signInSubmitLocator);
//    }
//
//    public void checkAutoLoanLInks() throws SQLException, IOException, ClassNotFoundException, InterruptedException {
//        ConnectToSqlDB connect = new ConnectToSqlDB();
//        String tableName = "carnames";
//        ConnectToSqlDB.connectToSqlDatabase();
//        ConnectToSqlDB.statement = ConnectToSqlDB.connect.createStatement();
//        ConnectToSqlDB.resultSet = ConnectToSqlDB.statement.executeQuery("select * from carnames where id=1");
//
//        while (ConnectToSqlDB.resultSet.next()) {
//            clickByXpath(autoLoansLocator);
//            clickByXpath(searchCarLocator);
//
//            carSearchBox.sendKeys(ConnectToSqlDB.resultSet.getString("CarName"));
//            sleepFor(3);
//            carSearchButton.click();
//        }
//    }
//
//    public void checkReplacementCardLink() throws IOException {
//        DataReader read = new DataReader();
//        String[][] data = read.fileReader1("datatest/ReadData.xlsx", 1);
//        String readdata = data[2][0];
//        String readDat = data[2][1];
//        checkCreditCardProducts();
//        getTextByXpath(lostStolenAndDamagedCardLocator);
//        clickByXpath1(getReplacementCardLocator);
//        userName.sendKeys(readdata);
//        password.sendKeys(readDat);
//        clickByXpath(signInSubmitLocator);
//    }
    public void checkLocations() {
        clickByXpath(locationsLocator);
        locationSearchBox.sendKeys(zipcodeLocator);
        clickOnElement(locationsSearchButtonLocator);
    }

    public void checkCardDeliveryLink() {
        checkCreditCardProducts();
        getTextByXpath(carDeliveryLocator);
    }

    public void checkLockCardLink() {
        clickByXpath(supportLocator);
        clickByLinkText("Credit Card Products");
        getTextByXpath(lockCardLocator);
    }

    public void checkCommercialLink() {
        getTextByXpath(commercialLocator);
    }

    public void checkCommercialAndIndustrialLink() {
        checkCommercialLink();
        mouseHoverByXpath(commercialAndIndustrialLocator);
    }


    public void checkCreditCardProducts() {
        clickByXpath(supportLocator);
        clickByLinkText("Credit Card Products");
    }

    public void checkActivateCreditCardLink() {
        checkCreditCardProducts();
        getTextByXpath(activateCreditCardLocator);
    }

    public void checkActivateNewCardOnlineLink() {
        checkCreditCardProducts();
        getTextByXpath(activateCreditCardLocator);
        //clickByXpath1(activateNewCardOnlineLocator);
    }

    public void checkMailCreditCardPaymentLink() {
        checkCreditCardProducts();
        clickByXpath(mailCreditCardLocator);
    }

    public void checkCreditCardExpirationLink() {
        clickByXpath(supportLocator);
        clickByLinkText("Credit Card Products");
        getTextByXpath(creditCardExpirationLink);
    }

    public void checkCardOverseas() {
        checkCreditCardProducts();
        getTextByXpath(cardOverseasLocator);
    }

    public void checkLostStolenAndDamagedCardLInk() {
        clickByXpath(supportLocator);
        clickByLinkText("Credit Card Products");
        getTextByXpath(lostStolenAndDamagedCardLocator);
    }


    public void checkCreditLimitIncreaseLink() {
        checkCreditCardProducts();
        getTextByXpath(creditLimitIncreaseLocator);
    }

    public void checkRequestCreditLineIncrease() {
        clickByXpath(supportLocator);
        clickByLinkText("Credit Card Products");
        getTextByXpath(creditLimitIncreaseLocator);
        //clickByLinkText("request a credit line increase");
        //clickByXpath(requestCreditLimitIncreaseLocator);
    }


    public void checkManageCardUserLink() {
        checkCreditCardProducts();
        clickOnElement(manageCardUserLink);
    }

    public void checkBankingContact() {
        clickByXpath(supportLocator);
        getTextByXpath(bankingContactLocator);
    }

    public void checkRightClickSetUpAccount() {
        Actions action = new Actions(driver);
        action.contextClick(driver.findElement(By.xpath("//*[@id=\"setUpAccess\"]"))).perform();

    }
}
