package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

    private WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    private By logInButton = By.cssSelector("a[title='Navigate to login page']");

    public LogInPage clickLogInButton() {
        driver.findElement(logInButton).click();
        return new LogInPage(driver);
    }
}
