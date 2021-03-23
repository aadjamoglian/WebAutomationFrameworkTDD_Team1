package Cigna1HomePageTest;

import Cigna1HomePage.CignaPage;
import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CignaTestDriver extends WebAPI {
    CignaPage cignaPage;

    @BeforeMethod
    public void getInit() {

        cignaPage = PageFactory.initElements(driver, CignaPage.class);


    }

    @Test(enabled = true)
    public void testindividualAndFamilyCase() throws InterruptedException {
        cignaPage.individualAndFamilyCase();
        String expectedText = "Popular Insurance Articles";
        String actualText = cignaPage.PopularInsuranceArticlesText.getText();
        Assert.assertEquals(actualText, expectedText, "product does not match");

    }

    @Test(enabled = true)
    public void testcommonInsurancePlaneTypeCase() throws InterruptedException {
        testindividualAndFamilyCase();
        cignaPage.commonInsurancePlaneTypeCase();
        String expectedText = "Get help choosing between an HMO, EPO, and PPO plan.";
        String actualText = cignaPage.GetHelpChoosingBetweenAndHmo.getText();
        Assert.assertEquals(actualText, expectedText, "product does not match");

    }

    @Test(enabled = false)
    public void testanHmoIsRightForYou() throws InterruptedException {
        testcommonInsurancePlaneTypeCase();
        cignaPage.anHmoIsRightForYou();
        String expectedText = "What’s the Difference Between HMO and PPO Plans";
        String actualText = cignaPage.WhatIsdifferentBetweenHmoAndPpo.getText();
        Assert.assertEquals(actualText, expectedText, "product does not match");

    }


    @Test(enabled = false)
    public void testbackToUnderstandingInsurance() throws InterruptedException {
        testanHmoIsRightForYou();
        cignaPage.backToUnderstandingInsurance();
        String expectedText = "Understanding Insurance";
        String actualText = cignaPage.UnderstandingInsuranceText.getText();
        Assert.assertEquals(actualText, expectedText, "product does not match");
    }

    @Test(enabled = false)
    public void testexploreGlocery() throws InterruptedException {
        testbackToUnderstandingInsurance();
        cignaPage.exploreGlocery();
        String expectedText = "Search terms by:";
        String actualText = cignaPage.SearchTermBByText.getText();
        Assert.assertEquals(actualText, expectedText, "product does not match");

    }


    @Test(enabled = false)
    public void testcategoryclaimAndPaymentpharmacy() throws InterruptedException {
        testexploreGlocery();
        cignaPage.categoryclaimAndPaymentpharmacy();
        String expectedText = "brand name drug";
        String actualText = cignaPage.SearchTermBByText.getText();
        Assert.assertEquals(actualText, expectedText, "product does not match");
    }

    @Test(enabled = false)
    public void testCutomerLoginCigna() throws InterruptedException {
        cignaPage.CutomerLoginCigna();
        String expectedText = "Something Went Wrong";
        String actualText = cignaPage.somethingWentWrongMessage.getText();
        Assert.assertEquals(actualText, expectedText, "product does not match");

    }

    @Test(enabled = true)
    public void testRegisterCigna() throws InterruptedException {
        cignaPage.RegisterCigna();
        String expectedText = "Activate your myCigna account";
        String actualText = cignaPage.ActiveMyCignaAccount.getText();
        Assert.assertEquals(actualText, expectedText, "product does not match");


    }
}

