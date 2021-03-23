package homepagetest;

import common.WebAPI;
import homepage.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class HomePageTest extends WebAPI {

    HomePage homePage;

    @BeforeMethod
    public void getInit() {

        homePage = PageFactory.initElements(driver, HomePage.class);
    }


    @Test(enabled = false)
    public void testSearchBox() throws InterruptedException {
        homePage.searchBox();
        String expectedText = "\"Mask\"";
        String actualText = homePage.searchText.getText();
        Assert.assertEquals(actualText, expectedText, "product does not match");

    }

    //its working
    @Test(enabled = false)

    public void testclickAllSearchButton() throws InterruptedException {
        // checkSearchBox();
        homePage.clickAllSearchButton();
        String expectedText = "Trending";
        String actualText = homePage.TrendingText.getText();
        Assert.assertEquals(actualText, expectedText, "page does not match");


    }


    @Test(enabled = false)
    public void testClickOnFashionTab() throws InterruptedException {
        //calling this method with method name
        homePage.ClickOnFashionTab();
        String expectedText = "SweatyRocks Women's Short Sleeve Deep V Neck Self Tie Front Crop Top Blouse";
        String actualText = homePage.SwetyRockWomanShorttext.getText();
        Assert.assertEquals(actualText, expectedText, "page does not match");


    }

    @Test(enabled = false)
    public void testClickOnFashionSecondTab() throws InterruptedException {
        //calling this method with method name
        homePage.ClickOnFashionSecondTab();
        String expectedText = "Shop by category";
        String actualText = homePage.ShopByCategoryText.getText();
        Assert.assertEquals(actualText, expectedText, "page does not match");


    }
    //working
    @Test(enabled = false)
    public void testClickSingInEmail() throws InterruptedException {

        homePage.ClickSingInEmail();
        String expectedText = "Sign-In";
        String actualText = homePage.SingInButtonTextGet.getText();
        Assert.assertEquals(actualText, expectedText, "page does not match");
    }
    //working
    @Test(enabled = false)
    public void testSendKeyOnEmail() throws InterruptedException {
        // homePage.ClickSingInEmail();
        homePage.SendKeyOnEmail();
        String expectedText = "There was a problem";
        String actualText = homePage.problemMessagetext.getText();
        Assert.assertEquals(actualText, expectedText, "page does not match");
    }

    //create an AmazonAccount
    @Test(enabled = false)
    public void testcreateAccount() throws InterruptedException {
        homePage.createAccount();
        String expectedText = "Create account";
        String actualText = homePage.createAccounttext.getText();
        Assert.assertEquals(actualText, expectedText, "page does not match");

    }

    @Test(enabled = true)
    public void testprovideAccountInformation() throws InterruptedException {

        homePage.provideAccountInformation();
        String expectedText = "Create account";
        String actualText = homePage.createAccounttext.getText();
        Assert.assertEquals(actualText, expectedText, "page does not match");



    }



}
