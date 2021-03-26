package homepagetest;

import common.WebAPI;
import homepage.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.util.concurrent.ScheduledExecutorService;

public class HomePageTest extends WebAPI {
    // Test Class
    HomePage homePage;
//    Registration registration;
    @BeforeMethod
    public void getInit() {
        homePage = PageFactory.initElements(driver, HomePage.class);
//        registration = PageFactory.initElements(driver, Registration.class);
    }


    @Test(enabled = true)
    public void testSearchBox1() throws InterruptedException {
        getInit();
        // Call Action method by reference variable
        homePage.searchBox();
        String expectedText = "\"Mask\"";
        String actualText=homePage.searchText.getText();
        Assert.assertEquals(actualText,expectedText,"Product does not match");
    }



    @Ignore
    @Test
    public void testSearchBox() throws InterruptedException {
//        getInit();
//        call action method by reference variable
        homePage.searchBox();

    }



    @Test
    public void testLanguages() throws InterruptedException {
        homePage.checkLanguagesSpanish();
        String expectedText="Amazon.com: eBooks Kindle: Tienda Kindle: Nonfiction, Literature & Fiction, Foreign Languages, Business & Money y más";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not clickable");
    }

    @Test
    public void testRefreshPage(){
        homePage.refreshPage();
        String expectedText="Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not clickable");
    }

    @Test
    public void testBestSellers(){
        homePage.checkBestSellers();
        String expectedText="Gift Cards";
        String actualText=driver.findElement(By.linkText("Gift Cards")).getText();
        Assert.assertEquals(actualText,expectedText,"Link is not clickable");
    }

    @Test
    public void testCameraAndPhoto(){
        homePage.checkCameraAndPhotoLink();
        String expectedText="Amazon Best Sellers: Best Camcorders";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not clickable");
    }

    @Test
    public void testDSLRCamera(){
        homePage.checkDSLRCameraLink();
        String expectedText="Amazon Best Sellers: Best DSLR Cameras";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not clickable");
    }

    @Test
    public void testAppliancesLink(){
        homePage.checkAppliancesLink();
        String expectedText="Amazon Best Sellers: Best Appliances";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not clickable");
    }
//    @Test
//    public void testDishwashersLink(){
//        homepage.checkDishwashersLink();
//        String expectedText="Amazon Best Sellers: Best Portable Dishwashers";
//        String actualText=driver.getTitle();
    //Assert.assertEquals(actualText,expectedText,"Link is not clickable");
//    }

    @Test
    public void testCooktopsLink() throws InterruptedException {
        homePage.checkCooktopsLink();
        String expectedText="Amazon Best Sellers: Best Cooktops";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not clickable");
    }

//    @Test
//    public void testFreezersLink(){
//        homepage.checkFreezersLink();
//        String expectedText="Amazon Best Sellers: Best Chest Freezers";
//        String actualText=driver.getTitle();
    //Assert.assertEquals(actualText,expectedText,"Link is not clickable");
//    }
//    @Test
//    public void testRefrigeratorsLink(){
//        homepage.checkFreezersLink();
//        String expectedText="Amazon Best Sellers: Best Refrigerators";
//        String actualText=driver.getTitle();
    //Assert.assertEquals(actualText,expectedText,"Link is not clickable");
