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

    @Test(enabled = true)
    public void commercialDisplayedTest(){
        commercialPage.commercialDisplayed();
        boolean commercialDisplay=commercialPage.commercial.isDisplayed();
        Assert.assertEquals(commercialDisplay,true);
    }
    @Test(enabled = true)
    public void commercialTest() throws InterruptedException {
        commercialPage.commercial();
        Thread.sleep(2000);
        String expectedText ="INDUSTRY EXPERTISE";
        String actualText =commercialPage.industryExpertise.getText();
        Assert.assertEquals(expectedText,actualText,"test fail");
    }
    @Test(enabled = true)
    public void commercialRealEstateTest(){
        commercialPage.commercialRealEstate();
        String expectedTitle ="Commercial Real Estate | Capital One";
        String actualTitle =driver.getTitle();
        Assert.assertEquals(expectedTitle,actualTitle,"test fail");
    }
    @Test(enabled = true)
    public void financialInstitutionsGroupTest(){
        commercialPage.financialInstitutionsGroup();
        String expectedUrl ="https://www.capitalone.com/commercial/industry-expertise/financial-institutions/";
        String actualUrl =driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl,"test fail");
    }
    @Test(enabled = true)
    public void commercialBakingDisplayedTest() throws InterruptedException {
        commercialPage.commercialBakingDisplayed();
        boolean commercialPageDisplay=commercialPage.commercialBaking.isDisplayed();
        Assert.assertEquals(commercialPageDisplay,true);
    }
    @Test(enabled = true)
    public void commercialAndIndustrialTest(){
        commercialPage.commercialAndIndustrial();
        String expectedUrl ="https://www.capitalone.com/commercial/industry-expertise/industrial-manufacturing/";
        String actualUrl =driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl,"test fail");
    }
    @Test(enabled = true)
    public void commercialLendingTest()  {
        commercialPage.commercialLending();
        String expectedText ="Commercial Lending";
        String actualText =commercialPage.commercialLendingText.getText();
        Assert.assertEquals(expectedText,actualText,"test fail");
    }
    @Test(enabled = true)
    public void corporateCardTest()  {
        commercialPage.corporateCard();
        String expectedText ="Corporate Card";
        String actualText =commercialPage.corporateCard.getText();
        Assert.assertEquals(expectedText,actualText,"test fail");
    }
    @Test(enabled = true)
    public void depositoryServicesTest()  {
        commercialPage.depositoryServices();
        String expectedText ="Depository Services";
        String actualText =commercialPage.depositoryServicesText.getText();
        Assert.assertEquals(expectedText,actualText,"test fail");
    }

}
