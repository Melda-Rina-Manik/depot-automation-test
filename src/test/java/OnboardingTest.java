import static webdriver.WebDriverPool.initializeWebDriver;

import java.io.File;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pages.LoginPage;
import pages.onboarding.DataBarangForm;
import pages.onboarding.HubungkanMarketplaceForm;
import pages.onboarding.InformasiPerusahaanForm;
import pages.onboarding.OnboardingPage;
import webdriver.WebDriverPool;

public class OnboardingTest {

    private InformasiPerusahaanForm informasiPerusahaanForm = new InformasiPerusahaanForm();
    private LoginPage loginPage = new LoginPage();
    private HubungkanMarketplaceForm hubungkanMarketplaceForm = new HubungkanMarketplaceForm();
    private DataBarangForm dataBarangForm = new DataBarangForm();
    private OnboardingPage onboardingPage = new OnboardingPage();

    @BeforeEach
    public void initialize() {
        initializeWebDriver();
    }

    @AfterEach
    public void quit() {
        WebDriverPool.quitWebDriver();
    }

    @Test
    public void OnboardingWithValidData() {
        loginPage.openPage();
        loginPage.inputEmail("melda1234@vhiweb.com");
        loginPage.inputPassword("Melda1234!");
        loginPage.clickBtnMasuk();
        informasiPerusahaanForm.isOnPage();
        informasiPerusahaanForm.waitABit(3);
        informasiPerusahaanForm.inputNamaPerusahaan("PT Melda's Beauty Skincare");
        informasiPerusahaanForm.inputNPWP("123456789012345");
        informasiPerusahaanForm.inputWebsite("http://melda.com");
        String filepath = System.getProperty("user.dir") + File.separator + "data" + File.separator + "1.jpeg";
        informasiPerusahaanForm.inputLogo(filepath);
        informasiPerusahaanForm.inputAlamatPerusahaan("Tebet");
        informasiPerusahaanForm.selectProvinsi("Jakarta");
        informasiPerusahaanForm.selectKota("Kota Administrasi Jakarta Utara");
        informasiPerusahaanForm.inputKodePos("22212");
        informasiPerusahaanForm.inputNomorTelepon("082293957899");
        informasiPerusahaanForm.inputEmailPerusahaan("melda@vhiweb.com");
        informasiPerusahaanForm.inputFax("22212");
        onboardingPage.clickSelanjutnya();

        //hubungkan marketplacese
        hubungkanMarketplaceForm.clickTambahMarketplaces();
        hubungkanMarketplaceForm.inputPlatform("Tokopedia");
        hubungkanMarketplaceForm.inputNamaPedagang("melda");
        hubungkanMarketplaceForm.inputTautanToko("https://melda.com");
        hubungkanMarketplaceForm.clickTambahMarketplace();
        hubungkanMarketplaceForm.clickMasterData();
        onboardingPage.clickSelanjutnya();

        //Data Barang
        dataBarangForm.selectQuestionOne(false);
        dataBarangForm.selectQuestionsTwo(true);
        dataBarangForm.selectQuestionThree(true);
        dataBarangForm.selectQuestionFour(false);
        dataBarangForm.inputSKU(1);

    }
}
