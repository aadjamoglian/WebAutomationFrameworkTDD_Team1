package cignawebsoftware;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import static cignawebsoftware.AboutUsPageWebElements.*;

public class AboutUsPage extends WebAPI {

    @FindBy(xpath = aboutUsLocator)
    public WebElement aboutUs;
    @FindBy(xpath = companyProfileLocator)
    public WebElement companyProfile;
    @FindBy(xpath = aboutUsTextLocator)
    public WebElement aboutUsText;
    @FindBy(css = understandingInsuranceLocator)
    public WebElement understandingInsurance;
    @FindBy(xpath = popularInsuranceLocator)
    public WebElement popularInsurance;
    @FindBy(xpath = contactUsLocator) public WebElement contactUs;
    @FindBy(xpath = contactUsTextLocator) public WebElement contactUsText;
    @FindBy(xpath = phoneNumberTextLocator) public WebElement phoneNumberText;
    @FindBy(css = customerServiceLocator) public WebElement customerService;
    @FindBy(xpath = onlineHelpLocator) public WebElement onlineHelp;
    @FindBy(xpath = mailingAddressLocator) public WebElement mailingAddress;
    @FindBy(xpath = languageSwitcherLocator) public WebElement languageSwitcher;
    @FindBy(xpath = englishLocator) public WebElement english;

    public boolean aboutUsDisplayed() {
     return aboutUs.isDisplayed();
    }


    public void aboutUs() {
        Actions actions = new Actions(driver);
        WebElement aboutUs = driver.findElement(By.xpath("//a[@id='about-us-level-one-link']"));
        actions.moveToElement(aboutUs).perform();
        aboutUs.click();
    }

    public void companyProfile() {
        Actions actions = new Actions(driver);
        WebElement aboutUs = driver.findElement(By.xpath("//a[@id='about-us-level-one-link']"));
        actions.moveToElement(aboutUs).perform();
        companyProfile.click();

    }
    public void understandingInsurance(){
        Actions actions = new Actions(driver);
        WebElement aboutUs = driver.findElement(By.xpath("//a[@id='about-us-level-one-link']"));
        actions.moveToElement(aboutUs).perform();
        understandingInsurance.click();
    }
    public void contactUs(){
        contactUs.click();
    }
    public boolean customerServiceDisplayed(){
        contactUs.click();
        return  customerService.isDisplayed();
    }
    public boolean onlineHelpDisplayed(){
        contactUs.click();
        return  onlineHelp.isDisplayed();
    }

    public boolean mailingAddressDisplayed(){
        contactUs.click();
        return  mailingAddress.isDisplayed();
    }
    public boolean languageSwitcherDisplayed(){
        languageSwitcher.click();
        return english.isDisplayed();
    }
}
