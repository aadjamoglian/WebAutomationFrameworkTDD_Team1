package homepagetest;

import common.WebAPI;
import kindlebookspage.KindleBooksDisplayedElements;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KindleBooksDisplayedElementsTest extends WebAPI {

    KindleBooksDisplayedElements  kindleBooksDisplayedElements;

    @BeforeMethod
    public void getInit() {
        kindleBooksDisplayedElements = PageFactory.initElements(driver, KindleBooksDisplayedElements.class);
    }
    @Test(enabled = false)
    public void kindleBooksDisplayedTest(){
        kindleBooksDisplayedElements.kindleBooksDisplayed();
        boolean display = kindleBooksDisplayedElements.kindleBooksDisplayed();
        Assert.assertEquals(display,true);
    }

    @Test(enabled = false)
    public void buyAKindlesDisplayedTest(){
        boolean display = kindleBooksDisplayedElements.buyAKindlesDisplayed();
        Assert.assertEquals(display,true);
    }

    @Test(enabled = false)
    public void kindleEbooksDisplayedTest(){
        boolean display = kindleBooksDisplayedElements.kindleEbooksDisplayed();
        Assert.assertEquals(display,true);
    }

    @Test(enabled = false)
    public void kindleUnlimitedDisplayedTest(){
        boolean display = kindleBooksDisplayedElements.kindleUnlimitedDisplayed();
        Assert.assertEquals(display,true);
    }

    @Test(enabled = false)
    public void primeReadingDisplayedTest(){
        boolean display = kindleBooksDisplayedElements.primeReadingDisplayed();
        Assert.assertEquals(display,true);
    }

    @Test(enabled = false)
    public void kindleBookDealsDisplayedTest(){
        boolean display = kindleBooksDisplayedElements.kindleBookDealsDisplayed();
        Assert.assertEquals(display,true);
    }

    @Test(enabled = false)
    public void kindleSinglesDisplayedTest(){
        boolean display = kindleBooksDisplayedElements.kindleSinglesDisplayed();
        Assert.assertEquals(display,true);
    }

    @Test(enabled = false)
    public void newsStandDisplayedTest(){
        boolean display = kindleBooksDisplayedElements.newsStandDisplayed();
        Assert.assertEquals(display,true);
    }

    @Test(enabled = false)
    public void manageContentAndDevicesDisplayedTest(){
        boolean display = kindleBooksDisplayedElements.manageContentAndDevicesDisplayed();
        Assert.assertEquals(display,true);
    }

    @Test(enabled = false)
    public void advancedSearchDisplayedTest(){
        boolean display = kindleBooksDisplayedElements.advancedSearchDisplayed();
        Assert.assertEquals(display,true);
    }

    @Test(enabled = true)
    public void searchButtonDisplayedTest(){
        boolean display = kindleBooksDisplayedElements.searchButtonDisplayed();
        Assert.assertEquals(display,true);
    }

}
