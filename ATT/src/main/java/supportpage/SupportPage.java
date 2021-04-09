package supportpage;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static supportpage.SupportPageWebElements.*;

public class SupportPage extends WebAPI {

    @FindBy(css = supportLocator)
    public WebElement support;
    @FindBy(xpath = welcomeToAtAndTSupportLocator)
    public WebElement welcomeToAtAndTSupport;
    @FindBy(xpath = viewMyBillLocator)
    public WebElement viewMyBill;
    @FindBy(xpath = userIdLocator)
    public WebElement userId;
    @FindBy(xpath = passwordLocator)
    public WebElement password;
    @FindBy(xpath = signInButtonLocator)
    public WebElement signInButton;
    @FindBy(xpath = errorCodeAreaLocator)
    public WebElement errorCodeArea;
  @FindBy(xpath = userLabelLocator)
    public WebElement userLabel;
    @FindBy(xpath = passwordLabelLocator)
    public WebElement passwordLabel;
    @FindBy(xpath = don_tHaveIdTextLocator)
    public WebElement don_tHaveIdText;
    @FindBy(xpath = makeAPaymentLocator)
    public WebElement makeAPayment;
    @FindBy(xpath = saveUserIdLocator)
    public WebElement saveUserId;
    @FindBy(css = restMyPasswordLocator)
    public WebElement restMyPassword;
    @FindBy(css = FindYourPasswordLocator)
    public WebElement FindYourPassword;
    @FindBy(linkText = manageDataUseLocator)
    public WebElement manageDataUse;
    @FindBy(linkText = TradeInOrRecycleDeviceLocator) public WebElement TradeInOrRecycleDevice;
    @FindBy(linkText = billAndAccountLocator) public WebElement billAndAccount;
    @FindBy(linkText = wirelessLocator) public WebElement wireless;
    @FindBy(linkText = at_tRepaidLocator) public WebElement at_tRepaid;
    @FindBy(xpath = tvLocator) public WebElement tv;
    @FindBy(xpath = at_tTvLocator) public WebElement at_tTv;
    @FindBy(css = at_tTvSupportLocator) public WebElement at_tTvSupport;
    @FindBy(css = hboMaxLocator) public WebElement hboMax;
    @FindBy(xpath = internetLocator) public WebElement internet;
    @FindBy(xpath = at_tInternetLocator) public WebElement at_tInternet;
    @FindBy(xpath = at_tInternetSupportLocator) public WebElement at_tInternetSupport;

    public void viewMyBillSignIn() {
        support.click();
        viewMyBill.click();
        userId.sendKeys("cheriiijuxbxg");
        password.sendKeys("fsggsxzbz ");
        signInButton.click();
    }
    public boolean supportDisplay() {
        return support.isDisplayed();
    }

    public void support() {
        support.click();
    }

    public boolean viewMyBillDisplayed() {
        support();
        return viewMyBill.isDisplayed();
    }

    public void viewMyBill() {
        support.click();
        viewMyBill.click();
    }

    public boolean don_tHaveIdTextDisplay() {
        support.click();
        viewMyBill.click();
        return don_tHaveIdText.isDisplayed();
    }

    public boolean passwordLabelDisplay() {
        support.click();
        viewMyBill.click();
        return passwordLabel.isDisplayed();
    }

    public boolean userLabelDisplay() {
        support.click();
        viewMyBill.click();
        return userLabel.isDisplayed();
    }

    public boolean saveUserIdDisplay() {
        support.click();
        viewMyBill.click();
        return saveUserId.isDisplayed();
    }

    public void makeAPayment() {
        support.click();
        makeAPayment.click();
    }

    public void restMyPassword() {
        support.click();
        restMyPassword.click();
    }

    public void manageDataUse() {
        support.click();
        manageDataUse.click();
    }
    public void TradeInOrRecycleDevice() {
        support.click();
        TradeInOrRecycleDevice.click();
    }
    public void billAndAccount(){
        support.click();
        billAndAccount.click();
    }
    public boolean wirelessDisplayed() {
        support();
        wireless.click();
        return wireless.isDisplayed();
    }
    public boolean at_tRepaidDisplayed() {
        support();
        at_tRepaid.click();
        return at_tRepaid.isDisplayed();
    }
    public boolean tvDisplayed() {
        support();
        return tv.isDisplayed();
    }
    public void at_tTv(){
        support();
        at_tTv.click();
    }
    public void hboMax(){
        support();
        hboMax.click();
    }
    public boolean internetDisplayed(){
        support();
       boolean internetDisplayed=internet.isDisplayed();
       return internetDisplayed;
    }
    public String at_tInternet(){
        support();
        at_tInternet.click();
        String text =at_tInternetSupport.getText();
        return  text;
    }
}