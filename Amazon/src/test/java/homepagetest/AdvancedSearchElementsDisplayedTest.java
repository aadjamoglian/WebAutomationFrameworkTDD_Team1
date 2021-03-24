package homepagetest;

import common.WebAPI;
import kindlebookspage.AdvancedSearchElementsDisplayed;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AdvancedSearchElementsDisplayedTest extends WebAPI {

    AdvancedSearchElementsDisplayed advancedSearchElementsDisplayed;

    @BeforeMethod
    public void getInit() {
        advancedSearchElementsDisplayed = PageFactory.initElements(driver, AdvancedSearchElementsDisplayed.class);
    }

    @Test(enabled = false)
    public void keywordDisplayedTest() {
        boolean display = advancedSearchElementsDisplayed.keywordDisplayed();
        Assert.assertEquals(display, true);
    }

    @Test(enabled = false)
    public void authorDisplayedTest() {
        boolean display = advancedSearchElementsDisplayed.authorDisplayed();
        Assert.assertEquals(display, true);
    }
@Test(enabled = false)
    public void titleDisplayedTest() {
        boolean display = advancedSearchElementsDisplayed.titleDisplayed();
        Assert.assertEquals(display,true);
    }
    @Test(enabled = false)
    public void subjectDisplayedTest(){
        boolean display =advancedSearchElementsDisplayed.subjectDisplayed();
        Assert.assertEquals(display,true);
    }
    @Test(enabled = false)
    public void languageDisplayedTest(){
        boolean display= advancedSearchElementsDisplayed.subjectDisplayed();
        Assert.assertEquals(display,true);
    }
    @Test(enabled = false)
    public void pub_dateDisplayedTestT(){
        boolean display= advancedSearchElementsDisplayed.pub_dateDisplayed();
        Assert.assertEquals(display,true);
    }
    @Test
    public void monthDisplayedTest(){
        boolean display= advancedSearchElementsDisplayed.monthDisplayed();
        Assert.assertEquals(display,true);
    }
}