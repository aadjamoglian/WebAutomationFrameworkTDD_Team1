package homepage;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.Ignore;
import utilities.DataReader;
import utilities.ReadExcel;

import java.io.IOException;
import java.util.List;

import static homepage.HomePageWebElement.*;

public class HomePage extends WebAPI {
    // Action Method class

    // Find By Annotation: First Approach
    @FindBy(how = How.ID, using = searchBoxLocator)
    public WebElement searchBox;
    @FindBy(how = How.ID, using = searchButtonLocator)
    public WebElement searchButton;
    @FindBy(how = How.XPATH, using = searchTextLocator)
    public WebElement searchText;
    @FindBy(how = How.XPATH, using = checkLanguages)
    public WebElement languages;
    @FindBy(how = How.XPATH, using = languageSelector)
    public WebElement selector;
    @FindBy(how = How.XPATH, using = countryRegion)
    public WebElement country;
    @FindBy(how = How.XPATH, using = bestSeller)
    public WebElement bestseller;
    @FindBy(how = How.XPATH, using = automotiveLink)
    public WebElement automotive;
    @FindBy(how = How.XPATH, using = menuBarLocator)
    public WebElement menuBar;
    @FindBy(how = How.XPATH, using = radioButtonLocator)
    public WebElement radioButton;
    @FindBy(how = How.CSS, using = newssatndLocator)
    public WebElement newsstand;
    @FindBy(how = How.XPATH, using = digitalNewsPaperLocator)
    public WebElement digitalNewspaper;
    @FindBy(how = How.CSS, using = newssatndLocator)
    public WebElement newRelease;
    @FindBy(how = How.XPATH, using = digitalMegazineLocator)
    public WebElement digitalMegazine;
    @FindBy(how = How.CSS, using = makeupPaletteLocator)
    public WebElement makeupPalleteLink;
    @FindBy(how = How.XPATH, using = giftSetLink)
    public WebElement giftSet;
    @FindBy(how = How.XPATH, using = makeupLocator)
    public WebElement makeupSetLink;


    public void searchFromExcelFile() throws IOException {
        DataReader reader = new DataReader();
        String[][] dataReader = reader.fileReader1("datatest/ReadData.xlsx", 0);
        String getData = dataReader[1][0];
        searchBox.sendKeys(getData);
    }

    public void searchBox() throws InterruptedException {
        searchBox.sendKeys(productName);
        Thread.sleep(3000);
        searchButton.click();
    }

    public void searcBox1() {
        typeOnElement(searchBoxLocator, "Hand Sanitzer");
        clickOnElement(searchBoxLocator);
    }

    public void checkLanguagesSpanish() throws InterruptedException {
        mouseHoverByXpath(checkLanguages);
        sleepFor(2);
    }

    public void refreshPage() {
        //driver.get(amazonurl);
        driver.navigate().refresh();
    }

    public void checkBestSellers() {
        clickOnElement(bestSeller);

    }

    public void checkCameraAndPhotoLink() {
        checkBestSellers();
        clickOnLink("Camera & Photo");
        getTextByXpath(camcordersLocator);
    }

    public void checkDSLRCameraLink() {
        checkBestSellers();
        clickOnLink("Camera & Photo");
        clickOnLink("DSLR Cameras");
    }

    public void checkAppliancesLink() {
        checkBestSellers();
        getTextByCss(appliancesLocator);
    }

    public void checkCooktopsLink() throws InterruptedException {
        checkAppliancesLink();
        sleepFor(2);
        clickByXpath1(cooktopLocators);
    }

    public void checkBeautyAndPersonalCare() {
        checkBestSellers();
        clickOnLink("Beauty & Personal Care");
    }

    public void checkMakeupLink() {
        checkBeautyAndPersonalCare();
        getTextByXpath(makeupLocator);
    }

    public void checkMakeupPalletesLink() {
        checkMakeupLink();
        makeupPalleteLink.click();
    }

    public void checkGiftSetLink() {
        checkBeautyAndPersonalCare();
        giftSet.click();
    }

    public void checkMakeupSetLink() {
        checkBeautyAndPersonalCare();
        getTextByXpath(makeupLocator);
        makeupSetLink.click();
    }

    public void checkSkinCareLink() throws InterruptedException {
        checkBeautyAndPersonalCare();
        clickOnLink("Skin Care");
        sleepFor(2);
    }

    public void checkFaceMakeupLink() {
        checkBeautyAndPersonalCare();
        getTextByXpath(makeupLocator);
        clickOnLink("Face");
    }

    public void checkFragranceLink() {
        checkBeautyAndPersonalCare();
        clickOnLink("Fragrance");
        clickOnLink("Women's");
    }

    public void checkFreezersLink() {
        checkBestSellers();
        getTextByCss(appliancesLocator);
        getTextByXpath(freezersLocator);
        clickOnElement(chestFreezerLocator);
    }

    public void checkRefrigeratorsLink() {
        checkBestSellers();
        getTextByCss(appliancesLocator);
        getTextByXpath(refrigeratorLocator);
    }

    public void checkAutomotiveLink() {
        clickOnElement(bestSeller);
        clickOnElement(automotiveLink);
    }

    public void checkCurrentUrl() {
        getCurrentUrl();
    }

    public void checkyourGarageLink() {
        checkAutomotiveLink();
        clickByXpath(garageLocator);
    }

    public void checkKindleBooks() {
        clickOnLink("Kindle Books");
    }

    public void checkRadioButton() {
        clickOnLink("Kindle Books");
        clickByXpath1(radioButtonLocator);
    }

    public void checkkindleEBooks() {
        checkKindleBooks();
        clickByLinkText("Kindle Book Deals");
    }

    public void checkKindleDailyDeals() {
        checkKindleBooks();
        clickByLinkText("Kindle Book Deals");
        clickByLinkText("Kindle Daily Deals");
    }

    public void checkKindleMonthlyDeals() {
        checkkindleEBooks();
        clickByXpath1(montlyDealsLocator);
    }

    public void checkKindleExclusiveDeals() {
        checkkindleEBooks();
        clickByLinkText("Kindle Book Deals");
        clickByCss(kindleExclusiveDealsLocator);
    }

    public void checkKindleBooksUnder$2() {
        checkkindleEBooks();
        clickByCss(kindleExclusiveDealsLocator);
        clickByXpath1($2orLessLocator);
    }

    public void checkAutomotivePartsLink() throws InterruptedException {
        checkAutomotiveLink();
        sleepFor(3);
        mouseHoverByXpath(automotivePartsLocator);
        //clickOnLink("Body & Trim Repair");
    }

    public void checkNewsstand() {
        checkKindleBooks();
        newsstand.click();
        digitalNewspaper.click();
    }

    public void checkNewYorkTimes() {
        checkKindleBooks();
        newsstand.click();
        digitalNewspaper.click();
        clickOnLink(newYorkTimesLocator);
    }

    public void checkUSATodayLink() {
        checkNewsstand();
        clickOnLink(USATodayLocator);
    }

    public void checkDigitalMegazines() {
        checkKindleBooks();
        newsstand.click();
//        digitalMegazine.click();
    }

    public void checkKindleMegazines() {
        checkDigitalMegazines();
        clickOnLink(magazineHomepageLocator);
    }
    }
