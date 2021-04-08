package cnnhomepagetest;

import cnnhomepage.CNNHomepage;
import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.sql.SQLException;

public class CNNHomePageTest extends WebAPI {
    CNNHomepage homepage;

    @BeforeMethod
    public void getInit() {
        homepage = PageFactory.initElements(driver, CNNHomepage.class);
    }

//    @Test
//    public void testLogIns() throws InterruptedException, IOException, SQLException, ClassNotFoundException, SQLException {
//        homepage.checkLogIn();
//        String expectedText = "CNN - Breaking News, Latest News and Videos";
//        String actualText = driver.getTitle();
//        Assert.assertEquals(actualText, expectedText, "Link is not working as expected");
//    }
//
//    @Test
//    public void testDataProvide() throws InterruptedException, IOException, SQLException, ClassNotFoundException {
//        homepage.checkDataProvider();
//        String expectedText = "CNN - Breaking News, Latest News and Videos";
//        String actualText = driver.getTitle();
//        Assert.assertEquals(actualText, expectedText, "Link is not working as expected");
//    }

    @Test
    public void testSearchBox() throws InterruptedException {
        homepage.checkSearchBox();
        String expectedText = "Search CNN";
        String actualText = homepage.searchBox.getText();
        Assert.assertEquals(actualText, expectedText, "Link is not working as expected");
    }

    @Test
    public void testWorldNews() {
        homepage.checkWorldNews();
        String expectedText = "Asia";
        String actualText = driver.findElement(By.xpath("//*[@id=\"header-nav-container\"]/div/div[1]/div/div[2]/nav/ul/li[3]/a")).getText();
        Assert.assertEquals(actualText, expectedText, "Link is not working as expected");
    }

    @Test
    public void testAsiaNewsLink() {
        homepage.checkAsiaNewsLink();
        String expectedText = "Asia news - breaking news, video, headlines and opinion - CNN";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Link is not working as expected");
    }

    @Test
    public void testAustraliaNews() {
        homepage.checkAustraliaLink();
        String expectedText = "Australia news - breaking news, video, headlines and opinion - CNN";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Link is not working as expected");
    }

    @Test
    public void testmenuBar() throws InterruptedException {
        homepage.checkMenuBar();
        String expectedText = "CNN - Breaking News, Latest News and Videos";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Link is not working as expected");
    }

    @Test
    public void testSportsLink() {
        homepage.checkSportsLink();
        String expectedText = "NFL";
        String actualText = driver.findElement(By.xpath("//*[@id=\"nfl\"]/a")).getText();
        Assert.assertEquals(actualText, expectedText, "Link is not working as expected");
    }

    @Test
    public void testNFlTicketsLocator() throws InterruptedException {
        homepage.checkNFLTicketsLocator();
        String expectedText = "Bleacher Report | Sports. Highlights. News. Now.";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Link is not working as expected");
    }

    @Test
    public void testWorldFootballLink() {
        homepage.checkWorldFootballLink();
        String expectedText = "World Football | Bleacher Report | Latest News, Rumors, Scores and Highlights";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Link is not working as expected");
    }

    //    @Test
//    public void testMLSHomeLink(){
//        homepage.checkMLSHomeLink();
//        String expectedText="CNN - Breaking News, Latest News and Videos";
//        String actualText=driver.getTitle();
//    }
//    @Test
//    public void testPremierLeagueLink(){
//        homepage.checkPremierLeagueLink();
//        String expectedText="| Bleacher Report | Latest News, Videos and Highlights";
//        String actualText=driver.getTitle();
//    }
//    @Test
//    public void testChampionLeaguesLocator(){
//        homepage.checkChampionLeaguesLocator();
//        String expectedText="UEFA Champions League | Bleacher Report | Latest News, Videos and Highlights";
//        String actualText=driver.getTitle();
//    }

    @Test
    public void testNBASportsLink() {
        homepage.checkNBASportsLink();
        String expectedText = "Bleacher Report | Sports. Highlights. News. Now.";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Link is not working as expected");
    }

