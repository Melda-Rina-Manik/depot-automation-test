package pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePageObject {
    public void openPage() {
        openUrl("http://depot-frontend.embrio.id/login");
    }

    public void inputEmail(String email) {

        type(By.id("email"), email);
    }

    public void inputPassword(String password) {

        type(By.cssSelector("input[data-vv-name='password']"), password);
    }

    public void clickBtnMasuk() {

        click(By.xpath("//button[contains(text(),'Masuk')]"));
    }

    public String getErrorMessage() {
        return getText(By.cssSelector("small[class='text-danger']"));
    }

}