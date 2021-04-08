package homepage;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static homepage.HomePageWebElement.*;

public class HomePage extends WebAPI {

    // This is Test Class

    //     Find by Annotation: First Approach
    @FindBy(how = How.ID, using = searchBoxLocator)
    public WebElement searchBox;
    @FindBy(how = How.ID, using = searchButtonLocator)
    public WebElement searchButton;
    @FindBy(how = How.XPATH, using = searchTextLocator)
    public WebElement searchText;


    // Action Method
    public void searchBox() throws InterruptedException {
        // Enter productName
        searchBox.sendKeys(productName);
        Thread.sleep(3000);
        // Click on Search Button
        searchButton.click();
    }

    public void checkToysAndGame() {
        clickOnLink("Toys & Games");
    }

    public void checkBirthdayGiftList() {
        clickOnLink("Toys & Games");
        clickOnLink("Birthday Gift List");
        clickOnLink("Shop by age");
    }

    public void checkCameraAndPhoto() {
        clickOnLink("Best Sellers");
        clickOnLink("Electronics");
        clickOnLink("Camera & Photo");

    }

    public void checkCarElectronics() {
        clickOnLink("Best Sellers");
        clickOnLink("Electronics");
        clickOnElement(carElectronicLocator);
    }

public void checkCellPhonesAndAccessories(){
    clickOnLink("Best Sellers");
    clickOnLink("Electronics");
    clickOnLink("Cell Phones & Accessories");

    }

    public void checkComputerAndAccessories() {
        clickOnLink("Best Sellers");
        clickOnLink("Electronics");
        clickByLinkText("Computers & Accessories");
    }

    public void checkGpsAndNavigation() {
        clickOnLink("Best Sellers");
        clickOnLink("Electronics");
        clickByXpath("//*[@id=\"zg_browseRoot\"]/ul/ul/li[6]/a");
    }

    public void checkHeadPhones() {
        clickOnLink("Best Sellers");
        clickByXpath(electronicsLocator);
        getTextByXpath(headPhonesLocator);
    }

    public void checkMensShirtLink() {
        clickOnLink("Fashion");
        getTextByCss(mensLocator);
    }

    public void checkBooksLink() {
        //getTextByCss(booksLocator);
        clickOnLink("Books");
        clickByXpath(textBooksLocator);
        //clickOnLink("Textbooks");
    }

    public void checkFashionLink() {
        clickByXpath(fashionLinkLocator);
        clickByXpath(kidsLinkLocator);
    }

    public void checkGiftCard() {
//        getTextByCss(giftCardsLocator);
        clickOnLink("Gift Cards");
        clickByXpath(birthdayGiftLocator);
        //clickOnLink("Birthdays");
    }

    public void checkToysAndGames1() {
        //getTextByCss(toysAndGamesLocator);
        clickOnLink("Toys & Games");
        clickByXpath(puzzlesLocator);
        //clickOnLink("Puzzles");
    }

    public void checkHobbiesLink() {
        clickOnLink("Toys & Games");
        getTextByXpath(hobbiesLocator);
    }

    public void checkStorage() {
        clickOnLink("Toys & Games");
        getTextByCss(storageLocator);

    }

    public void checkPartySupplies() {
        clickOnLink("Toys & Games");
        clickByXpath(partySuppliesLocator);
    }

    public void checkLearningAndEducation() {
        getTextByCss(toysAndGamesLocator);
        getTextByXpath(learningAndEducationLocator);
    }

    public void checkFindGift() {
        clickOnLink("Find a Gift");
        getTextByCss(mensSectionLocator);
    }

//    public void checkFashion() {
//        clickOnLink("Fashion");
//        //clickOnLink("Men");
//        mouseHoverByXpath("//*[@id=\"nav-subnav\"]/a[3]/span[1]");
//        clickByXpath(sweaterLinkLocator);
//
//    }

    public void checkAmazonHome() {
        clickOnLink("Amazon Home");
        getTextByXpath(discoverLinkLocator);
    }

    public void checkLanguage() {
        clickByXpath(languageLocator);
        clickByXpath(englishLanguageLocator);
    }

    public void checkOrganization() {
        clickOnLink("Amazon Home");
        getTextByXpath(organizationLocator);
    }

    public void checkHomeOffice() {
        clickOnLink("Amazon Home");
        clickOnElement(homeOfficeLocator);
        getTextByXpath(deskLocator);

    }

    public void checkNewReleases() {
        clickByLinkText("New Releases");
        clickOnLink("Baby");
    }

    public void checkComputers() {
        clickOnLink("Computers");
        //clickByXpath(computerLocator);
        clickOnElement(monitorLocator);
    }

    public void checkDesktopsLink() {
        getTextByXpath(computerLocator);
        //clickByXpath(desktopsLocator);
        clickOnLink("Desktops");
    }

    public void checkLaptops() {
        getTextByXpath(computerLocator);
        clickByXpath(laptopsLocator);


    }

    public void checkTablets() {
        getTextByXpath(computerLocator);
        //clickByXpath(tabletLocator);
        clickOnLink("Tablets");
        mouseHoverByXpath(allTabletLocator);

    }

public void checkMonitors(){
        getTextByXpath(computerLocator);
        //clickByXpath(monitorLocator);
        clickOnLink("Monitor");
}

    public void checkHomeOfficeLinks() {
        clickOnLink("Amazon Home");
        clickOnElement(homeOfficeLocator);
        getTextByXpath(deskLocator);

    }
    public void checkStorageLink() {
        clickOnLink("Toys & Games");
        getTextByCss(storageLocator);

    }














}





















//    @FindBy (how = How.LINK_TEXT,using= searchButtonLocator)public WebElement searchButton1;


//     //Find by Annotation: Second Approach
//    @FindBy(id=searchBoxLocator)public WebElement searchBox1;
//    @FindBy(id=searchBoxLocator)private WebElement searchBox2;
//
//    public WebElement getSearchBox2() {
//        return searchBox2;
//    }
//
//    public void setSearchBox2(WebElement searchBox2) {
//        this.searchBox2 = searchBox2;
//    }
//
//    public void demo(){
//        searchBox.sendKeys("Mask");
//        searchButton.click();
//
//
//    }



