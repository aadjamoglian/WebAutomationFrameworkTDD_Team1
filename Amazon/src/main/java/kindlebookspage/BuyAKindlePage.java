package kindlebookspage;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static kindlebookspage.HomePageWebElement.*;

public class BuyAKindlePage extends WebAPI {
    // Find By Annotation: Second Approach using public
//    @FindBy(id=searchBoxLocator) public WebElement searchBox1;
@FindBy(xpath = kindleBooksLocator) public WebElement KindleBooks;
@FindBy(xpath = buyAKindleLocator) public WebElement buyAKindle;
@FindBy(xpath = amazonDevicesLocator) public WebElement amazonDevices;
    @FindBy(xpath = echoAndAlexaLocator) public WebElement echoAndAlexa;
    @FindBy(xpath = fireAndTabletsLocator) public WebElement fireAndTablets;
    @FindBy(xpath = amazonFireTVLocator) public WebElement amazonFire;
    @FindBy(xpath = kindleLocator) public WebElement kindle;
    @FindBy(css = homeSecurityLocator) public WebElement homeSecurity;
    @FindBy(css = day1EditionsLocator) public WebElement day1Editions;
    @FindBy(xpath = day1EditionsTextLocator) public WebElement day1EditionsText;
    @FindBy(xpath = deviceDealsLocator) public WebElement deviceDeals;
    @FindBy(xpath = deviceDealsTextLocator) public WebElement deviceDealsText;
    @FindBy(xpath = newReleaseLocator) public WebElement newRelease;
    @FindBy(xpath = accessoriesLocator) public WebElement accessories;
    @FindBy(xpath = certifiedRefurbishedLocator) public WebElement certifiedRefurbished;




    public void buyAKindle() {
        KindleBooks.click();
        buyAKindle.click();
    }
    public void certifiedRefurbished() {
        buyAKindle();
        certifiedRefurbished.click();

    }

    public void checkAccessories(){
        buyAKindle();
        accessories.click();
    }

    public void checkNewRelease(){
        buyAKindle();
       newRelease.click();
    }
    public void checkAmazonDevices(){
        buyAKindle();
        amazonDevices.click();
    }

    public void checkEchoAndAlexa(){
        buyAKindle();
        echoAndAlexa.click();
    }
    public void checkFireAndTablets(){
        KindleBooks.click();
        buyAKindle.click();
        fireAndTablets.click();
    }
    public void checkAmazonFire(){
        KindleBooks.click();
        buyAKindle.click();
        amazonFire.click();
    }

    public void checkKindle(){
        KindleBooks.click();
        buyAKindle.click();
       kindle.click();
    }
    public void checkHomeSecurity(){
        KindleBooks.click();
        buyAKindle.click();
        homeSecurity.click();
    }
    public void checkDay1Editions(){
        buyAKindle();
        day1Editions.click();
    }
    public void checkDeviceDeals(){
        buyAKindle();
        deviceDeals.click();
    }
}
