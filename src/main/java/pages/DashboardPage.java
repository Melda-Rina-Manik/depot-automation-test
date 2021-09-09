package pages;

import org.openqa.selenium.By;

public class DashboardPage extends BasePageObject {
    public boolean isOnPage() {
        return waitUntilPresent(By.xpath("//h5[contains(text(),'Dashboard')]"),
                15)
                .isDisplayed();
    }
}