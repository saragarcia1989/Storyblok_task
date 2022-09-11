package assets;

import org.junit.Assert;
import org.junit.Test;
import pages.AssetsPage;

public class GoToAssetsTest extends SetAssetsPage {

    // Given user logs in
    // And user is on My spaces page
    // When user chooses a space
    // Then Dashboard page is open
    // And user clicks on Assets
    // Then Assets page is open

    @Test
    public void navigateToAssetsPageTest() {
        AssetsPage assetsPage = new AssetsPage(driver);
        Assert.assertEquals("Assets page is not displayed", "Assets", assetsPage.getPageTitle());
    }

}
