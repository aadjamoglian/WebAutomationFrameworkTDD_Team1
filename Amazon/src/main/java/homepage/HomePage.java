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
        getTextByCss(booksLocator);
        getTextByXpath(textBooksLocator);
    }

    public void checkFashionLink() {
        clickByXpath(fashionLinkLocator);
        clickByXpath(kidsLinkLocator);
    }

    public void checkGiftCard() {
        getTextByCss(giftCardsLocator);
        getTextByXpath(birthdayGiftLocator);
    }

    public void checkToysAndGames1() {
        getTextByCss(toysAndGamesLocator);
        getTextByXpath(puzzlesLocator);
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

    public void checkFashion() {
        clickOnLink("Fashion");
        clickOnLink("Men");
        getTextByXpath(sweaterLinkLocator);

    }

    public void checkAmazonHome() {
        clickOnLink("Amazon Home");
        getTextByXpath(discoverLinkLocator);
    }

    public void checkLanguage() {
        getTextByXpath(languageLocator);
        clickByXpath(englishLanguageLocator);
    }

    public void checkOrganization() {
        clickOnLink("Amazon Home");
        getTextByXpath(organizationLocator);
    }

    public void checkHomeOffice() {
        clickOnLink("Amazon Home");
        clickOnElement(homeOfficeLocator);
        getTextByCss(deskLocator);

    }

    public void checkNewReleases() {
        clickByLinkText("New Releases");
        clickOnLink("Baby");
    }

    public void checkComputers() {
        getTextByXpath(computerLocator);
        clickOnElement(monitorLocator);
    }

    public void checkDesktopsLink() {
        getTextByCss(computerLocator);
        getTextByXpath(desktopsLocator);
    }

    public void checkLaptops() {
        getTextByXpath(computerLocator);
        clickOnLink("Laptops");


    }

    public void checkTablets() {
        getTextByXpath(computerLocator);
        getTextByCss(tabletLocator);
        mouseHoverByXpath(allTabletLocator);

    }

public void checkMonitors(){
        getTextByXpath(computerLocator);
        clickOnLink("Monitors");
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



