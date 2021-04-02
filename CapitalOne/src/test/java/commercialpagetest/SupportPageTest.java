package commercialpagetest;

import commercialpage.SupportPage;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SupportPageTest extends WebAPI {

    SupportPage helpPage;

    @BeforeMethod
    public void getInit() {
        helpPage = PageFactory.initElements(driver, SupportPage.class);
    }


    @Test(enabled = false)
    public void supportDisplayedTest(){
      helpPage.supportDisplayed();
      boolean supportDisplay=helpPage.support.isDisplayed();
        Assert.assertEquals(supportDisplay,true);
    }
    @Test(enabled = false)
    public void supportTest(){
        helpPage.support();
        String expectedTitle="Capital One Support Center";
        String actualTitle=driver.getTitle();
        Assert.assertEquals(expectedTitle,actualTitle,"test fail");
    }
    @Test(enabled = false)
    public void searchSupportCenterTest(){
        helpPage.searchSupportCenter();
        String expectedText="Search Results";
        String actualText=helpPage.text.getText();
        Assert.assertEquals(expectedText,actualText,"test fail");
    }
    @Test(enabled = false)
    public void creditCardProductsTest(){
        helpPage.creditCardProducts();
        String expectedUrl="https://www.capitalone.com/support-center/search?query=credit%20card";
        String actualUrl=driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl,"test fail");
    }
    @Test(enabled = true)
    public void bankingDepositProducts(){
        helpPage.bankingDepositProducts();
        String expectedUrl="https://www.capitalone.com/support-center/search?query=bank";
        String actualUrl=driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl,"test fail");
    }

}
