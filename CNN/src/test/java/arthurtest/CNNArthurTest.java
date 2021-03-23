package arthurtest;

import arthur.CNNArthur;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class CNNArthurTest extends WebAPI {

    // Test Class
    CNNArthur cnnarthur;
//    Registration registration;

    public void getInit() {
        cnnarthur = PageFactory.initElements(driver, CNNArthur.class);
//        registration = PageFactory.initElements(driver, Registration.class);
    }

    @Test @Ignore
    public void demo () {
        getInit();

    }

    @Test
    public void checkNavLinkUsTest () throws InterruptedException {
        getInit();
        cnnarthur.checkNavLinkUs();
        String expectedTitle = "US News – Top national stories and latest headlines - CNN";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Page title does not match");
    }

    @Test
    public void checkNavLinkWorldTest () throws InterruptedException {
        getInit();
        cnnarthur.checkNavLinkUs();
        String expectedTitle = "World news – breaking news, videos and headlines - CNN";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Page title does not match");
    }



}
