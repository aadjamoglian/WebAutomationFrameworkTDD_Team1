package homepage;

import common.WebAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

import static homepage.HomePageWebElement.*;
import static homepage.HomePageWebElement.searchButtonLocator;

public class HomePage extends WebAPI {

    // Action Method class

    // Find By Annotation: First Approach
    @FindBy(how = How.ID, using =searchBoxLocator ) public WebElement searchBox;
    @FindBy (how = How.ID, using =searchButtonLocator ) public WebElement searchButton;
    @FindBy (how = How.XPATH, using =searchTextLocator ) public WebElement searchText;

    //Find all button box
    @FindBy (how = How.CSS, using =ClickAllSearch ) public WebElement ClickAllSearchButton;
    @FindBy (how = How.XPATH, using =Trending ) public WebElement TrendingText;

    @FindBy (how = How.XPATH, using =NewReleases ) public WebElement NewReleasesBox;
    @FindBy (how = How.XPATH, using =VideoGame ) public WebElement VideoGametext;


    @FindBy (how = How.XPATH, using =Fashion ) public WebElement FashionBox;
    @FindBy (how = How.XPATH, using =FashionNavigation ) public WebElement FashionNavigationBar;
    @FindBy (how = How.XPATH, using =FashionNavigationrolling ) public WebElement FashionNavigationrollingSlide;
    @FindBy (how = How.XPATH, using =SelectImage ) public WebElement SelectImageFashion;
    @FindBy (how = How.CLASS_NAME, using =SwetyRockWomanShort ) public WebElement SwetyRockWomanShorttext;


    @FindBy (how = How.XPATH, using =Fashion1 ) public WebElement Fashion1box;
    @FindBy (how = How.XPATH, using =Women ) public WebElement WomenBox;
    @FindBy (how = How.XPATH, using =ShopByCategory ) public WebElement ShopByCategoryText;


    @FindBy (how = How.XPATH, using =SingInAccountList ) public WebElement SingInAccountListBox;
    @FindBy (how = How.XPATH, using =SingInButton ) public WebElement SingInButtonClick;
    @FindBy (how = How.XPATH, using =SingInButtonText ) public WebElement SingInButtonTextGet;

    // send key for email
    @FindBy (how = How.XPATH, using =SingInsendkey ) public WebElement SingInsendkeyEmail;
    @FindBy (how = How.XPATH, using =Continue ) public WebElement ContinueButton;
    @FindBy (how = How.CLASS_NAME, using =problemMessage ) public WebElement problemMessagetext;

    @FindBy (how = How.XPATH, using =createanAmazonAccount ) public WebElement createanAmazonAccountP;
    @FindBy (how = How.XPATH, using =createAccount ) public WebElement createAccounttext;

    //Account Creation page
    @FindBy (how = How.XPATH, using =userName ) public WebElement userNameSendkey;
    @FindBy (how = How.XPATH, using =userEmail ) public WebElement userEmailendkey;
    @FindBy (how = How.XPATH, using =userPassword ) public WebElement userPasswordsendKey;
    @FindBy (how = How.XPATH, using =userReEnterPassword ) public WebElement userReEnterPasswordSendKey;
    @FindBy (how = How.XPATH, using =gettextCreatAccount ) public WebElement gettextCreatAccounttext;

    //toys and game
    @FindBy (how = How.XPATH, using =toysAndGames ) public WebElement toysAndGamesBox;
    @FindBy (how = How.XPATH, using =ageRange ) public WebElement ageRangeForKids;
    @FindBy (how = How.XPATH, using =nubyIceJelTheeterKey ) public WebElement nubyIceJelTheeterKeytoys;
    @FindBy (how = How.XPATH, using =addToCart ) public WebElement addToCartToy;
    @FindBy (how = How.XPATH, using =selectCart ) public WebElement selectCartForPayment;
    @FindBy (how = How.XPATH, using =shoppingCart ) public WebElement shoppingCartText;



    public void searchBox() throws InterruptedException {
        // Enter productName
        searchBox.sendKeys(productName);
        Thread.sleep(3000);
        // Click on searchButton
        searchButton.click();
    }

    public void searchBox1() {
        typeOnElement(searchBoxLocator, "Hand Sanitizer");
        clickOnElement(searchButtonLocator);

    }
    //work all searchButton Rolling
    public void clickAllSearchButton() throws InterruptedException {
        ClickAllSearchButton.click();
        Thread.sleep(2000);
        TrendingText.getText();
    }



    public void NewRelaeaseFromAllsearch() throws InterruptedException {
        clickAllSearchButton();
        NewReleasesBox.click();
        Thread.sleep(2000);
        VideoGametext.getText();
        System.out.println(VideoGametext.getText());

    }


    //this program not working
    public void ClickOnFashionTab() throws InterruptedException {

        FashionBox.click();
        Thread.sleep(1000);
        FashionNavigationBar.click();
        Thread.sleep(1000);
        FashionNavigationrollingSlide.click();

    }

    public void ClickOnFashionSecondTab() throws InterruptedException {

        Fashion1box.click();
        Thread.sleep(4000);
        //CustomersMostLoveText.click();
        ShopByCategoryText.getText();

    }

    // Hello sing in Account And List
    public void ClickSingInEmail() throws InterruptedException {
        Actions action = new Actions(driver);
        action.moveToElement(SingInAccountListBox).build().perform();
        Thread.sleep(1000);
        SingInButtonClick.click();
        Thread.sleep(1000);
        SingInButtonTextGet.getText();
        System.out.println(SingInButtonTextGet.getText());

    }

    //send key on email
    public void SendKeyOnEmail() throws InterruptedException {
        //calling the clickSingInEmail
        ClickSingInEmail();
        Thread.sleep(2000);
        SingInsendkeyEmail.sendKeys("happybiswas@yahoo.com");
        Thread.sleep(1000);
        ContinueButton.click();
        Thread.sleep(2000);
        problemMessagetext.getText();

    }

    public void createAccount() throws InterruptedException {
        SendKeyOnEmail();
        Thread.sleep(3000);
        createanAmazonAccountP.click();
        Thread.sleep(1000);

        createAccounttext.getText();

    }

    public void provideAccountInformation() throws InterruptedException {
        createAccount();
        Thread.sleep(2000);
        userNameSendkey.sendKeys("nancy");
        userEmailendkey.sendKeys("Happydas@gmail.com");
        userPasswordsendKey.sendKeys("12587");
        userReEnterPasswordSendKey.sendKeys("12587");
        Thread.sleep(3000);
        gettextCreatAccounttext.getText();
        System.out.println(  gettextCreatAccounttext.getText());


    }

    //toys and game
    public void ToysAndGameFram() throws InterruptedException {
        toysAndGamesBox.click();
        Thread.sleep(2000);
        ageRangeForKids.click();
        Thread.sleep(2000);
        nubyIceJelTheeterKeytoys.click();
        Thread.sleep(2000);
        addToCartToy.click();
        Thread.sleep(2000);
        selectCartForPayment.click();
        Thread.sleep(2000);
        shoppingCartText.getText();
        System.out.println(  shoppingCartText.getText());


    }
}
