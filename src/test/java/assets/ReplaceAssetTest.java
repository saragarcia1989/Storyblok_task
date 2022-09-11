package assets;

import org.junit.Assert;
import org.junit.Test;
import pages.AssetsPage;

public class ReplaceAssetTest extends SetAssetsPage {

    @Test
    // Given user has the Replace feature activated
    // When user clicks on replace option
    // And follows the flow
    // Then asset is replaced
    public void replaceAssetTest() {
        AssetsPage assetsPage = new AssetsPage(driver);
        // Upload the file 1
        String projectPath = System.getProperty("user.dir");
        String path1 = projectPath + "\\assets\\Picture1.jpg";
        assetsPage.uploadFile(path1);
        assetsPage.clickUploadButton();
        // Replace file
        assetsPage.clickOnAsset();
        String path2 = projectPath + "\\assets\\Picture2.jpg";
        assetsPage.replaceFile(path2);
        // Assert the image was replaced
        Assert.assertTrue("Image was not replaced", assetsPage.isReplaceSuccessful());
        assetsPage.closeAssetModal();
        // Delete asset
        assetsPage.hoverOverAsset();
        assetsPage.clickOnAssetOptionsButton();
        assetsPage.clickOnOptionsDeleteButton();
        assetsPage.clickOnModalDeleteButton();
    }
}
