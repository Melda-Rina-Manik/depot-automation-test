package pages.onboarding;

import org.openqa.selenium.By;
import pages.BasePageObject;

public class OnboardingPage extends BasePageObject {
    public void clickSelanjutnya() {
        click(By.xpath("//button[contains(text(),'Next')]"));
    }
}
