package arthur;

import common.WebAPI;
import org.openqa.selenium.By;

public class CNNArthur extends WebAPI {

    // Action Methods

    // Checking nav bar

    public void checkNavLinkUs () throws InterruptedException {
        driver.findElement(By.linkText("US")).click();
        sleepFor(2);
    }

    public void checkNavLinkWorld () throws InterruptedException {
        driver.findElement(By.linkText("World")).click();
        sleepFor(2);
    }

    public void checkNavLinkPolitics () throws InterruptedException {
        driver.findElement(By.linkText("Politics")).click();
        sleepFor(2);
    }

    public void checkNavLinkBusiness () throws InterruptedException {
        driver.findElement(By.linkText("Business")).click();
        sleepFor(2);
    }

    public void checkNavLinkOpinion () throws InterruptedException {
        driver.findElement(By.linkText("Opinion")).click();
        sleepFor(2);
    }

    public void checkNavLinkHealth () throws InterruptedException {
        driver.findElement(By.linkText("Health")).click();
        sleepFor(2);
    }

    public void checkNavLinkEntertainment () throws InterruptedException {
        driver.findElement(By.linkText("Entertainment")).click();
        sleepFor(2);
    }

    public void checkNavLinkStyle () throws InterruptedException {
        driver.findElement(By.linkText("Style")).click();
        sleepFor(2);
    }

    public void checkNavLinkTravel () throws InterruptedException {
        driver.findElement(By.linkText("Travel")).click();
        sleepFor(2);
    }

    public void checkNavLinkSports () throws InterruptedException {
        driver.findElement(By.linkText("Sports")).click();
        sleepFor(2);
    }

    public void checkNavLinkVideos () throws InterruptedException {
        driver.findElement(By.linkText("Videos")).click();
        sleepFor(2);
    }

    public void searchInUSFirst () throws InterruptedException {
        checkNavLinkUs();
        clickByCss("div[class='Flex-sc-1sqrs56-0 sc-kvZOFW cJcAaN'] button[class='sc-jhAzac sc-gisBJw hioqcg']");
        typeOnInputBox2("header-search-bar", "hello");
        sleepFor(2);
        clickByLinkText("A trip to the spa that ended in death. These are some of the victims of the Atlanta-area shootings");
    }

    public void searchInUSSecond () throws InterruptedException {
        checkNavLinkUs();
        clickByCss("div[class='Flex-sc-1sqrs56-0 sc-kvZOFW cJcAaN'] button[class='sc-jhAzac sc-gisBJw hioqcg']");
        typeOnInputBox2("header-search-bar", "hello");
        sleepFor(2);
        clickByLinkText("Social media star David Dobrik steps down from his buzzy app Dispo amid controversy");
    }

    public void searchInUSThird () throws InterruptedException {
        checkNavLinkUs();
        clickByCss("div[class='Flex-sc-1sqrs56-0 sc-kvZOFW cJcAaN'] button[class='sc-jhAzac sc-gisBJw hioqcg']");
        typeOnInputBox2("header-search-bar", "hello");
        sleepFor(2);
        clickByLinkText("Asian American communities on edge after deadly shootings");
    }

    public void searchInUSFourth () throws InterruptedException {
        checkNavLinkUs();
        clickByCss("div[class='Flex-sc-1sqrs56-0 sc-kvZOFW cJcAaN'] button[class='sc-jhAzac sc-gisBJw hioqcg']");
        typeOnInputBox2("header-search-bar", "hello");
        sleepFor(2);
        clickByLinkText("Dolly Parton Fast Facts");
    }

    public void searchInUSFifth () throws InterruptedException {
        checkNavLinkUs();
        clickByCss("div[class='Flex-sc-1sqrs56-0 sc-kvZOFW cJcAaN'] button[class='sc-jhAzac sc-gisBJw hioqcg']");
        typeOnInputBox2("header-search-bar", "hello");
        sleepFor(2);
        clickByLinkText("Justin Long, the 'I'm a Mac' actor, defects from Apple");
    }

    public void searchInUSSixth () throws InterruptedException {
        checkNavLinkUs();
        clickByCss("div[class='Flex-sc-1sqrs56-0 sc-kvZOFW cJcAaN'] button[class='sc-jhAzac sc-gisBJw hioqcg']");
        typeOnInputBox2("header-search-bar", "hello");
        sleepFor(2);
        clickByLinkText("First Russia poisoned him. Now this is the prison camp for Alexey Navalny");
    }

    public void searchInUSSeventh () throws InterruptedException {
        checkNavLinkUs();
        clickByCss("div[class='Flex-sc-1sqrs56-0 sc-kvZOFW cJcAaN'] button[class='sc-jhAzac sc-gisBJw hioqcg']");
        typeOnInputBox2("header-search-bar", "hello");
        sleepFor(2);
        clickByLinkText("March 12 coronavirus news");
    }

    public void searchInUSEighth () throws InterruptedException {
        checkNavLinkUs();
        clickByCss("div[class='Flex-sc-1sqrs56-0 sc-kvZOFW cJcAaN'] button[class='sc-jhAzac sc-gisBJw hioqcg']");
        typeOnInputBox2("header-search-bar", "hello");
        sleepFor(2);
        clickByLinkText("Size-inclusive label Summersalt just launched intimates");
    }

    public void searchInUSNinth () throws InterruptedException {
        checkNavLinkUs();
        clickByCss("div[class='Flex-sc-1sqrs56-0 sc-kvZOFW cJcAaN'] button[class='sc-jhAzac sc-gisBJw hioqcg']");
        typeOnInputBox2("header-search-bar", "hello");
        sleepFor(2);
        clickByLinkText("They can only hold hands, but for Britain's elderly, first touch with a relative 'means everything'");
    }

    public void searchInUSTenth () throws InterruptedException {
        checkNavLinkUs();
        clickByCss("div[class='Flex-sc-1sqrs56-0 sc-kvZOFW cJcAaN'] button[class='sc-jhAzac sc-gisBJw hioqcg']");
        typeOnInputBox2("header-search-bar", "hello");
        sleepFor(2);
        clickByLinkText("The emotional catharsis of 'Wandavision' in a year of grief");
    }

    public void searchInUsPage2 () throws InterruptedException {
        checkNavLinkUs();
        clickByCss("div[class='Flex-sc-1sqrs56-0 sc-kvZOFW cJcAaN'] button[class='sc-jhAzac sc-gisBJw hioqcg']");
        typeOnInputBox2("header-search-bar", "hello");
        sleepFor(1);
        clickByClassName("pagination-arrow pagination-arrow-right cnnSearchPageLink text-active");
    }

}
