package assets;

import org.junit.Assert;
import org.junit.Test;
import pages.AssetsPage;

public class UploadAssetsTest extends SetAssetsPage {

    @Test
    // Given user is on Assets page
    // When clicks on Upload files button
    // And follows the flow
    // Then public asset is uploaded
    public void uploadPublicAssetTest() {
        AssetsPage assetsPage = new AssetsPage(driver);
        // Upload the file
        String projectPath = System.getProperty("user.dir");
        String path = projectPath + "\\assets\\Picture1.jpg";
        assetsPage.uploadFile(path);
        assetsPage.clickUploadButton();
        // Check if asset was uploaded
        Assert.assertTrue("Asset is not uploaded", assetsPage.assetIsDisplayed());
        // Check if asset is public
        Assert.assertTrue("Asset is not public", assetsPage.assetIsPublic());
        // Delete asset
        assetsPage.hoverOverAsset();
        assetsPage.clickOnAssetOptionsButton();
        assetsPage.clickOnOptionsDeleteButton();
        assetsPage.clickOnModalDeleteButton();
    }

    @Test
    // Given user is in Assets page
    // When clicks on Upload files button
    // And follows the flow
    // And selects private asset button
    // Then private asset is uploaded
    public void uploadPrivateAssetTest() {
        AssetsPage assetsPage = new AssetsPage(driver);
        // Upload the file
        String projectPath = System.getProperty("user.dir");
        String path = projectPath + "\\assets\\Picture1.jpg";
        assetsPage.uploadFile(path);
        //Make asset private
        assetsPage.clickOnPrivateAssetButton();
        assetsPage.clickUploadButton();
        // Check if asset was uploaded
        Assert.assertTrue("Asset is not uploaded", assetsPage.assetIsDisplayed());
        // Check if asset is private
        Assert.assertTrue("Asset is not private", assetsPage.assetIsPrivate());
        // Delete asset
        assetsPage.hoverOverAsset();
        assetsPage.clickOnAssetOptionsButton();
        assetsPage.clickOnOptionsDeleteButton();
        assetsPage.clickOnModalDeleteButton();
    }
}
