package homepagetest;

import common.WebAPI;
import homepage.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import java.io.IOException;
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

    @Test
    public void testExcelRead() throws IOException {
        homePage.searchFromExcelFile();
        String expectedText = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
        //String actualText=homePage.searchText.getText();
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Product does not match");
    }

    @Test
    public void testSearchBox() throws InterruptedException {
//        getInit();
//        call action method by reference variable
        homePage.searchBox();
    }

    @Test
    public void testLanguages() throws InterruptedException {
        homePage.checkLanguagesSpanish();
        String expectedText="Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
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
        String expectedText="Amazon Best Sellers: Best Camera";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not clickable");
    }

    @Test
    public void testDSLRCamera(){
        homePage.checkDSLRCameraLink();
        String expectedText="DSLR Cameras - Amazon.com";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not clickable");
    }

    @Test
    public void testAppliancesLink(){
        homePage.checkAppliancesLink();
        String expectedText="Amazon.com Best Sellers: The most popular items on Amazon";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not clickable");
    }

    @Test
    public void testAutomotiveLink(){
        homePage.checkAutomotiveLink();
        String expectedText="Car Care";
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
        String expectedText="Kindle Books";
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
        String expectedText="Amazon.com: Kindle Exclusive book deals";
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
        String expectedText="Amazon Best Sellers: Best Beauty & Personal Care";
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
        String expectedText="Amazon Best Sellers: Best Makeup";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not clickable");
    }

    @Test
    public void textSkinCareLink() throws InterruptedException {
        homePage.checkSkinCareLink();
        String expectedText="Skin Care Products - Amazon.com";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not clickable");
    }

    @Test
    public void testFaceMakeupLink(){
        homePage.checkFaceMakeupLink();
        String expectedText="Amazon.com: Neutrogena Day & Night Wipes with Makeup Remover Face Cleansing Towelettes & Night Calming Facial Cloths, Alcohol-Free Wipes to Remove Dirt, Oil & Waterproof Mascara, 3 Packs of 25 ct, 75 ct: Beauty";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not clickable");
    }

    @Test
    public void testFragranceLink(){
        homePage.checkFragranceLink();
        String expectedText="Amazon.com : Women's Fragrances";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not clickable");
    }

    @Test
    public void testAutomotivePartsLink() throws InterruptedException {
        homePage.checkAutomotivePartsLink();
        String expectedText="Amazon Best Sellers: Best Automotive";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not clickable");

    }

    @Test
    public void testDigitalMegazines(){
        homePage.checkDigitalMegazines();
        String expectedText="Kindle Newsstand - Amazon.com";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not clickable");
    }

    @Test
    public void textSkinCareLink1() throws InterruptedException {
        homePage.checkSkinCareLink();
        String expectedText="Skin Care Products - Amazon.com";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not clickable");
    }

    @Test
    public void testKindleBooksUnder$2Deal(){
        homePage.checkKindleBooksUnder$2();
        String expectedText="Amazon.com: 50 Kindle books for $2 or less";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not clickable");
    }

    @Test
    public void testDSLRCameras(){
        homePage.checkDSLRCameraLink();
        String expectedText="DSLR Cameras - Amazon.com";
        String actualText=driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not clickable");
    }

    @Test
    public void testAutomotiveLinks(){
        homePage.checkAutomotiveLink();
        String expectedText="Car Care";
        String actualText=driver.findElement(By.xpath("//*[@id=\"zg_browseRoot\"]/ul/ul/li[1]/a")).getText();
        Assert.assertEquals(actualText,expectedText,"Link is not clickable");
    }
    }
