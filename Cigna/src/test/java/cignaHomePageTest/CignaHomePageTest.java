package cignaHomePageTest;

import cignaHomePage.CignaHomePage;
import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

import static cignaHomePage.CignaHomePageWebElement.providerDirectoryLocator;

public class CignaHomePageTest extends WebAPI {

    CignaHomePage homePage;
    // Registration registration;

    @BeforeMethod
    public void getInit() {
        homePage = PageFactory.initElements(driver, CignaHomePage.class);
        // registration= PageFactory.initElements(driver,Registration.class);
    }

    @Ignore
    @Test
    public void testIndividualsAndFamilies() {
        homePage.checkIndividualsAndFamilies();
        String expectedText = "Cigna Official Site | Global Health Service Company";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Link is not working as expected");
    }

    @Ignore
    @Test
    public void testPlansAndServices() {
        homePage.checkPlanAndServices();
        String actualText = "Medicare";
        String expectedText = driver.findElement(By.xpath("//*[@id=\"plans-services-1\"]/div[2]/div[1]/ul/li[3]/a")).getText();
        Assert.assertEquals(actualText, expectedText, "Link is not working as expected");
    }

    @Ignore
    @Test
    public void testMedicare() {
        homePage.checkMedicare();
        String expectedText = "Cigna Medicare Insurance | Cigna";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Link is not working as expected");
    }

    @Ignore
    @Test
    public void testDentalInsurance() {
        homePage.checkDentalInsurance();
        String expectedText = "Cigna Official Site | Global Health Service Company";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Link is not working as expected");
    }

    @Ignore
    @Test
    public void testMedicareSupplement() {
        homePage.checkMedicareSupplement();
        String expectedText = "Cigna Official Site | Global Health Service Company";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Link is not working as expected");
    }

    @Ignore
    @Test
    public void testOtherSupplementalInsurance() {
        homePage.checkOtherSupplementalInsurance();
        String expectedText = "Cigna Official Site | Global Health Service Company";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Link is not working as expected");
    }

    @Ignore
    @Test
    public void testUnderstandingInsurance() {
        homePage.checkUnderstandingInsurance();
        String expectedText = "Cigna Official Site | Global Health Service Company";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Link is not working as expected");
    }

    @Ignore
    @Test
    public void testFullCoverageDentalInsurance() {
        homePage.checkFullCoverageDentalInsurance();
        String expectedText = "Full Coverage Dental Insurance | Cigna";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Link is not working as expected");
    }

    @Ignore
    @Test
    public void testCommonInsurancePlanType() {
        homePage.checkCommonInsurancePlanType();
        String expectedText = "HMO vs. PPO vs. EPO: What is the Difference? | Cigna";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Link is not working as expected");

    }

    @Ignore
    @Test
    public void testCopaysDeductible() {
        homePage.checkCopaysDeductible();
        String expectedText = "Cigna Official Site | Global Health Service Company";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Link is not working as expected");

    }

    @Ignore
    @Test
    public void testPreExisting() {
        homePage.checkPreExisting();
        String expectedText = "What is a Pre-Existing Condition? | Cigna";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Link is not working as expected");

    }

    @Ignore
    @Test
    public void testOpenEnrollment() {
        homePage.checkOpenEnrollment();
        String expectedText = "Health Insurance Open Enrollment and Special Enrollment | Cigna";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Link is not working as expected");


    }

    @Ignore
    @Test
    public void testMemberResources() {
        homePage.checkMemberResources();
        String expectedText = "Cigna Official Site | Global Health Service Company";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Link is not working as expected");

    }

    @Ignore
    @Test
    public void testMemberResourcesOverview() {
        homePage.checkMemberResourcesOverview();
        String expectedText = "Provider Directory";
        String actualText = driver.findElement(By.linkText(providerDirectoryLocator)).getText();
        Assert.assertEquals(actualText, expectedText, "Link is not working as expected");

    }

    @Ignore
    @Test
    public void testSavingsAndSpendingAccount() {
        homePage.checkSavingsAndSpendingAccount();
        String expectedText = "Cigna Official Site | Global Health Service Company";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Link is not working as expected");
    }

