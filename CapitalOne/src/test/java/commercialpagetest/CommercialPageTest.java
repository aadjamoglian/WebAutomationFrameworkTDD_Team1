package commercialpagetest;

import commercialpage.CommercialPage;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class CommercialPageTest extends WebAPI {

    CommercialPage commercialPage;

    @BeforeMethod
    public void getInit() {
        commercialPage = PageFactory.initElements(driver,CommercialPage.class);
    }

    @Test(enabled = false)
    public void commercialDisplayedTest(){
        commercialPage.commercialDisplayed();
        boolean commercialDisplay=commercialPage.commercial.isDisplayed();
        Assert.assertEquals(commercialDisplay,true);
    }
    @Test(enabled = false)
    public void commercialTest(){
        commercialPage.commercial();
        String expectedText ="Commercial & Industrial";
        String actualText =commercialPage.CommercialAndIndustrial.getText();
        Assert.assertEquals(expectedText,actualText,"test fail");
    }
    @Test(enabled = false)
    public void commercialRealEstateTest(){
        commercialPage.commercialRealEstate();
        String expectedTitle ="Commercial Real Estate | Capital One";
        String actualTitle =driver.getTitle();
        Assert.assertEquals(expectedTitle,actualTitle,"test fail");
    }
    @Test(enabled = false)
    public void financialInstitutionsGroupTest(){
        commercialPage.financialInstitutionsGroup();
        String expectedUrl ="https://www.capitalone.com/commercial/industry-expertise/financial-institutions/";
        String actualUrl =driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl,"test fail");
    }
    @Test
    public void commercialBakingDisplayedTest(){
        commercialPage.commercialBakingDisplayed();
        boolean commercialPageDisplay=commercialPage.commercialBaking.isDisplayed();
        Assert.assertEquals(commercialPageDisplay,true);
    }



}
