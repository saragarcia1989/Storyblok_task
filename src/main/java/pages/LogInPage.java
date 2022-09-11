package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LogInPage {

    public LogInPage(WebDriver driver) {
        this.driver = driver;
    }

    private WebDriver driver;
    private By emailField = By.id("email");
    private By passwordField = By.id("password");
    private By signInButton = By.cssSelector("button[type='submit']");

    public void setUserEmail(String userEmail) {
        driver.findElement(emailField).sendKeys(userEmail);
    }

    public void setPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public MySpacesPage clickSignInButton() {
        driver.findElement(signInButton).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new MySpacesPage(driver);
    }

    public MySpacesPage logIn() {
        LogInPage logInPage = new LogInPage(driver);
        logInPage.setUserEmail("saragarciacastaneda@gmail.com");
        logInPage.setPassword("9Storyblok!9");
        MySpacesPage mySpacesPage = logInPage.clickSignInButton();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new MySpacesPage(driver);
    }

    public String getUrl() {

        String url = driver.getCurrentUrl();

        return url;
    }

}