    @Ignore
    @Test
    public void testPrescriptionDrug() {
        homePage.checkPrescriptionDrug();
        String expectedText = "Cigna Official Site | Global Health Service Company";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Link is not working as expected");
    }

    @Ignore
    @Test
    public void testVirtualCare() {
        homePage.checkVirtualCare();
        String expectedText = "Glossary";
        String actualText = driver.findElement(By.linkText("Glossary")).getText();
        Assert.assertEquals(actualText, expectedText, "Link is not working as expected");

    }

    @Ignore
    @Test
    public void testHomeDelivery() {
        homePage.checkHomeDelivery();
        String expectedText = "Cigna Official Site | Global Health Service Company";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Link is not working as expected");
    }

    @Ignore
    @Test
    public void testHealthAndWellness() {
        homePage.checkHealthAndWellness();
        String expectedText = "Cigna Official Site | Global Health Service Company";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Link is not working as expected");
    }

    @Ignore
    @Test
    public void testAdvancingDialogue() {
        homePage.checkAdvancingDialogue();
        String expectedText = "Cigna Official Site | Global Health Service Company";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Link is not working as expected");

    }

    @Ignore
    @Test
    public void testDentalHealth() {
        homePage.checkDentalHealth();
        String expectedText = "Cigna Official Site | Global Health Service Company";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Link is not working as expected");

    }

    @Ignore
    @Test
    public void testDisasterResourceCenter() {
        homePage.checkDisasterResourceCenter();
        String expectedText = "Cigna Official Site | Global Health Service Company";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Link is not working as expected");

    }

    @Ignore
    @Test
    public void testMentalHealth() {
        homePage.checkMentalHealth();
        String expectedText = "Cigna Official Site | Global Health Service Company";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Link is not working as expected");
    }

//    @Test
//    public void testMedicareCoverageOption() {
//        homePage.checkMedicareCoverageOption();
//        String expectedText = "Individual and Family Health Insurance Plans | Cigna";
//        String actualText = driver.getTitle();
//        Assert.assertEquals(actualText, expectedText, "Link is not working as expected");
//    }

    @Ignore
    @Test
    public void testShopMedicare() {
        homePage.checkShopMedicare();
        String expectedText = "Cigna Official Site | Global Health Service Company";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Link is not working as expected");
    }

    @Ignore
    @Test
    public void testShopPartDPrescription() {
        homePage.checkShopPartDPrescription();
        String expectedText = "Cigna Official Site | Global Health Service Company";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Link is not working as expected");

    }

    @Ignore
    @Test
    public void testShopMedicareSupplement() {
        homePage.checkShopMedicareSupplement();
        String expectedText = "Cigna Medicare Insurance | Cigna";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Link is not working as expected");

    }

    @Ignore
    @Test
    public void testEmployersAndBrokers() {
        homePage.checkEmployersAndBrokers();
        String expectedText = "Cigna Official Site | Global Health Service Company";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Link is not working as expected");
    }

    @Ignore
    @Test
    public void testMedical() {
        homePage.checkMedical();
        String expectedText = "Cigna Official Site | Global Health Service Company";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Link is not working as expected");
    }

    @Ignore
    @Test
    public void testSavingsAndSpending() {
        homePage.checkSavingsAndSpending();
        String expectedText = "Cigna Official Site | Global Health Service Company";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Link is not working as expected");
    }

    @Ignore
    @Test
    public void testWellnessMentalHealth() {
        homePage.checkWellnessMentalHealth();
        String expectedText = "Cigna Official Site | Global Health Service Company";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Link is not working as expected");
    }

    @Ignore
    @Test
    public void testPharmacy() {
        homePage.checkPharmacy();
        String expectedText = "Cigna Official Site | Global Health Service Company";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Link is not working as expected");

    }

    @Ignore
    @Test
    public void testDentalAndVision() {
        homePage.checkDentalAndVision();
        String expectedText = "Cigna Official Site | Global Health Service Company";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Link is not working as expected");
    }

    @Test
    public void testCostControl() {
        homePage.checkCostControl();
        String expectedText = "Cigna Official Site | Global Health Service Company";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Link is not working as expected");

    }


}












