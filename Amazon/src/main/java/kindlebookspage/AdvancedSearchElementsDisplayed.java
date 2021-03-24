package kindlebookspage;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static kindlebookspage.HomePageWebElement.*;

public class AdvancedSearchElementsDisplayed extends WebAPI {

    @FindBy(xpath = kindleBooksLocator) public WebElement kindleBooks ;
    @FindBy(xpath = advancedSearchLocator) public WebElement advancedSearch ;
    @FindBy(xpath = keywordLocator) public WebElement keyword ;

    public void advancedSearchHomePage(){
        kindleBooks.click();
        advancedSearch.click();
    }

    public boolean keywordDisplayed(){
        advancedSearchHomePage();
        return keyword.isDisplayed();
    }

    @FindBy(xpath = authorLocator) public WebElement author ;
    public boolean authorDisplayed(){
        advancedSearchHomePage();
        return author.isDisplayed();
    }

    @FindBy(xpath = titleLocator) public WebElement title ;
    public boolean titleDisplayed(){
        advancedSearchHomePage();
        return title.isDisplayed();
    }

    @FindBy(xpath = subjectLocator) public WebElement subject ;
    public boolean subjectDisplayed(){
        advancedSearchHomePage();
        return subject.isDisplayed();
    }

    @FindBy(xpath = languageLocator) public WebElement language;
    public boolean languageDisplayed(){
        advancedSearchHomePage();
        return language.isDisplayed();
    }

    @FindBy(xpath = pub_dateLocator) public WebElement pub_date;
    public boolean pub_dateDisplayed(){
        advancedSearchHomePage();
        return pub_date.isDisplayed();
    }

    @FindBy(xpath = monthLocator) public WebElement month;
    public boolean monthDisplayed(){
        advancedSearchHomePage();
        return month.isDisplayed();
    }

    @FindBy(xpath = yearLocator) public WebElement year;
    public boolean yearDisplayed(){
        advancedSearchHomePage();
        return year.isDisplayed();
    }
    @FindBy(xpath = sortResultsByLocator) public WebElement sortResultsBy;
    public boolean sortResultsByDisplayed(){
        advancedSearchHomePage();
        return sortResultsBy.isDisplayed();
    }


}
