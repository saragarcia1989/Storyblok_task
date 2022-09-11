package assets;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
import pages.*;

public class SetAssetsPage {
    protected WebDriver driver;
    protected HomePage homePage;

    @Before
    public void navigateToLogInPage() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://app.storyblok.com/#/login");
        homePage = new HomePage(driver);

        LogInPage logInPage = new LogInPage(driver);
        MySpacesPage mySpacesPage = logInPage.logIn();
        DashboardPage dashboardPage = mySpacesPage.clickOnMySpaceCard();
        dashboardPage.clickOnAssetsButton();
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
