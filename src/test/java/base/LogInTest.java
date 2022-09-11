package base;

import org.junit.Assert;
import org.junit.Test;
import pages.LogInPage;
import pages.MySpacesPage;

public class LogInTest extends SetStoryblok {

    @Test
    // Given user
    // When logs in Storyblock
    // Then My Spaces page is open
    public void successfulLogInTest() {
        // Navigate to 'log in' page and log in
        LogInPage logInPage = homePage.clickLogInButton();
        MySpacesPage mySpacesPage = logInPage.logIn();
        Assert.assertEquals("This website is not https://app.storyblok.com/#/me/spaces", "https://app.storyblok.com/#/me/spaces", mySpacesPage.getUrl());
    }
}
