package base;

import org.junit.Assert;
import org.junit.Test;
import pages.LogInPage;
import pages.MySpacesPage;

public class LogOutTest extends SetStoryblok {

    @Test
    // Given user is logged in
    // When user logs out
    // Then user is on 'Log in' page
    public void successfulLogOutTest() {
        // Navigate to log in page
        LogInPage logInPage = homePage.clickLogInButton();
        // Log in
        MySpacesPage mySpacesPage = logInPage.logIn();
        // Log out
        mySpacesPage.clickMyAccountButton();
        mySpacesPage.clickLogOutButton();
        // Assert user is back on 'Log in' page
        Assert.assertEquals("https://app.storyblok.com/#/login", logInPage.getUrl(), "This website is not https://app.storyblok.com/#/login");
    }

}
