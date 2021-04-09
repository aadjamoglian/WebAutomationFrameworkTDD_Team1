package commercialpagetest;

import commercialpage.SignInPage;
import common.WebAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SignInTest extends WebAPI {

    SignInPage signInPage;
    @BeforeMethod
    public void getInit(){
        signInPage=PageFactory.initElements(driver,SignInPage.class);
    }

@Test(enabled = true)
   public void signInTest(){
        signInPage.checkSignIn();
        String expectedText="Oops!";
        String actualText=signInPage.oopsText.getText();
       Assert.assertEquals(expectedText,actualText,"test fail" );
   }
   @Test(enabled = true)
public void userNameDisplayedTest(){
    signInPage.signInButtonDisplayed();
    boolean userNameDisplayed=signInPage.userName.isDisplayed();
    Assert.assertEquals(userNameDisplayed,true);
}
    @Test(enabled = true)
    public void signInButtonDisplayedTest(){
        signInPage.signInButtonDisplayed();
        boolean signInButtonDisplayed=signInPage.signInButton.isDisplayed();
        Assert.assertEquals(signInButtonDisplayed,true);
    }
    @Test(enabled = true)
    public void passwordDisplayedTest(){
        signInPage.passwordDisplayed();
        boolean passwordDisplayed=signInPage.password.isDisplayed();
        Assert.assertEquals(passwordDisplayed,true);
    }
    @Test(enabled = true)
    public void checkBoxRememberMeDisplayedTest(){
        signInPage.checkBoxRememberMeDisplayed();
        boolean checkBoxRememberMeDisplayed=signInPage.checkBoxRememberMe.isDisplayed();
        Assert.assertEquals(checkBoxRememberMeDisplayed,true);
    }



}
