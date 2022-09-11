package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MySpacesPage {
    private WebDriver driver;
    public MySpacesPage(WebDriver driver) {
        this.driver = driver;
    }
    private By myAccountButton = By.cssSelector("[class='sb-sidebar__bottom']");
    private By logOutButton = By.name("Logout");
    private By mySpaceCard = By.cssSelector("div[class='base-space-card']");

    public String getUrl() {

        String url = driver.getCurrentUrl();

        return url;
    }

    public void clickMyAccountButton() {
        driver.findElement(myAccountButton).click();
    }

    public LogInPage clickLogOutButton() {
        driver.findElement(logOutButton).click();
        return new LogInPage(driver);
    }

    public DashboardPage clickOnMySpaceCard() {
        driver.findElement(mySpaceCard).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new DashboardPage(driver);
    }
}
