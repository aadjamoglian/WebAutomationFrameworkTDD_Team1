package Cigna1HomePage;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.Test;

import static Cigna1HomePage.CignaWebElement.*;

public class CignaPage extends WebAPI {
    CignaPage cignaPage;
//First testcase
    @FindBy(how = How.XPATH, using = individualAndFamilies) public WebElement individualAndFamily;
    @FindBy(how = How.XPATH, using = understandingInsurance) public WebElement understandingInsuranceBox;
    @FindBy(how = How.XPATH, using = PopularInsuranceArticles) public WebElement PopularInsuranceArticlesText;

    //2nd test case
    @FindBy(how = How.XPATH, using = commonInsurancePlaneType) public WebElement commonInsurancePlaneTypebox;
    @FindBy(how = How.XPATH, using = GetHelpChoosingBetween) public WebElement GetHelpChoosingBetweenAndHmo;

    //3rd case
    @FindBy(how = How.CSS, using = AnHmoIsRightForYou) public WebElement AnHmoIsRightForYoulink;
    @FindBy(how = How.XPATH, using = WhatIsdifferentBetweenHmoPpo) public WebElement WhatIsdifferentBetweenHmoAndPpo;

    //4th case
    @FindBy(how = How.XPATH, using = BackToUnderstandingInsuranceLink) public WebElement BackToUnderstandingInsuranceLinkText;
    @FindBy(how = How.XPATH, using = UnderstandingInsurance) public WebElement UnderstandingInsuranceText;

    //5th
    @FindBy(how = How.XPATH, using = exploreGlocery) public WebElement exploreGloceryButton;
    @FindBy(how = How.XPATH, using = SearchTermBBy) public WebElement SearchTermBByText;

    //6th
    @FindBy(how = How.XPATH, using = Category) public WebElement CategoryType;
    //@FindBy(how = How.XPATH, using = claimAndPayment) public WebElement claimAndPaymentRadioButton;
    @FindBy(how = How.XPATH, using = pharmacy) public WebElement pharmacyButton;
    @FindBy(how = How.XPATH, using = BrandDrugName) public WebElement BrandDrugNameText;

    //log in to my Cigna

    @FindBy(how = How.XPATH, using = UserName) public WebElement UserNameSend;
    @FindBy(how = How.XPATH, using = Password) public WebElement PasswordSend;
    @FindBy(how = How.ID, using = LogIn) public WebElement LogInButton;
    @FindBy(how = How.ID, using = somethingWentWrong) public WebElement somethingWentWrongMessage;

    //Register
    @FindBy(how = How.XPATH, using = LogInToMyCigna) public WebElement LogInToMyCignaButton;
    @FindBy(how = How.ID, using = register) public WebElement registerCigna;
    @FindBy(how = How.ID, using = register) public WebElement ActiveMyCignaAccount;


    //MouseHoover Over
    public void individualAndFamilyCase() throws InterruptedException {
        Actions action = new Actions(driver);
        action.moveToElement(individualAndFamily).build().perform();
        //Thread.sleep(2000);
        understandingInsuranceBox.click();
        Thread.sleep(2000);
        PopularInsuranceArticlesText.getText();

    }
    public void commonInsurancePlaneTypeCase() throws InterruptedException {
        commonInsurancePlaneTypebox.click();
        Thread.sleep(2000);
        GetHelpChoosingBetweenAndHmo.getText();

    }

    public void anHmoIsRightForYou() throws InterruptedException {

        AnHmoIsRightForYoulink.click();
        Thread.sleep(2000);
        WhatIsdifferentBetweenHmoAndPpo.getText();

    }

    public void backToUnderstandingInsurance() throws InterruptedException {
        BackToUnderstandingInsuranceLinkText.click();
        Thread.sleep(2000);
        UnderstandingInsuranceText.getText();

    }

    public void exploreGlocery() throws InterruptedException {
        exploreGloceryButton.click();
        Thread.sleep(2000);
        SearchTermBByText.getText();

    }

    public void categoryclaimAndPaymentpharmacy() throws InterruptedException {
        exploreGlocery();
        CategoryType.click();
        Thread.sleep(2000);
        //claimAndPaymentRadioButton.click();
        //Thread.sleep(2000);
        pharmacyButton.click();
        Thread.sleep(2000);
        BrandDrugNameText.getText();

    }

    public void CutomerLoginCigna() throws InterruptedException {
        Thread.sleep(2000);
       // LogInToMyCignaButton.click();
        Thread.sleep(2000);
        driver.switchTo().frame(UserNameSend);
        Thread.sleep(1000);
        UserNameSend.sendKeys("frrppylkj");
        PasswordSend.sendKeys("15872");
        LogInButton.click();
        Thread.sleep(2000);
        somethingWentWrongMessage.getText();


    }

    public void RegisterCigna() throws InterruptedException {
        LogInToMyCignaButton.click();
        Thread.sleep(1000);
        registerCigna.click();
        Thread.sleep(1000);
        ActiveMyCignaAccount.getText();


    }





}