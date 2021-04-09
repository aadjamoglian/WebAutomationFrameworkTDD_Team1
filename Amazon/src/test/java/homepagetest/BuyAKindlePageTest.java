package homepagetest;

import common.WebAPI;
import kindlebookspage.BuyAKindlePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BuyAKindlePageTest extends WebAPI {



    BuyAKindlePage buyAKindlePage;

    @BeforeMethod
    public void getInit() {
        buyAKindlePage = PageFactory.initElements(driver, BuyAKindlePage.class);

    }
    @Test(enabled = true)
    public void amazonDevicesTest() {
        buyAKindlePage.checkAmazonDevices();
        String title = driver.getTitle();
        Assert.assertEquals(title, "Amazon Devices - Official Site - Kindle, Fire, Echo devices");
    }
    @Test(enabled = true)
    public void echoAndAlexaTest() {
        buyAKindlePage.checkEchoAndAlexa();
        String title = driver.getTitle();
        Assert.assertEquals(title, "Amazon.com: Echo Smart Speakers & Displays: Amazon Devices & Accessories: Smart Speakers, Smart Displays & More");
    }
    @Test(enabled = true)
    public void FireAndTabletsTest() {
        buyAKindlePage.checkFireAndTablets();
        String title = driver.getTitle();
        Assert.assertEquals(title, "Fire Tablets - Amazon Devices");
    }
    @Test(enabled = true)
    public void AmazonFireTest() {
        buyAKindlePage.checkAmazonFire();
        String title = driver.getTitle();
        Assert.assertEquals(title, "Fire TV Family - Amazon Devices - Amazon Official Site");
    }
    @Test(enabled = true)
    public void kindleTest() {
        buyAKindlePage.checkKindle();
        String title = driver.getTitle();
        Assert.assertEquals(title, "Amazon.com: Kindle E-readers: Amazon Devices & Accessories");
    }
    @Test(enabled = true)
    public void homeSecurityTest() {
        buyAKindlePage.checkHomeSecurity();
        String title = driver.getTitle();
        Assert.assertEquals(title, "Amazon.com: Smart Home Security & Lighting: Amazon Devices & Accessories: Security Cameras, Doorbells & Chimes & More");
    }
    @Test(enabled = true)
    public void  day1EditionsTest() {
        buyAKindlePage.checkDay1Editions();
        String expectedText = "Help make your favorite\n" + "device ideas real";
        String actualText= buyAKindlePage.day1EditionsText.getText();
        Assert.assertEquals(expectedText,actualText,"test fail");
    }
    @Test(enabled = true)
    public void DeviceDealsTest(){
        buyAKindlePage.checkDeviceDeals();
        String expectedText = "Amazon Device Deals";
        String actualText =  buyAKindlePage.deviceDealsText.getText();
        Assert.assertEquals(expectedText,actualText,"test fail");

    }
    @Test(enabled = true)
    public void BuyAKindleTest(){
        buyAKindlePage.checkNewRelease();
        String expectedText = "New Releases";
        String actualText =  buyAKindlePage.newRelease.getText();
        Assert.assertEquals(expectedText,actualText,"test fail");
    }
    @Test(enabled = true)
     public void accessoriesTest(){
         buyAKindlePage.checkAccessories();
         String titleAccessories = driver.getTitle();
         Assert.assertEquals(titleAccessories,"Amazon.com: Amazon Device Accessories: Amazon Devices & Accessories: Covers, Skins, Protection Plans, Sleeves & More");
}
    @Test(enabled = true)
    public void certifiedRefurbishedTest(){
        buyAKindlePage.certifiedRefurbished();
        String titleCertifiedRefurbished = driver.getTitle();
        Assert.assertEquals(titleCertifiedRefurbished,"Amazon.com: Certified Refurbished Amazon Devices: Amazon Devices &amp");
    }

}
