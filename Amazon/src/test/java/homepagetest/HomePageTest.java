package homepagetest;

import common.WebAPI;
import homepage.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends WebAPI {
    // Test class
    HomePage homePage;
    // Registration registration;

    @BeforeMethod
    public void getInit() {
        homePage = PageFactory.initElements(driver, HomePage.class);
        // registration= PageFactory.initElements(driver,Registration.class);
    }


    @Test(enabled = true)
    public void testSearchBox() throws InterruptedException {
        //getInit();
        // Call Action method by reference variable
        homePage.searchBox();
        // Verify expected vs Actual
        String expectedText = "\"mask\"";
        String actualText = homePage.searchText.getText();
        Assert.assertEquals(actualText, expectedText, "Product does not match");
    }


    @Test
    public void testToysAndGames() {
        homePage.checkToysAndGame();
        String expectedText = "Birthday Gift List";
        String actualText = driver.findElement(By.xpath("//*[@id=\"nav-subnav\"]/a[9]/span")).getText();
        Assert.assertEquals(actualText, expectedText, "Link does not work");
    }


    @Test
    public void testBirthdayGiftList() {
        homePage.checkBirthdayGiftList();
        String expectedText = "Shop by Age | Birthday Gift List";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Link is not working as expected");
    }



    @Test
    public void testCameraAndPhoto() {
        homePage.checkCameraAndPhoto();
        String expectedText = "Amazon.com: Camera, Photo & Video";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Link is not working as expected");
    }


    @Test
    public void testCarElectronics() {
        homePage.checkCarElectronics();
        String expectedText = "Car Audio";
        String actualText = driver.findElement(By.linkText("Car Audio")).getText();
        Assert.assertEquals(actualText, expectedText, "Link is not working as expected");

    }

        @Test
    public void testCellPhonesAndAccessories() {
        homePage.checkCellPhonesAndAccessories();
        String expectedText = "Electronics";
        String actualText= driver.findElement(By.xpath("//*[@id=\"zg_browseRoot\"]/ul/li/a")).getText();
        Assert.assertEquals(actualText, expectedText, "Link is not working as expected");

    }

    @Test
    public void testComputersAndAccessories() {
        homePage.checkComputerAndAccessories();
        String expectedText = "Data Storage";
        String actualText = driver.findElement(By.linkText("Data Storage")).getText();
        Assert.assertEquals(actualText, expectedText, "Link is not working as expected");

    }

//    @Test
//    public void testGpsAndNavigation() {
//        homePage.checkGpsAndNavigation();
//        String expectedText = "GPS Trackers";
//        String actualText = driver.findElement(By.xpath("//*[@id="zg_browseRoot"]/ul/ul/li[6]/a")).getText();
//        Assert.assertEquals(actualText, expectedText, "Link is not working as expected");
//
//
//    }

    @Test
    public void testHeadPhones() {
        homePage.checkHeadPhones();
        String expectedText = "Amazon Best Sellers: Best Electronics";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Link is not working as expected");

    }


    @Test
    public void testMensShirtLink() {
        homePage.checkMensShirtLink();
        String expectedText = "Amazon Fashion | Clothing, Shoes & Jewelry | Amazon.com";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Link is not working as expected");

    }


    @Test
    public void testBooksLink() {
        homePage.checkBooksLink();
        String expectedText = "Prime Student";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Link is not working as expected");


    }


    @Test
    public void testFashionLink() {
        homePage.checkFashionLink();
        String expectedText = "Amazon.com: Kids: Clothing, Shoes & Jewelry";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Link is not working as expected");

    }


    @Test
    public void testGiftCardLink() {
        homePage.checkGiftCard();
        String expectedText = "Amazon.com Birthday Gift Cards";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Link is not working as expected");

    }


    @Test
    public void testToysAndGames1() {
        homePage.checkToysAndGames1();
        String expectedText = "Amazon.com : Puzzles";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Link is not working as expected");

    }


    @Test
    public void testHobbiesLink() {
        homePage.checkHobbiesLink();
        String expectedText = "Amazon.com: Toys & Games";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Link is not working as expected");

    }


    @Test
    public void testStorage() {
        homePage.checkStorage();
        String expectedText = "Amazon.com: Toys & Games";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Link is not working as expected");

    }


    @Test
    public void testPartySupplies() {
        homePage.checkPartySupplies();
        String expectedText = "Amazon.com : Kids' Party Supplies";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Link is not working as expected");

    }


    @Test
    public void testLearningAndEducation() {
        homePage.checkLearningAndEducation();
        String expectedText = "Preschool";
        String actualText = driver.findElement(By.linkText("Preschool")).getText();
        Assert.assertEquals(actualText, expectedText, "Link is not working as expected");

    }


    @Test
    public void testFindGift() {
        homePage.checkFindGift();
        String expectedText = "Gifts for Everyone | Amazon.com Gift Finder";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Link is not working as expected");
    }


    @Test
    public void testAmazonHome() {
        homePage.checkAmazonHome();
        String expectedText = "Shop Amazon Home Products";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Link is not working as expected");
    }


    @Test
    public void testFashion() {
        homePage.checkFashion();
        String expectedText = "Polos";
        String actualText = driver.findElement(By.xpath("//*[@id=\"s-refinements\"]/div[2]/ul/li[7]/span/a/span")).getText();
        Assert.assertEquals(actualText, expectedText, "Link is not working as expected");
    }


    @Test
    public void testLanguage() {
        homePage.checkLanguage();
        String expectedText = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Link is not working as expected");
    }


    @Test
    public void testOrganization() {
        homePage.checkOrganization();
        String expectedText = "Shop Amazon Home Products";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Link is not working as expected");

    }


    @Test
    public void testHomeOffice() {
        homePage.checkHomeOffice();
        String expectedText = "Amazon.com : Home Office Desks";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Link is not working as expected");

    }


    @Test
    public void testNewReleases() {
        homePage.checkNewReleases();
        String expectedText = "Amazon.com New Releases: The best-selling new & future releases in Baby";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Link is not working as expected");

    }


    @Test
    public void testComputers() {
        homePage.checkComputers();
        String expectedText = "Monitors | Amazon.com";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Link is not working as expected");
    }


    @Test
    public void testDesktopsLink() {
        homePage.checkDesktopsLink();
        String expectedText = "Monitors";
        String actualText = driver.findElement(By.linkText("Monitors")).getText();
        Assert.assertEquals(actualText, expectedText, "Link is not working as expected");
    }


    @Test
    public void testLaptops() {
        homePage.checkLaptops();
        String expectedText = "Laptops | Amazon.com";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Link is not working as expected");
    }


    @Test
    public void testTablets() {
        homePage.checkTablets();
        String expectedText = "Android";
        String actualText = driver.findElement(By.xpath("//*[@id=\"s-refinements\"]/div[2]/ul/li[1]/span/a/span")).getText();
        Assert.assertEquals(actualText, expectedText, "Link is not working as expected");

    }

    @Test
    public void testMonitors() {
        homePage.checkMonitors();
        String expectedText = "Monitors | Amazon.com";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Link is not working as expected");
    }


}