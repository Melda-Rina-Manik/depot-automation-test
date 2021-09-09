//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.ui.Select;
//import pages.DashboardPage;
//import pages.InboundPage;
//import pages.LoginPage;
//import pages.onboarding.OnboardingPage;
//import webdriver.WebDriverPool;
//
//import static webdriver.WebDriverPool.chromeDriver;
//import static webdriver.WebDriverPool.initializeWebDriver;
//
//public class InboundTest {
//    private OnboardingPage onboardingPage = new OnboardingPage();
//    private LoginPage loginPage = new LoginPage();
//    private DashboardPage dashboardPage = new DashboardPage();
//    private InboundPage inboundPage = new InboundPage();
//
//    @BeforeEach
//    public void initialize() {
//        initializeWebDriver();
//    }
//
//    @AfterEach
//    public void quit() {
//        WebDriverPool.quitWebDriver();
//    }
//
//    @Test
//    public void OnboardingWithValidData() {
//        loginPage.openPage();
//        loginPage.inputEmail("melda1234@vhiweb.com");
//        loginPage.inputPassword("Melda1234!");
//        loginPage.clickBtnMasuk();
//        dashboardPage.isOnPage();
//        boolean actual = dashboardPage.isOnPage();
//        Assertions.assertTrue(actual);
//        inboundPage.openPage();
//        inboundPage.inputNamaPengirim(" ");
//        inboundPage.inputNomorTelepon(" ");
//        inboundPage.clickTanggalKirim();
//        inboundPage.clickEstimasiTanggalTerima();
//        inboundPage.inputJasaPengiriman(" ");
//        inboundPage.inputNomorResi(" ");
//        inboundPage.addAttachment(" ");
//    }
//}
