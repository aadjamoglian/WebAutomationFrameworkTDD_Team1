package homepagetest;

import common.WebAPI;
import kindlebookspage.KindleBooksPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class KindleBooksPageTest extends WebAPI {
    KindleBooksPage kindleBooksPage;

    @BeforeMethod
    public void getInit() {
        kindleBooksPage = PageFactory.initElements(driver, KindleBooksPage.class);
    }

    @Test(enabled = true)
    public  void kindleBooksSearchBoxTest() throws InterruptedException {
        kindleBooksPage.kindleBooksSearchBox();
    }
    @Test(enabled = true)
    public void kindleBooksTitleTest() {
        kindleBooksPage.kindleBooksTitle();
        String title = driver.getTitle();
        Assert.assertEquals(title, "Amazon.com: Kindle eBooks: Kindle Store: Nonfiction, Literature & Fiction, Foreign Languages, Business & Money & More");
    }

    @Test(enabled = true)
    public void buyAKindleTitleTest() {
        kindleBooksPage.buyAKindle();
        String title = driver.getTitle();
        String expectedTitle = "Amazon.com: Kindle E-readers: Amazon Devices & Accessories";
        Assert.assertEquals(title, expectedTitle);
    }

    @Test(enabled = true)
    public void kindleEBooksTitleTest() {
        kindleBooksPage.checkKindleEbooks();
        String title = driver.getTitle();
        Assert.assertEquals(title, "Amazon.com: Kindle eBooks: Kindle Store: Nonfiction, Literature & Fiction, Foreign Languages, Business & Money & More");
    }

    @Test(enabled = true)
    public void primeReadingTitleTest() {
        kindleBooksPage.checkPrimeReading();
        String title = driver.getTitle();
        Assert.assertEquals(title, "");
    }

    @Test(enabled = true)
    public void bestSellersAndMoreTitleTest() {
        kindleBooksPage.checkBestSellersAndMore();
        String title = driver.getTitle();
        Assert.assertEquals(title, "Amazon.com: Best sellers & more: Kindle Store");
    }

    @Test(enabled = true)
    public void KindleBookDealsTitleTest() {
        kindleBooksPage.checkKindleBookDeals();
        String title = driver.getTitle();
        Assert.assertEquals(title, "Amazon.com: Deals in Kindle Books");
    }

    @Test(enabled = true)
    public void KindleSinglesTest() {
        kindleBooksPage.checkKindleSingles();
        String title = driver.getTitle();
        Assert.assertEquals(title, "Amazon.com: Kindle Singles: Kindle Store: Nonfiction, Literature & Fiction, Biographies & Memoirs & More");

    }
    @Test(enabled = true)
    public void newsStandTest() {
        kindleBooksPage.checkNewsStand();
        String title = driver.getTitle();
        Assert.assertEquals(title, "Amazon.com: Kindle Newsstand: Kindle Store: Lifestyle & Culture, Men's Interests, Entertainment & Pop Culture & More");
    }
    @Test(enabled = true)
    public void manageContentAndDevicesTest() {
        kindleBooksPage.checkManageContentAndDevices();
        String title = driver.getTitle();
        Assert.assertEquals(title, "Amazon Sign-In");
    }
@Test(enabled = true)
public void advancedSearchTest() {
    kindleBooksPage.checkAdvancedSearch();
    String title = driver.getTitle();
    Assert.assertEquals(title, "Amazon.com: : Kindle Store");
}

@Test(enabled = true)
    public  void kindleBooksSearchBox1Test() throws InterruptedException {
        kindleBooksPage.kindleBooksSearchBox1();

    }
    @Test(enabled = true)
    public  void PopularInKindleTest() throws InterruptedException {
        kindleBooksPage.checkPopularInKindle();
    }
}