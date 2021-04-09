package homepagetest;

import common.WebAPI;
import kindlebookspage.AdvancedSearchPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class AdvancedSearchTest extends WebAPI {

    AdvancedSearchPage advancedSearchPage;

    @BeforeMethod
    public void getInit() {
        advancedSearchPage = PageFactory.initElements(driver, AdvancedSearchPage.class);
    }

    @Test(enabled = true)
    public void advancedSearchTest() {
        advancedSearchPage.checkAdvancedSearch();
        String title = driver.getTitle();
        Assert.assertEquals(title, "Amazon.com: : Kindle Store");
    }

    @Test(enabled = true)
    public void kindleBooksSearchTest() {
        advancedSearchPage.kindleBooksSearch();
        String text =advancedSearchPage.searchResult();
     Assert.assertEquals(text,"Try checking your spelling or use more general terms");
    }


    @Test(enabled = true)
    public void booksSearchTest() {
        advancedSearchPage.booksSearch();
        String text =advancedSearchPage.searchResult();
        Assert.assertEquals(text,"Try checking your spelling or use more general terms");
    }

    @Test(enabled = true)
    public void checkTextAdvancedSearchTest(){
        advancedSearchPage.checkAdvancedSearch();
        String text=advancedSearchPage.getTextAdvancedSearch();
        Assert.assertEquals(text,"Kindle eBooks: Advanced Search");

    }
    @Test(enabled = true)
    public void checkTextKindleBooksSearchTest(){
        advancedSearchPage.checkAdvancedSearch();
        String text4 =advancedSearchPage.getTextKindleBooksSearch();
        Assert.assertEquals(text4,"Kindle Books Search");

    }
    @Test(enabled = true)
    public void magazineTest(){
        advancedSearchPage.magazinesSearch();
        String magazineTitle = driver.getTitle();
        Assert.assertEquals(magazineTitle,"Amazon.com: Discount Magazines: : Magazine Subscriptions");

    }
    @Test(enabled = true)
    public void booksTest(){
        advancedSearchPage.books();
        String booksText = "Advanced Search";
        Assert.assertEquals(booksText,"Advanced Search");
    }
    @Test(enabled = true)
    public void kindleNewsStandTest(){
        advancedSearchPage.kindleNewsStand();
        String kindleNewsStandTitle = driver.getTitle();
        Assert.assertEquals(kindleNewsStandTitle,"Amazon.com: : Kindle Store");
    }
@Test(enabled = true)
    public void musicTest() {
        advancedSearchPage.music();

    }
    @Test(enabled = true)
    public void classicalMusicTest() {
        advancedSearchPage.classicalMusic();

    }
    @Test(enabled = true)
    public void moviesAndTVTest() {
        advancedSearchPage.moviesAndTV();

    }
    @Test(enabled = true)
    public void toysAndGamesTest() {
        advancedSearchPage.toysAndGames();

    }
}

