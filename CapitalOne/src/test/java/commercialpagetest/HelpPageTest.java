package commercialpagetest;

import commercialpage.CommercialPage;
import commercialpage.HelpPage;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HelpPageTest extends WebAPI {

    HelpPage helpPage;

    @BeforeMethod
    public void getInit() {
        helpPage = PageFactory.initElements(driver, HelpPage.class);
    }
    @Test
    public void supportDisplayedTest(){
      helpPage.supportDisplayed();
      boolean supportDisplay=helpPage.support.isDisplayed();
        Assert.assertEquals(supportDisplay,true);
    }
    @Test
    public void supportTest(){
        helpPage.support();
        String expectedTitle="Capital One Support Center";
        String actualTitle=driver.getTitle();
        Assert.assertEquals(expectedTitle,actualTitle,"test fail");
    }
    @Test
    public void searchSupportCenterTest(){
        helpPage.searchSupportCenter();
        String expectedText="You searched for \"Activate My credit Card\" 100 Results Found";
        String actualText=helpPage.text.getText();
        Assert.assertEquals(expectedText,actualText,"test fail");
    }
    public void creditCardProductsTest(){
        helpPage.creditCardProducts();
        String expectedUrl="https://www.capitalone.com/support-center/search?query=credit%20card";
        String actualUrl=driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl,"test fail");
    }
    public void bankingDepositProducts(){
        helpPage.bankingDepositProducts();
        String expectedUrl="https://www.capitalone.com/support-center/search?query=bank       ";
        String actualUrl=driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl,"test fail");
    }

}
