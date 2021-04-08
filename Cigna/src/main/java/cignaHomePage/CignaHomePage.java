package cignaHomePage;

import common.WebAPI;

import static cignaHomePage.CignaHomePageWebElement.*;

public class CignaHomePage extends WebAPI {


    public void checkIndividualsAndFamilies() {
        getTextByXpath(individualsAndfamiliesLocator);

    }

    public void checkPlanAndServices() {
        checkIndividualsAndFamilies();
        mouseHoverByXpath(plandAndServicesLocator);

    }

    public void checkMedicare() {
        checkPlanAndServices();
        clickOnLink("Medicare");

    }

    public void checkDentalInsurance() {
        checkIndividualsAndFamilies();
        mouseHoverByXpath(plandAndServicesLocator);
        getTextByXpath(dentalInsuranceLocator);
    }

    public void checkMedicareSupplement() {
        getTextByXpath(individualsAndfamiliesLocator);
        mouseHoverByXpath(plandAndServicesLocator);
        //clickByLinkText("Medicare Supplement");

    }

    public void checkOtherSupplementalInsurance() {
        checkPlanAndServices();
        getTextByXpath(otherSupplementalInsuranceLocator);
    }

    public void checkUnderstandingInsurance() {
        getTextByXpath(individualsAndfamiliesLocator);
        mouseHoverByXpath(understandingInsuranceLocator);

    }

    public void checkFullCoverageDentalInsurance() {
        getTextByXpath(individualsAndfamiliesLocator);
        mouseHoverByXpath(understandingInsuranceLocator);
        clickOnLink("Full Coverage Dental Insurance");
    }

    public void checkCommonInsurancePlanType() {
        checkIndividualsAndFamilies();
        mouseHoverByXpath(understandingInsuranceLocator);
        clickOnLink("Common Insurance Plan Types: HMO, PPO, EPO");
    }

    public void checkCopaysDeductible() {
        checkUnderstandingInsurance();
        getTextByCss(copaysDeductibleLocator);
    }

    public void checkPreExisting() {
        getTextByXpath(individualsAndfamiliesLocator);
        mouseHoverByXpath(understandingInsuranceLocator);
        clickByLinkText("What is a Pre-Existing Condition?");

    }

    public void checkOpenEnrollment() {
        clickOnLink("Individuals and Families");
        mouseHoverByXpath(understandingInsuranceLocator);
        clickOnLink("Open Enrollment and Special Enrollment Periods");
    }

    public void checkMemberResources() {
        checkIndividualsAndFamilies();
        clickOnLink("Member Resources");
    }

    public void checkMemberResourcesOverview() {
        getTextByXpath(individualsAndfamiliesLocator);
        clickByXpath(memberresiourcesLOcator);
        clickByCss(memberServicesLocator);
    }

    public void checkSavingsAndSpendingAccount() {
        mouseHoverByXpath(individualsAndfamiliesLocator);
        clickOnLink("Member Resources");
        getTextByCss(savingAndSpendingLocator);

    }

    public void checkPrescriptionDrug() {
        mouseHoverByXpath(individualsAndfamiliesLocator);
        clickOnLink("Member Resources");
        getTextByXpath(prescriptionDrugLocator);

    }

    public void checkVirtualCare() {
        checkIndividualsAndFamilies();
        clickByXpath(memberServicesLocator);
        //clickByCss(virtualCareLocator);
        clickOnLink("Virtual Care Options");

    }

    public void checkHomeDelivery() {
        mouseHoverByXpath(individualsAndfamiliesLocator);
        clickOnLink("Member Resources");
        getTextByXpath(homeDeliveryLocator);

    }

    public void checkHealthAndWellness() {
        mouseHoverByXpath(individualsAndfamiliesLocator);
        getTextByCss(healthAndWellnessLocator);

    }

    public void checkAdvancingDialogue() {
        checkIndividualsAndFamilies();
        clickOnLink("Health and Wellness");
        //getTextByXpath(advancingDialogueLocator);
        clickOnLink("Advancing the Race Dialogue");

    }

    public void checkDentalHealth() {
        mouseHoverByXpath(individualsAndfamiliesLocator);
        clickOnLink("Health and Wellness");
        getTextByCss(dentalHealthLocator);
    }

    public void checkDisasterResourceCenter() {
        getTextByXpath(individualsAndfamiliesLocator);
        clickOnLink("Health and Wellness");
        getTextByCss(disasterResourceCenterLocator);
    }

    public void checkMentalHealth() {
        mouseHoverByXpath(individualsAndfamiliesLocator);
        getTextByCss(healthAndWellnessLocator);
        getTextByCss(mentalHealthLocator);
    }

//public void checkMedicareCoverageOption(){
//mouseHoverByXpath(medicareLocator1);
//clickByXpath("//button[@id='medicare-coverage-tab']");
//
//}

    public void checkShopMedicare() {
        mouseHoverByXpath(medicareLocator1);
        getTextByXpath(shopMedicareLocator);
    }

    public void checkShopPartDPrescription() {
        mouseHoverByXpath(medicareLocator1);
        getTextByXpath(shopPartDPrescriptionLocator);

    }

    public void checkShopMedicareSupplement() {
        clickOnLink("Medicare");
        getTextByXpath("//*[@id=\"medicare-coverage\"]/div/div[1]/ul/li[3]/a");

    }

    public void checkEmployersAndBrokers() {
        mouseHoverByCSS(employersAndBrokersLocator);
    }

    public void checkMedical() {
        mouseHoverByCSS(employersAndBrokersLocator);
        getTextByCss(medicalLocator);

    }

    public void checkSavingsAndSpending() {
        mouseHoverByCSS(employersAndBrokersLocator);
        getTextByCss(savingAndSpendingLocator);

    }

    public void checkWellnessMentalHealth() {
        mouseHoverByXpath(employersAndBrokersLocator1);
        getTextByXpath(wellnessMentalHealthLocator);


    }

    public void checkPharmacy() {
        mouseHoverByCSS(employersAndBrokersLocator);
        getTextByCss(pharmacyLocator);

    }

    public void checkDentalAndVision() {
        mouseHoverByXpath(employersAndBrokersLocator1);
        getTextByXpath(dentalAndVisionLocator);

    }

    public void checkCostControl() {
        mouseHoverByCSS(employersAndBrokersLocator);
        getTextByCss(costControlLocator);
    }

  public void checkHealthCareProvider(){
        mouseHoverByXpath(healthCareProvidersLocator);
    }


















}