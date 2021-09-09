import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.DashboardPage;
import pages.LoginPage;
import webdriver.WebDriverPool;

import static webdriver.WebDriverPool.initializeWebDriver;

public class LoginTest {
    private LoginPage loginPage = new LoginPage();
    private DashboardPage dashboardPage = new DashboardPage();

    @BeforeEach
    public void initialize() {
        initializeWebDriver();
    }

    @AfterEach
    public void quit() {
        WebDriverPool.quitWebDriver();
    }

    @Test
    public void loginWithValidData() {
        loginPage.openPage();
        loginPage.inputEmail("melda@vhiweb.com");
        loginPage.inputPassword("Melda1234!");
        loginPage.clickBtnMasuk();
        boolean actual = dashboardPage.isOnPage();
        Assertions.assertTrue(actual);
    }

    @Test
    public void loginWithInValidData() {
        loginPage.openPage();
        loginPage.inputEmail("melda@vhiweb.com");
        loginPage.inputPassword("Melda12345!");
        loginPage.clickBtnMasuk();
        String actual = loginPage.getErrorMessage();
        Assertions.assertEquals("Password atau Email yang anda masukkan salah", actual);
    }
}