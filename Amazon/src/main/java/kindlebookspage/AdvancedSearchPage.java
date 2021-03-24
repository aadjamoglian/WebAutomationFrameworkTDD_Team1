package kindlebookspage;

import common.WebAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static kindlebookspage.HomePageWebElement.*;

public class AdvancedSearchPage extends WebAPI {
    //    @FindBy(id=searchBoxLocator) public WebElement searchBox1;
    @FindBy(xpath = kindleBooksLocator)
    public WebElement kindleBooks;
    @FindBy(xpath = advancedSearchLocato)
    public WebElement advancedSearch;
    @FindBy(xpath = authorLocator)
    public WebElement author;
    @FindBy(xpath = keywordLocator)
    public WebElement keyword;
    @FindBy(xpath = titleLocator)
    public WebElement title;
    @FindBy(xpath = publisherLocator)
    public WebElement publisher;
    @FindBy(xpath = searchButtonLocator1)
    public WebElement searchButton;
    @FindBy(xpath = subjectLocator)
    public WebElement subject;
    @FindBy(xpath = languageLocator)
    public WebElement language;
    @FindBy(xpath = pub_dateLocator)
    public WebElement pub_date;
    @FindBy(xpath = monthLocator)
    public WebElement month;
    @FindBy(xpath = yearLocator)
    public WebElement year;
    @FindBy(xpath = sortResultsByLocator)
    public WebElement sortResultsBy;
    @FindBy(xpath = textLocator) public WebElement text;


    @FindBy(xpath = booksLocator) public WebElement books;
    @FindBy(xpath = keywordsLocator) public WebElement keywords;
    @FindBy(xpath = authorsLocator) public WebElement authors;
    @FindBy(xpath = title1Locator) public WebElement title1;
    @FindBy(xpath = isbnLocator) public WebElement isbn;
    @FindBy(xpath = publisher1Locator) public WebElement publisher1;
    @FindBy(xpath = subject1Locator) public WebElement subject1;
    @FindBy(xpath = conditionLocator) public WebElement condition;
    @FindBy(xpath = readerAgeLocator) public WebElement readerAge;
    @FindBy(xpath = formatLocator) public WebElement format;
    @FindBy(xpath = language1Locator) public WebElement language1;
    @FindBy(xpath = pub_date1Locator) public WebElement pub_date1;
    @FindBy(xpath = month1Locator) public WebElement month1;
    @FindBy(xpath = year1Locator) public WebElement year1;
    @FindBy(xpath = sortResultsBy1Locator) public WebElement sortResultsBy1;
    @FindBy(xpath = searchButton1Locator) public WebElement searchButton1;
    @FindBy(xpath = kindleBooksSearchTextLocator) public WebElement kindleBooksSearchText;
    @FindBy(xpath = KindleBooksAdvancedSearchTextLocator) public WebElement KindleBooksAdvancedSearchText;
    @FindBy(xpath = magazinesLocator) public WebElement magazines;
    @FindBy(xpath = kindleNewsStandLocator) public WebElement kindleNewsStand;
    @FindBy(xpath = musicLocator) public WebElement music;
    @FindBy(xpath = classicalMusicLocator) public WebElement classicalMusic;
    @FindBy(xpath = moviesAndTVLocator) public WebElement moviesAndTV;
    @FindBy(xpath = toysAndGamesLocator) public WebElement toysAndGames;


    public String getTextAdvancedSearch(){

       // String text3= kindleBooksText.getText();
       return kindleBooksSearchText.getText();

    }
    public String getTextKindleBooksSearch(){
        return KindleBooksAdvancedSearchText.getText();
    }


    public void checkAdvancedSearch() {
        kindleBooks.click();
        advancedSearch.click();
    }

    public void kindleBooksSearch() {
        checkAdvancedSearch();
        keyword.sendKeys("sports");
        author.sendKeys("williams");
        title.sendKeys("soccer era");
        publisher.sendKeys("diago maradonna");
        selectOptionByVisibleText(subject, "Sports");
        selectOptionByVisibleText(language, "German");
        selectOptionByVisibleText(pub_date, "During");
        selectOptionByVisibleText(month, "July");
        year.sendKeys("2000");
        selectOptionByVisibleText(sortResultsBy, "Publication Date");
        searchButton.click();
    }
    public void booksSearch() {
        checkAdvancedSearch();
        books.click();
        keywords.sendKeys("Sports");
        authors.sendKeys("cherif");
        title1.sendKeys("maradona");
        isbn.sendKeys("978-0-375-71449-8");
        publisher1.sendKeys("NY");
        selectOptionByVisibleText(subject1,"Law");
        selectOptionByVisibleText(condition,"New");
        selectOptionByVisibleText(format,"Paperback");
        selectOptionByVisibleText(readerAge,"9-12 Years");
        selectOptionByVisibleText(language1,"French");
        selectOptionByVisibleText(pub_date1,"Before");
        selectOptionByVisibleText(month1,"Mar");
        year1.sendKeys("2000");
        selectOptionByVisibleText(sortResultsBy1,"Publication Date");
        searchButton1.click();
    }

    public void magazinesSearch() {
        checkAdvancedSearch();
        magazines.click();
    }

    public String  searchResult() {
        String text1 =text.getText();
        return text1;
    }

    public void books() {
        checkAdvancedSearch();
        books.click();
    }
    public void kindleNewsStand() {
        checkAdvancedSearch();
        kindleNewsStand.click();
    }
    public void music (){
        checkAdvancedSearch();
        boolean musicIsAvailable=music.isDisplayed();
        System.out.println("music Is Available "+musicIsAvailable);
    }
    public void classicalMusic (){
        checkAdvancedSearch();
        boolean classicalMusicIsAvailable=classicalMusic.isDisplayed();
        System.out.println("classical Music Is Available "+classicalMusicIsAvailable);
    }
    public void moviesAndTV (){
        checkAdvancedSearch();
        boolean toysAndGamesIsAvailable=toysAndGames.isDisplayed();
        System.out.println("toys & Games Is Available "+toysAndGamesIsAvailable);
    }
    public void toysAndGames (){
        checkAdvancedSearch();
        boolean moviesAndTVIsAvailable=classicalMusic.isDisplayed();
        System.out.println("movies & TV Is Available "+moviesAndTVIsAvailable);
    }


}
