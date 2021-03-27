package cignaHomepage;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import static cignaHomepage.CignaHomepageWebElement.*;

public class CignaHomepage extends WebAPI {

    @FindBy(how = How.XPATH, using = coronaVirusResourceLocator) public WebElement resourceCenter;
    @FindBy(how = How.XPATH, using = medicareAdvantageLocator) public WebElement medicareAdvantage;
    @FindBy(how = How.XPATH,using = medicareEligibilitySearchBoxLocator) public WebElement searchBoxLocator;
    @FindBy(how = How.XPATH, using = shopForPlanButton) public WebElement planButton;
    @FindBy(how = How.CSS, using = uploadResumeLocator) public WebElement uploadResume;

    public  void checkCoronaVirusResourceLink(){
        resourceCenter.click();
    }
    public void checkMedicareLink(){
        clickByXpath(medicareLocator);
    }
    public void checkMedicareAdvantageLink(){
        clickByXpath(medicareLocator);
        mouseHoverByXpath(medicareLocator);
    }

    public void checkPrescriptionDrugPlan(){
        checkMedicareLink();
        mouseHoverByCSS(prescriptionDrugLocator);
    }
    public void checkMedicareSupplementInsurance(){
        checkPrescriptionDrugPlan();
        mouseHoverByXpath(medicareSupplementLocator);
    }
    public void checkEnrollmentAndEligibility(){
        checkMedicareLink();
        mouseHoverByXpath(enrollmentAndEligibilityLocator);
    }
    public void checkMedicareAdvantageEnrollementAndEligibility() throws InterruptedException {
        checkEnrollmentAndEligibility();
        sleepFor(2);
        mouseHoverByCSS(medicareEnrollmentAndEligibilityLocator);
    }

    public void checkMedicareEligibilitySearchBox() throws InterruptedException {
        checkMedicareAdvantageEnrollementAndEligibility();
        searchBoxLocator.sendKeys(zipcode);
        keysInput(shopForPlanButton);
    }

    public void checkPartDEnrollmentAndEligibility(){
        checkEnrollmentAndEligibility();
        mouseHoverByCSS(medicareEnrollmentAndEligibilityLocator);
        mouseHoverByXpath(partDEnrollmentLocator);
    }

    public void checkMedicareSupplementEnrollmentAndEligibility(){
        checkEnrollmentAndEligibility();
        mouseHoverByCSS(medicareEnrollmentAndEligibilityLocator);
        mouseHoverByCSS(MedicareSupplementEnrollmentAndEligibilityLocator);
    }

    public void checkEnrollmentAndEligibilityOverviewLink(){
        checkMedicareLink();
        mouseHoverByXpath(enrollmentAndEligibilityLocator);
        mouseHoverByXpath(EnrollmentandEligibilityOverview);
    }

    public void checkUnderstandingMedicareLink(){
        clickByXpath(medicareLocator);
        mouseHoverByXpath(understandingMedicareLocator);
    }

    public void checkUnderstandingMedicareOverview(){
        clickByXpath(medicareLocator);
        mouseHoverByXpath(understandingMedicareLocator);
        mouseHoverByCSS(understandingMedicareOverviewLocator);
    }
    public void checkContactUsLink(){
        clickByLinkText("Contact Us");

    }

    public void checkMemberResourcesAndServices(){
        clickByXpath(medicareLocator);
        mouseHoverByXpath(memberResourcesAndServicesLocator);
    }

    public void checkCustomerForms(){
        clickByXpath(medicareLocator);
        mouseHoverByXpath(memberResourcesAndServicesLocator);
        mouseHoverByXpath(customerFormsLocator);
    }

    public void checkHealthRiskAssessment(){
        clickByXpath(medicareLocator);
        mouseHoverByXpath(memberResourcesAndServicesLocator);
        mouseHoverByXpath(healthRiskAssesmentLocator);
    }

    public void checkPremiumPaymentOptions(){
        clickByXpath(medicareLocator);
        mouseHoverByXpath(memberResourcesAndServicesLocator);
        mouseHoverByXpath(premiumPaymentOptionsLocator);
    }
    public void checkhealthyAging(){
        clickByXpath(medicareLocator);
        mouseHoverByXpath(healthyAgingLocator);
    }

    public void checkDepresiionAndMentalHealthLink(){
        clickByXpath(medicareLocator);
        mouseHoverByXpath(healthyAgingLocator);
        mouseHoverByXpath(depresiionAndMentalHealth);

    }

    public void checkCignaImage(){
        clickByXpath(imageLocator);
    }

    public void uploadDocuments(){
        //scrollToBottom();
        //clickByXpath(careersLocator);
        clickOnLink("Careers");
        //getTextByXpath(getStartedLocator);
        clickOnLink("Get Started");
        uploadResume.sendKeys(documentPathLocator);


    }

    public void downloadDocuments(){
        //clickByXpath(findAFormLocator);
        clickOnLink("Find a Form");
        //clickOnLink(visionFormsLocator);
        clickOnLink("Vision Forms");
        clickByXpath(medicalClaimLocator);
        //clickByXpath(downloadLocator);
        downloadFiles();

    }



}
