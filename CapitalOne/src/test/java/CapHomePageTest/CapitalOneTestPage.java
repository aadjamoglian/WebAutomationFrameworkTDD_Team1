package CapHomePageTest;

import CapHomePage.CapitalOnepage;
import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class CapitalOneTestPage extends WebAPI {
    CapitalOnepage capitalOnepage;

    @BeforeMethod
    public void getInit() {

        capitalOnepage = PageFactory.initElements(driver, CapitalOnepage.class);


    }

    @Test(enabled = true)
    public void testAutoLoanMouseHoover() throws InterruptedException {
        //call the method here
        capitalOnepage.AutoLoanMouseHoover();
        String expectedText = "Get Pre-qualified";
        String actualText = capitalOnepage.FindTheRightCarText.getText();
        Assert.assertEquals(actualText, expectedText, "product does not match");

    }

    @Test(enabled = false)
    public void testCapSingIn() throws InterruptedException {
        //testAutoLoanMouseHoover();
        capitalOnepage.CapSingIn();
        String expectedText = "";
        String actualText = capitalOnepage.YouEnterWrong.getText();
        Assert.assertEquals(actualText, expectedText, "product does not match");
    }

    @Test(enabled = true)
    public void testCreditCardMouseHoover() throws InterruptedException {
        capitalOnepage.CreditCardMouseHoover();
        String expectedText = "TYPES OF CREDIT CARDS";
        String actualText = capitalOnepage.TypeOfcreditCardText.getText();
        Assert.assertEquals(actualText, expectedText, "product does not match");

    }

    @Test(enabled = true)
    public void testTravelRewardCardCase() throws InterruptedException {
        testCreditCardMouseHoover();
        capitalOnepage.TravelRewardCardCase();
        String expectedText = "Travel & Miles Rewards";
        String actualText = capitalOnepage.TravelAndMilesRewardText.getText();
        Assert.assertEquals(actualText, expectedText, "product does not match");
    }

    @Test(enabled =true)
    public void testVentureRewardsCard() throws InterruptedException {
        testTravelRewardCardCase();
        capitalOnepage.VentureRewardsCard();
        String expectedText = "Personal Information";
        String actualText = capitalOnepage.EarnBonusMilesText.getText();
        Assert.assertEquals(actualText, expectedText, "product does not match");
    }
}