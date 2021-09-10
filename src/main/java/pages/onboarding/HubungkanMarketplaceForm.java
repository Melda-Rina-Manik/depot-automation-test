package pages.onboarding;

import org.openqa.selenium.By;
import pages.BasePageObject;

public class HubungkanMarketplaceForm extends BasePageObject {
    public void inputPlatform(String platform) {
        selectByVisibleText(By.id("platform"), platform);
    }

    public void inputNamaPedagang(String namapedagang) {
        typeWithBackSpace(By.id("merchant_name"), namapedagang);
    }

    public void inputTautanToko(String tautantoko) {
        type(By.id("website_seller"), tautantoko);
    }

    public void clickTambahMarketplace() {
        click(By.xpath("//button[contains(text(),'Tambah Marketplace')]"));
    }
}
