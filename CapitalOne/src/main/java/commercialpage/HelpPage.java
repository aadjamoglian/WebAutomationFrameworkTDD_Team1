package commercialpage;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static commercialpage.CommercialPageWebElements.commercialBakingLocator;
import static commercialpage.HelpPageWebElements.*;


public class HelpPage  extends WebAPI {

    @FindBy(css =supportLocator ) public WebElement support;
    @FindBy(css =searchSupportCenterLocator ) public WebElement searchSupportCenter;
    @FindBy(css =searchSupportCenterButtonLocator ) public WebElement searchSupportCenterButton;
    @FindBy(xpath =textLocator ) public WebElement text;
    @FindBy(xpath =creditCardProductsLocator ) public WebElement creditCardProducts;
    @FindBy(linkText =bankingDepositProductsLocator ) public WebElement bankingDepositProducts;


    public boolean supportDisplayed(){
        return support.isDisplayed();
    }

    public void support(){
        support.click();
    }

    public void searchSupportCenter(){
        support();
        searchSupportCenter.sendKeys("Activate My credit Card");
        searchSupportCenterButton.click();
    }

    public void creditCardProducts(){
        support.click();
        creditCardProducts.click();
    }

    public void bankingDepositProducts(){
        support.click();
        bankingDepositProducts.click();
    }

}
