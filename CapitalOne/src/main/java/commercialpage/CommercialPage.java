package commercialpage;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import static commercialpage.CommercialPageWebElements.*;


public class CommercialPage extends WebAPI {


    @FindBy(xpath =commercialLocator ) public WebElement commercial;
    @FindBy(xpath =industryExpertiseLocator ) public WebElement industryExpertise;
    @FindBy(linkText =commercialAndIndustrialLocator ) public WebElement commercialAndIndustrial;
    @FindBy(xpath =CommercialAndIndustrialLocator ) public WebElement CommercialAndIndustrial;
    @FindBy(linkText =commercialRealEstateLocator ) public WebElement commercialRealEstate;
    @FindBy(linkText =financialInstitutionsGroupLocator ) public WebElement financialInstitutionsGroup;
    @FindBy(linkText =capitalMarketsLocator ) public WebElement capitalMarkets;
    @FindBy(linkText =commercialBakingLocator ) public WebElement commercialBaking;



    public boolean commercialDisplayed(){
        return commercial.isDisplayed();
    }
  public void commercial(){
//mouse hover
      Actions actions = new Actions(driver);
      WebElement commercial = driver.findElement(By.xpath("//span[contains(text(),'Commercial')]"));
      actions.moveToElement(commercial).perform();
      //driver.findElement(By.linkText("Commercial & Industrial")).click();
      industryExpertise.click();
      driver.close();
  }
public void commercialRealEstate(){
    Actions actions = new Actions(driver);
    WebElement commercial = driver.findElement(By.xpath("//span[contains(text(),'Commercial')]"));
    actions.moveToElement(commercialRealEstate).perform();
    commercialRealEstate.click();
    driver.close();
}
    public void financialInstitutionsGroup(){
        Actions actions = new Actions(driver);
        WebElement commercial = driver.findElement(By.xpath("//span[contains(text(),'Commercial')]"));
        actions.moveToElement(financialInstitutionsGroup).perform();
        financialInstitutionsGroup.click();
        driver.close();
    }
    public void capitalMarkets(){
        Actions actions = new Actions(driver);
        WebElement commercial = driver.findElement(By.xpath("//span[contains(text(),'Commercial')]"));
        actions.moveToElement(capitalMarkets).perform();
        capitalMarkets.click();
        driver.close();
    }
    public boolean commercialBakingDisplayed(){
        capitalMarkets();
        return commercialBaking.isDisplayed();
    }
}
