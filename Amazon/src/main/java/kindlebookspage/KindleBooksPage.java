package kindlebookspage;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

import static kindlebookspage.HomePageWebElement.*;


public class KindleBooksPage extends WebAPI {
    //@FindBy (how = How.ID, using =searchBoxLocator ) public WebElement searchBox;

@FindBy (how = How.XPATH, using = kindleBooksLocator) public WebElement kindleBooks;
@FindBy (how = How.XPATH, using = buyAKindleLocator)  public WebElement buyAKindle;
@FindBy (how = How.XPATH, using = kindleEbooksLocator) public WebElement kindleEbooks;
@FindBy (how= How.CSS, using = kindleUnlimitedLocator) public WebElement kindleUnlimited;
@FindBy (how= How.CSS, using = primeReadingLocator) public WebElement primeReading;
@FindBy (how = How.XPATH,using = bestSellersAndMoreLocator) public WebElement bestSellersAndMore;
@FindBy (how=How.XPATH,using = kindleBookDealsLocator) public WebElement kindleBookDeals;
@FindBy(how=How.XPATH,using = kindleSinglesLocator) public WebElement kindleSingles;

// Find By Annotation: Second Approach using public
//    @FindBy(id=searchBoxLocator) public WebElement searchBox1;
    @FindBy(xpath = newsStandLocator) public WebElement newsStand;
    @FindBy(xpath = manageContentAndDevicesLocator) public WebElement manageContentAndDevices;
    @FindBy(xpath = advancedSearchLocator) public  WebElement advancedSearch;
    @FindBy(xpath = kindleBooksSearchBoxLocator) public  WebElement kindleBooksSearchBox;
    @FindBy(xpath = searchButtonLocator) public  WebElement searchButton;
    @FindBy(xpath = popularInKindleLocator) public  WebElement popularInKindle;

public void kindleBooksTitle(){

    kindleBooks.click();
}
public void buyAKindle(){
    kindleBooks.click();
    buyAKindle.click();
}
public void checkKindleEbooks(){
    kindleBooks.click();
    kindleEbooks.click();

}
    public void checkKindUnLimited(){
        kindleBooks.click();
        kindleUnlimited.click();

    }

    public void checkPrimeReading(){
        kindleBooks.click();
        primeReading.click();

    }

    public void checkBestSellersAndMore(){
        kindleBooks.click();
        bestSellersAndMore.click();

    }

    public void checkKindleBookDeals(){
        kindleBooks.click();
        kindleBookDeals.click();

    }
    public void checkKindleSingles(){
        kindleBooks.click();
        kindleSingles.click();

    }

    public void checkNewsStand() {
        kindleBooks.click();
        newsStand.click();
    }
    public void checkManageContentAndDevices() {
        kindleBooks.click();
        manageContentAndDevices.click();
    }
    public void checkAdvancedSearch() {
        kindleBooks.click();
       advancedSearch.click();
    }
    public void kindleBooksSearchBox(){
        kindleBooks.click();
        Select select =new Select(kindleBooksSearchBox);
        select.selectByIndex(2);
        searchButton.click();

    }
    public void kindleBooksSearchBox1(){
        kindleBooks.click();
        Select select =new Select(kindleBooksSearchBox);
        select.selectByIndex(3);
        searchButton.click();
    }
    public void checkPopularInKindle(){
        kindleBooks.click();
        List<WebElement> lis =driver.findElements(By.xpath("//h3[contains(text(),'Popular in Kindle')]/..//ul//li"));
for(WebElement li :lis){
    System.out.println(li.getText());
    if(li.getText().equalsIgnoreCase("Editors' Picks")){
        li.click();
    }
}

    }

}
