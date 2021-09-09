import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.RegisterPage;
import webdriver.WebDriverPool;

import static webdriver.WebDriverPool.initializeWebDriver;

public class RegisterTest {
    private RegisterPage registerPage = new RegisterPage();
//    private LoginModal loginModal = new LoginModal();

    @BeforeEach
    public void initialize() {
        initializeWebDriver();

    }

    @AfterEach
    public void quit() {
        WebDriverPool.quitWebDriver();
    }

    @Test
    public void RegistrationWithValidData() {
        registerPage.openPage();
        registerPage.inputEmail("meldarina@vhiweb.com");
        registerPage.inputNamaLengkap("Melda Rina Manik");
        registerPage.inputNomorTelepon("082293957899");
        registerPage.inputPassword("Melda1234!");
        registerPage.inputConfirmationPassword("Melda1234!");
        registerPage.clickBtnDaftar();
        registerPage.clickLoginModal();
    }

    @Test
    public void RegistrationWithInValidData() {
        registerPage.openPage();
        registerPage.inputEmail("meldarina@vhiweb.com");
        registerPage.inputNamaLengkap("Melda Rina Manik");
        registerPage.inputNomorTelepon("082293957899");
        registerPage.inputPassword("Melda1234!");
        registerPage.inputConfirmationPassword("Melda1234!");
        registerPage.clickBtnDaftar();
        String actual = registerPage.getErrorMessage();
        Assertions.assertEquals("Isian email sudah ada sebelumnya.", actual);
    }

    @Test
    public void RegistrationWithInvalidDataEmail(){
        registerPage.openPage();
        registerPage.inputEmail(" ");
        registerPage.inputNamaLengkap("Melda Rina Manik");
        registerPage.inputNomorTelepon("082293957899");
        registerPage.inputPassword("Melda1234!");
        registerPage.inputConfirmationPassword("Melda1234!");
        registerPage.clickBtnDaftar();
        String actual = registerPage.getErrorMessageEmail();
        Assertions.assertEquals("email harus diisi.", actual);
    }

    @Test
    public void RegistrationNothingValidatePassword(){
        registerPage.openPage();
        registerPage.inputEmail("melda@vhiweb.com");
        registerPage.inputNamaLengkap("Melda Rina Manik");
        registerPage.inputNomorTelepon("082293957899");
        registerPage.inputPassword("melda1234!");
        registerPage.inputConfirmationPassword("melda1234!");
        registerPage.clickBtnDaftar();
        String actual = registerPage.getErrorMessagePassword();
        Assertions.assertEquals("Sandi harus mengandung setidaknya 10 karakter, huruf kapital, angka, dan spesial karakter", actual);
    }

}