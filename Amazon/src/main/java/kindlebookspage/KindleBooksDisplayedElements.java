package kindlebookspage;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static kindlebookspage.HomePageWebElement.*;


public class KindleBooksDisplayedElements extends WebAPI {

    @FindBy(xpath = kindleBooksLocator) public WebElement kindleBooks;
    public boolean kindleBooksDisplayed(){
         kindleBooks.click();
         return kindleBooks.isDisplayed();
    }
    @FindBy(xpath = buyAKindleLocator) public WebElement buyAKindle;
    public boolean buyAKindlesDisplayed(){
        kindleBooks.click();
        buyAKindle.click();
        return buyAKindle.isDisplayed();
    }
    @FindBy(xpath = kindleEbooksLocator) public WebElement kindleEbooks;
    public boolean kindleEbooksDisplayed(){
        kindleBooks.click();
        kindleEbooks.click();
        return kindleEbooks.isDisplayed();
    }
    @FindBy(css = kindleUnlimitedLocator) public WebElement kindleUnlimited;
    public boolean kindleUnlimitedDisplayed(){
        kindleBooks.click();
        kindleUnlimited.click();
        return kindleUnlimited.isDisplayed();
    }
    @FindBy(css = primeReadingLocator) public WebElement primeReading;
    public boolean primeReadingDisplayed(){
        kindleBooks.click();
        primeReading.click();
        return primeReading.isDisplayed();
    }
    @FindBy(xpath = bestSellersAndMoreLocator) public WebElement bestSellersAndMore;
    public boolean bestSellersAndMoreDisplayed(){
        kindleBooks.click();
        bestSellersAndMore.click();
        return bestSellersAndMore.isDisplayed();
    }
    @FindBy(xpath = kindleBookDealsLocator) public WebElement kindleBookDeals;
    public boolean kindleBookDealsDisplayed(){
        kindleBooks.click();
        kindleBookDeals.click();
        return kindleBookDeals.isDisplayed();
    }
    @FindBy(xpath = kindleSinglesLocator) public WebElement kindleSingles;
    public boolean kindleSinglesDisplayed(){
        kindleBooks.click();
        kindleSingles.click();
        return kindleSingles.isDisplayed();
    }
    @FindBy(xpath = newsStandLocator) public WebElement newsStand;
    public boolean newsStandDisplayed(){
        kindleBooks.click();
        newsStand.click();
        return newsStand.isDisplayed();
    }
    @FindBy(xpath = manageContentAndDevicesLocator) public WebElement manageContentAndDevices;
    public boolean manageContentAndDevicesDisplayed(){
        kindleBooks.click();
        manageContentAndDevices.click();
        return manageContentAndDevices.isDisplayed();
    }
    @FindBy(xpath = advancedSearchLocator) public WebElement advancedSearch;
    public boolean advancedSearchDisplayed(){
        kindleBooks.click();
        advancedSearch.click();
        return advancedSearch.isDisplayed();
    }

    @FindBy(xpath = searchButtonLocator) public WebElement searchButton;
    public boolean searchButtonDisplayed(){
        kindleBooks.click();
        advancedSearch.click();
        searchButton.click();
        return searchButton.isDisplayed();
    }

}
