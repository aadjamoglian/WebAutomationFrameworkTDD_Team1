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
    @FindBy(linkText =commercialRealEstateLocator ) public WebElement commercialRealEstate;
    @FindBy(linkText =financialInstitutionsGroupLocator ) public WebElement financialInstitutionsGroup;
    @FindBy(linkText =capitalMarketsLocator ) public WebElement capitalMarkets;
    @FindBy(linkText =commercialBakingLocator ) public WebElement commercialBaking;
    @FindBy(xpath =commercialLendingLocator ) public WebElement commercialLending;
    @FindBy(xpath =commercialLendingTextLocator ) public WebElement commercialLendingText;
    @FindBy(xpath =corporateCardLocator ) public WebElement corporateCard;
    @FindBy(xpath =depositoryServicesLocator ) public WebElement depositoryServices;
    @FindBy(xpath =depositoryServicesTextLocator ) public WebElement depositoryServicesText;





    public boolean commercialDisplayed(){
        return commercial.isDisplayed();
    }
  public void commercial(){
//mouse hover
      Actions actions = new Actions(driver);
      WebElement commercial = driver.findElement(By.xpath("//span[contains(text(),'Commercial')]"));
      actions.moveToElement(commercial).perform();
      //driver.findElement(By.linkText("Commercial & Industrial")).click();
  }
public void commercialRealEstate(){
    Actions actions = new Actions(driver);
    WebElement commercial = driver.findElement(By.xpath("//span[contains(text(),'Commercial')]"));
    actions.moveToElement(commercial).perform();
    commercialRealEstate.click();

}
    public void financialInstitutionsGroup(){
        Actions actions = new Actions(driver);
        WebElement commercial = driver.findElement(By.xpath("//span[contains(text(),'Commercial')]"));
        actions.moveToElement(commercial).perform();
        financialInstitutionsGroup.click();

    }
    public void capitalMarkets(){
        Actions actions = new Actions(driver);
        WebElement commercial = driver.findElement(By.xpath("//span[contains(text(),'Commercial')]"));
        actions.moveToElement(commercial).perform();
        capitalMarkets.click();

    }
    public boolean commercialBakingDisplayed(){
        capitalMarkets();
        return commercialBaking.isDisplayed();
    }
    public void commercialAndIndustrial(){
        Actions actions = new Actions(driver);
        WebElement commercial = driver.findElement(By.xpath("//span[contains(text(),'Commercial')]"));
        actions.moveToElement(commercial).perform();
        commercialAndIndustrial.click();
    }
    public void commercialLending(){
        Actions actions = new Actions(driver);
        WebElement commercial = driver.findElement(By.xpath("//span[contains(text(),'Commercial')]"));
        actions.moveToElement(commercial).perform();
        commercialLending.click();
    }
    public void corporateCard(){
        Actions actions = new Actions(driver);
        WebElement commercial = driver.findElement(By.xpath("//span[contains(text(),'Commercial')]"));
        actions.moveToElement(commercial).perform();
        corporateCard.click();
    }
    public void depositoryServices(){
        Actions actions = new Actions(driver);
        WebElement commercial = driver.findElement(By.xpath("//span[contains(text(),'Commercial')]"));
        actions.moveToElement(commercial).perform();
        depositoryServices.click();
    }
}
