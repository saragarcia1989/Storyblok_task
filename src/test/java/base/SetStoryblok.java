package base;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeTest;
import pages.HomePage;

public class SetStoryblok {

    private WebDriver driver;
    protected HomePage homePage;

    @Before
    public void NavigateToStoryblok() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.storyblok.com/");

        homePage = new HomePage(driver);
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
