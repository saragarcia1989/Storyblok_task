package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AssetsPage {
    private WebDriver driver;

    public AssetsPage(WebDriver driver) {
        this.driver = driver;
    }

    private By pageTitle = By.cssSelector("h1[class='header__title']");
    private By inputField = By.id("file");
    private By upLoadButton = By.xpath("//button[@class='sb-button sb-button--primary']/span");
    private By uploadedAsset = By.cssSelector("div[class='assets-list-item assets-list__item']");
    private By privateAssetProperty = By.cssSelector("div[class='asset-private-preview']");
    private By publicAssetProperty = By.cssSelector("div[class='assets-list-item-preview__image']");
    private By assetActionsButton = By.cssSelector("button[aria-label='Asset actions']");
    private By assetOptionsDeleteButton = By.cssSelector("button[class='sb-menu-item sb-menu-item--negative']");
    private By modalDeleteButton = By.cssSelector("button[class='sb-button sb-button--danger']");
    private By modalPrivateAssetButton = By.cssSelector("label[for='asset-is-private-0']");
    private By replaceInputField = By.id("replacefile");
    private By assetModal = By.cssSelector("div[data-testid='asset-detail-modal']");
    private By closeAssetModalButton = By.cssSelector("button[aria-label='Close Asset Details']");

    public String getPageTitle() {
        return driver.findElement(pageTitle).getText();
    }

    public void uploadFile(String pathOfFile) {
        driver.findElement(inputField).sendKeys(pathOfFile);
    }

    public void replaceFile(String pathOfFile) {
        driver.findElement(replaceInputField).sendKeys(pathOfFile);
    }

    public void clickUploadButton() {
        driver.findElement(upLoadButton).click();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public boolean assetIsDisplayed() {
        return driver.findElement(uploadedAsset).isDisplayed();
    }

    public boolean assetIsPrivate() {
        return driver.findElement(privateAssetProperty).isDisplayed();
    }

    public boolean assetIsPublic() {
        return driver.findElement(publicAssetProperty).isDisplayed();
    }

    public void hoverOverAsset() {
        WebElement asset = driver.findElement(uploadedAsset);
        Actions actions = new Actions(driver);
        actions.moveToElement(asset).perform();
    }

    public void clickOnAsset() {
        driver.findElement(uploadedAsset).click();
    }

    public void clickOnAssetOptionsButton() {
        driver.findElement(assetActionsButton).click();
    }

    public void clickOnOptionsDeleteButton() {
        driver.findElement(assetOptionsDeleteButton).click();
    }

    public void clickOnModalDeleteButton() {
        driver.findElement(modalDeleteButton).click();
    }

    public void clickOnPrivateAssetButton() {
        driver.findElement(modalPrivateAssetButton).click();
    }

    public void closeAssetModal() {
        driver.findElement(closeAssetModalButton).click();
    }

    public boolean isReplaceSuccessful() {
        new WebDriverWait(driver, 5).until(ExpectedConditions
                .visibilityOfElementLocated(By.xpath("//div[contains(.,'The asset was successfully replaced')]")));
        return driver.findElement(By.xpath("//div[contains(.,'The asset was successfully replaced')]")).isDisplayed();
    }
}

