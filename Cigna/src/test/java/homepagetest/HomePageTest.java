package homepagetest;

import cignaHomepage.CignaHomepage;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class HomePageTest extends WebAPI {
    CignaHomepage homepage;

    @BeforeMethod
    public void getInit() {
        homepage = PageFactory.initElements(driver, CignaHomepage.class);
    }

    @Test
    public void testResourcesLink() {
        homepage.checkCoronaVirusResourceLink();
        String expectedText = "Cigna Official Site | Global Health Service Company";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not working as expected");
    }

    @Test
    public void testMedicareLink() {
        homepage.checkMedicareLink();
        String expectedText = "Cigna Medicare Insurance | Cigna";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not working as expected");
    }

    @Test
    public void testMedicareAdvantageLink() {
        homepage.checkMedicareAdvantageLink();
        String expectedText = "Cigna Medicare Insurance | Cigna";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not working as expected");
    }

    @Test
    public void testPrescriptionDrug() {
        homepage.checkPrescriptionDrugPlan();
        String expectedText = "Cigna Medicare Insurance | Cigna";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not working as expected");
    }

    @Test
    public void testMedicareSupplementInsurance() {
        homepage.checkMedicareSupplementInsurance();
        String expectedText = "Cigna Medicare Insurance | Cigna";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not working as expected");
    }

    @Test
    public void testEnrollmentAndEligibility() {
        homepage.checkEnrollmentAndEligibility();
        String expectedText = "Cigna Medicare Insurance | Cigna";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not working as expected");
    }

    @Test
    public void testMedicareAdvantageEnrollementAndEligibility() throws InterruptedException {
        homepage.checkMedicareAdvantageEnrollementAndEligibility();
        String expectedText = "Cigna Medicare Insurance | Cigna";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not working as expected");
    }

    @Test
    public void testMedicareEligibilitySearchBox() throws InterruptedException {
        homepage.checkMedicareAdvantageEnrollementAndEligibility();
        String expectedText = "Cigna Medicare Insurance | Cigna";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not working as expected");
    }

    @Test
    public void testPartDEnrollmentAndEligibility() throws InterruptedException {
        homepage.checkPartDEnrollmentAndEligibility();
        String expectedText = "Cigna Medicare Insurance | Cigna";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not working as expected");
    }

    @Test
    public void testMedicareSupplementEnrollmentAndEligibility() {
        homepage.checkMedicareSupplementEnrollmentAndEligibility();
        String expectedText = "Cigna Medicare Insurance | Cigna";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not working as expected");
    }

    @Test
    public void testEnrollmentAndEligibilityOverviewLink() {
        homepage.checkEnrollmentAndEligibilityOverviewLink();
        String expectedText = "Cigna Medicare Insurance | Cigna";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not working as expected");
    }

    @Test
    public void testUnderstandingMedicareLink() {
        homepage.checkUnderstandingMedicareLink();
        String expectedText = "Cigna Medicare Insurance | Cigna";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not working as expected");
    }

    @Test
    public void testUnderstandingMedicareOverviewLink() {
        homepage.checkUnderstandingMedicareOverview();
        String expectedText = "Cigna Medicare Insurance | Cigna";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not working as expected");
    }

    @Test
    public void testContactUsLink() {
        homepage.checkContactUsLink();
        String expectedText = "Cigna Official Site | Global Health Service Company";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not working as expected");
    }

    @Test
    public void testMemberResourcesAndEnrollment() {
        homepage.checkMemberResourcesAndServices();
        String expectedText = "Cigna Medicare Insurance | Cigna";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not working as expected");
    }

    @Test
    public void textCustomerForms() {
        homepage.checkCustomerForms();
        String expectedText = "Cigna Medicare Insurance | Cigna";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not working as expected");
    }

    @Test
    public void textHealthRiskAssessment(){
        homepage.checkHealthRiskAssessment();
        String expectedText = "Cigna Medicare Insurance | Cigna";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not working as expected");
    }

    @Test
    public void testPremiumPaymentOptions(){
        homepage.checkPremiumPaymentOptions();
        String expectedText = "Cigna Medicare Insurance | Cigna";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not working as expected");
    }

    @Test
    public void testHealthyAging(){
        homepage.checkhealthyAging();
        String expectedText = "Cigna Medicare Insurance | Cigna";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not working as expected");
    }

    @Test
    public void testDepressionAndMentalHealthLink(){
        homepage.checkDepresiionAndMentalHealthLink();
        String expectedText = "Cigna Medicare Insurance | Cigna";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Link is not working as expected");
    }

    @Ignore
    @Test
    public void testCignaImage(){
        homepage.checkCignaImage();
        String expectedText = "Cigna Official Site | Global Health Service Company";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Cigna Image is not working as expected");
    }

    @Ignore
    @Test
    public void testDocumentUpload() throws InterruptedException {
        homepage.uploadDocuments();
        String expectedText = "Career Opportunities at Cigna | Cigna Careers";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText,expectedText,"Document upload option is not working");
    }

    @Test
    public void testDownloadDocuments() throws InterruptedException {
        homepage.downloadDocuments();

    }

}