    //    @Test
//    public void testWorldImage(){
//        homepage.checkWorldImage();
//        String expectedText="China's crackdown in Xinjiang has separated Uyghur children from their parents. CNN found two of them - CNN";
//        String actualText=driver.getTitle();
//    }

    @Test
    public void testTravelLink() throws InterruptedException {
        homepage.checkTravelLink();
        String expectedText = "California Travel Guide | CNN Travel";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Link is not working as expected");
    }

    @Test
    public void testExtremeWeather() throws InterruptedException {
        homepage.checkExtremeWeatherLink();
        String expectedText = "Weather news and local forecast - CNN";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Link is not working as expected");
    }

    @Test
    public void testWeatherSearchBox() throws InterruptedException {
        homepage.checkWeatherSearchBox();
        String expectedText = "Warren, MI";
        String actualText = driver.findElement(By.xpath("//*[@id=\"local-forecast \"]/div[6]/div[1]/h2")).getText();
        Assert.assertEquals(actualText, expectedText, "Link is not working as expected");
    }

    @Test
    public void testCNNLogo() {
        homepage.checkCNNLogo();
        String expectedText = "CNN - Breaking News, Latest News and Videos";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Link is not working as expected");
    }

    @Test
    public void testLiveTvLink() {
        homepage.checkLiveTvLink();
        String expectedText = "CNN - Breaking News, Latest News and Videos";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Link is not working as expected");
    }

    @Test
    public void testEuropeNewsLocator() throws InterruptedException {
        homepage.checkEuropeNewsLink();
        String expectedText = "CNN - Breaking News, Latest News and Videos";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Link is not working as expected");
    }

    @Test
    public void testChinaNewsLink() {
        homepage.checkChineNewsLink();
        String expectedText = "World news – breaking news, videos and headlines - CNN";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Link is not working as expected");
    }

    @Test
    public void textAmericasNewsLink() throws InterruptedException {
        homepage.checkAmericasNewsLink();
        String expectedText = "CNN - Breaking News, Latest News and Videos";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Link is not working as expected");
    }

    @Test
    public void testUnitedKingdom() throws InterruptedException {
        homepage.checkUnitedKingdom();
        String expectedText = "CNN Travel | Global Destinations, Tips & Video";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Link is not working as expected");
    }

    @Test
    public void testIndiaNewsLink() {
        homepage.checkIndiaNewsLocator();
        String expectedText = "India news - breaking news, video, headlines and opinion - CNN";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Link is not working as expected");
    }

    @Test
    public void testMiddleEasternLink() throws InterruptedException, IOException {
        homepage.checkMiddleEastNewsLink();
        String expectedText = "CNN - Breaking News, Latest News and Videos";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Link is not working as expected");
    }

    @Test
    public void testLiveTvLinks() {
        homepage.checkLiveTvLink();
        String expectedText = "CNNgo – Watch CNN TV live";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Link is not working as expected");
    }

    @Test
    public void testNBASportsLinks() {
        homepage.checkNBASportsLink();
        String expectedText = "Bleacher Report | Sports. Highlights. News. Now.";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Link is not working as expected");
    }
    @Test
    public void testEuropeNewsLocatorsLink() throws InterruptedException {
        homepage.checkEuropeNewsLink();
        String expectedText = "CNN - Breaking News, Latest News and Videos";
        String actualText = driver.getTitle();
        Assert.assertEquals(actualText, expectedText, "Link is not working as expected");
    }


//    @Test
//    public void testEditionDropDown(){
//        homepage.checkEditionDropDownLink();
//        String expectedText="Armie Hammer is under investigation for sexual assault - CNN";
//        String actualText=driver.getTitle();
//    }


//    @Test
//    public void testLogin(String email, String password) throws IOException {
//        homepage.checkLogIn(email, password);
//        String expectedText = "CNN - Breaking News, Latest News and Videos";
//        String actualText = driver.getTitle();
//        Assert.assertEquals(actualText, expectedText, "Link is not working as expected");
//    }

}