//    }


    @Test
    public void testAutomotiveLink(){
        homePage.checkAutomotiveLink();
        String expectedText="Car care";
        String actualText=driver.findElement(By.xpath("//*[@id=\"zg_browseRoot\"]/ul/ul/li[1]/a")).getText();
        Assert.assertEquals(actualText,expectedText,"Link is not clickable");
    }

    @Test
    public void testYourGarageLink(){
        homePage.checkyourGarageLink();
        String expectedText="Your Garage: Automotive: Amazon.com";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not clickable");
    }

    @Test
    public void testKindleBooks(){
        homePage.checkKindleBooks();
        String expectedText="Kindle Singles";
        String actualText=driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[8]")).getText();
        Assert.assertEquals(actualText,expectedText,"Link is not clickable");
    }

    @Test
    public void testRadioButton(){
        homePage.checkRadioButton();
        String expectedText="Amazon.com";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not clickable");
    }

    @Test
    public void testKindleEBooks(){
        homePage.checkkindleEBooks();
        String expectedText="Amazon.com: Deals in Kindle Books";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not clickable");
    }

    @Test
    public void testKindleDailyDeals(){
        homePage.checkKindleDailyDeals();
        String expectedText="Amazon.com: Today's Deals";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not clickable");
    }

    @Test
    public void testKindleMonthlyDeals(){
        homePage.checkKindleMonthlyDeals();
        String expectedText="Amazon.com: Kindle Book Deals for $3.99 or Less";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not clickable");
    }

    @Test
    public void testKindleExclusiveDeals(){
        homePage.checkKindleExclusiveDeals();
        String expectedText="Amazon.com: Kindle Book Deals for $3.99 or Less";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not clickable");
    }

    @Test
    public void testKindleBooksUnder$2Deals(){
        homePage.checkKindleBooksUnder$2();
        String expectedText="Amazon.com: 50 Kindle books for $2 or less";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not clickable");
    }

    @Test
    public void testBeautyAndPersonalCare(){
        homePage.checkBeautyAndPersonalCare();
        String expectedText="Skin Care";
        String actualText=driver.findElement(By.linkText("Skin Care")).getText();
        Assert.assertEquals(actualText,expectedText,"Link is not clickable");
    }

    @Test
    public void testMakeupLink(){
        homePage.checkMakeupLink();
        String expectedText="Amazon Best Sellers: Best Eye Makeup";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not clickable");

    }

    @Test
    public void testGiftSetLink(){
        homePage.checkGiftSetLink();
        String expectedText="Amazon Best Sellers: Best Beauty Gift Sets";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not clickable");
    }

    @Test
    public void textMakeupSetsLink(){
        homePage.checkMakeupSetLink();
        String expectedText="Amazon Best Sellers: Best Makeup Sets";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not clickable");
    }
    @Test
    public void textSkinCareLink() throws InterruptedException {
        homePage.checkSkinCareLink();
        String expectedText="Amazon Best Sellers: Best Body Cleansers";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not clickable");
    }
//    @Test
//    public void testMakeupPaletteLink(){
//        homepage.checkMakeupPalletesLink();
//        String expectedText="Amazon Best Sellers: Best Makeup Palettes";
//        String actualText=driver.getTitle();
//
//    }

    @Test
    public void testFaceMakeupLink(){
        homePage.checkFaceMakeupLink();
        String expectedText="Amazon Best Sellers: Best Face Makeup";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not clickable");
    }

    @Test
    public void testFragranceLink(){
        homePage.checkFragranceLink();
        String expectedText="Amazon Best Sellers: Best Women's Fragrances";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not clickable");
    }

//    @Test
//    public void testDropDown(){
//        homepage.allDeptDropDown();
//        String expectedText="Amazon.com :";
//        String actualText=driver.getTitle();
    //Assert.assertEquals(actualText,expectedText,"Link is not clickable");
//    }
//    @Test
//    public void testMenuBar() throws InterruptedException {
//        homepage.checkMenuBar();
//        String expectedText="Toys & Games";
//        String actualText=driver.findElement(By.linkText("Toys & Games")).getText();
//         Assert.assertEquals(actualText,expectedText,"Link is not clickable");
//    }

    @Test
    public void testAutomotivePartsLink() throws InterruptedException {
        homePage.checkAutomotivePartsLink();
        String expectedText="Amazon.com : Automotive Body Parts & Trim";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not clickable");

    }

    @Test
    public void testNewsstand(){
        homePage.checkNewsstand();
        String expectedText="The New York Times";
        String actualText=driver.findElement(By.linkText("The New York Times")).getText();
        Assert.assertEquals(actualText,expectedText,"Link is not clickable");
    }

    @Test
    public void testNewYorkTimes(){
        homePage.checkNewYorkTimes();
        String expectedText="Amazon.com: The New York Times - Daily Edition for Kindle: Kindle Store";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not clickable");
    }

    @Test
    public void testUSAToday(){
        homePage.checkUSATodayLink();
        String expectedText="Amazon.com: USA TODAY, Paid No-Ads Daily Edition: Kindle Store";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not clickable");
    }

    @Test
    public void testDigitalMegazines(){
        homePage.checkDigitalMegazines();
        String expectedText="Amazon.com: Top Kindle Magazine & Newspaper Deals: Kindle Store";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not clickable");
    }

    @Test
    public void testKindleMegazines(){
        homePage.checkKindleMegazines();
        String expectedText="Amazon.com: Kindle Newsstand: Kindle Store: Lifestyle & Culture, Men's Interests, Entertainment & Pop Culture & More";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not clickable");
    }





}
