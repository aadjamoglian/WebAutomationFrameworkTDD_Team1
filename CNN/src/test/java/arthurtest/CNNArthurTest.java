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

//    @Test @Ignore
//    public void demo () {
//        getInit();
//
//    }

    @Test @Ignore
    public void checkNavLinkUsTest () throws InterruptedException {
        getInit();
        cnnarthur.checkNavLinkUs();
        String expectedTitle = "US News – Top national stories and latest headlines - CNN";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Page title does not match");
    }

    @Test @Ignore
    public void checkNavLinkWorldTest () throws InterruptedException {
        getInit();
        cnnarthur.checkNavLinkWorld();
        String expectedTitle = "World news – breaking news, videos and headlines - CNN";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Page title does not match");
    }

    @Test @Ignore
    public void checkNavLinkWorldPolitics () throws InterruptedException {
        getInit();
        cnnarthur.checkNavLinkPolitics();
        String expectedTitle = "CNNPolitics - Political News, Analysis and Opinion";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Page title does not match");
    }

    @Test @Ignore
    public void checkNavLinkWorldBusiness () throws InterruptedException {
        getInit();
        cnnarthur.checkNavLinkBusiness();
        String expectedTitle = "Business News - Latest Headlines on CNN Business - CNN";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Page title does not match");
    }

    @Test @Ignore
    public void checkNavLinkWorldOpinion () throws InterruptedException {
        getInit();
        cnnarthur.checkNavLinkOpinion();
        String expectedTitle = "Opinions - CNN";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Page title does not match");
    }

    @Test @Ignore
    public void checkNavLinkWorldHealth () throws InterruptedException {
        getInit();
        cnnarthur.checkNavLinkHealth();
        String expectedTitle = "Health News - CNN";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Page title does not match");
    }

    @Test @Ignore
    public void checkNavLinkWorldEntertainment () throws InterruptedException {
        getInit();
        cnnarthur.checkNavLinkEntertainment();
        String expectedTitle = "Entertainment News - Celebrities, Movies, TV, Music - CNN";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Page title does not match");
    }

    @Test @Ignore
    public void checkNavLinkWorldStyle () throws InterruptedException {
        getInit();
        cnnarthur.checkNavLinkStyle();
        String expectedTitle = "CNN Style - Fashion, beauty, design, art, architecture and luxury";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Page title does not match");
    }

    @Test @Ignore
    public void checkNavLinkWorldTravel () throws InterruptedException {
        getInit();
        cnnarthur.checkNavLinkTravel();
        String expectedTitle = "CNN Travel | Global Destinations, Tips & Video";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Page title does not match");
    }

    @Test @Ignore
    public void checkNavLinkWorldSports () throws InterruptedException {
        getInit();
        cnnarthur.checkNavLinkSports();
        String expectedTitle = "Bleacher Report | Sports. Highlights. News. Now.";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Page title does not match");
    }

    @Test @Ignore
    public void checkNavLinkWorldVideos () throws InterruptedException {
        getInit();
        cnnarthur.checkNavLinkVideos();
        String expectedTitle = "Video News - CNN";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle, "Page title does not match");
    }

    @Test @Ignore
    public void searchInUSFirstTest () throws InterruptedException {
        getInit();
        cnnarthur.searchInUSFirst();
        String expected = "These are some of the victims of the Atlanta-area massage spa shootings - CNN";
        String actual = driver.getTitle();
    }

    @Test @Ignore
    public void searchInUSSecondTest () throws InterruptedException {
        getInit();
        cnnarthur.searchInUSSecond();
        String expected = "David Dobrik steps down from his buzzy app Dispo amid controversy - CNN";
        String actual = driver.getTitle();
    }

    @Test @Ignore
    public void searchInUSThirdTest () throws InterruptedException {
        getInit();
        cnnarthur.searchInUSThird();
        String expected = "Live updates: Asian American communities on edge after deadly shootings";
        String actual = driver.getTitle();
    }

    @Test @Ignore
    public void searchInUSFourthTest () throws InterruptedException {
        getInit();
        cnnarthur.searchInUSFourth();
        String expected = "Dolly Parton Fast Facts - CNN";
        String actual = driver.getTitle();
    }

    @Test @Ignore
    public void searchInUSFifthTest () throws InterruptedException {
        getInit();
        cnnarthur.searchInUSFifth();
        String expected = "Justin Long, the 'I'm a Mac' actor, defects from Apple in new Intel ad - CNN";
        String actual = driver.getTitle();
    }

    @Test @Ignore
    public void searchInUSSixthTest () throws InterruptedException {
        getInit();
        cnnarthur.searchInUSSixth();
        String expected = "Alexey Navalny: First Russia poisoned him. Now Penal Colony No. 2 is the prison camp for Navalny. - CNN";
        String actual = driver.getTitle();
    }

    @Test @Ignore
    public void searchInUSSeventhTest () throws InterruptedException {
        getInit();
        cnnarthur.searchInUSSeventh();
        String expected = "March 12, 2021 coronavirus news";
        String actual = driver.getTitle();
    }

    @Test @Ignore
    public void searchInUSEighthTest () throws InterruptedException {
        getInit();
        cnnarthur.searchInUSEighth();
        String expected = "Summersault launches intimates line - CNN Underscored";
        String actual = driver.getTitle();
    }

    @Test @Ignore
    public void searchInUSNinthTest () throws InterruptedException {
        getInit();
        cnnarthur.searchInUSNinth();
        String expected = "They can only hold hands, but for Britain's elderly, first touch with a relative 'means everything' - CNN";
        String actual = driver.getTitle();
    }

    @Test @Ignore
    public void searchInUSTenthTest () throws InterruptedException {
        getInit();
        cnnarthur.searchInUSTenth();
        String expected = "Wandavision: The emotional catharsis we needed in a year of grief - CNN";
        String actual = driver.getTitle();
    }




    @Test
    public void searchInUSPage2Test () throws InterruptedException {
        getInit();
        cnnarthur.searchInUsPage2();
    }





}
