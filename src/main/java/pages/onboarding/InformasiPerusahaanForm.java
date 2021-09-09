package pages.onboarding;

import org.openqa.selenium.By;
import pages.BasePageObject;

public class InformasiPerusahaanForm extends BasePageObject {
    public boolean isOnPage() {
        return waitUntilPresent(By.xpath("//p[contains(text(),'Mohon lengkapi form pendaftaran seller di bawah in')]"),
                15)
                .isDisplayed();
    }

    public void inputNamaPerusahaan(String namaperusahaan) {
        type(By.name("Nama"), namaperusahaan);
    }

    public void inputNPWP(String npwp) {
        type(By.name("Npwp"), npwp);
    }

    public void inputWebsite(String website) {
        type(By.xpath("//input[@placeholder='https://..']"), website);
    }

    public void inputLogo(String filepath) {
        selectFile(By.id("logo"), filepath);
    }

    public void inputAlamatPerusahaan(String alamatperusahaan) {
        type(By.xpath("//textarea[@id='company']"), alamatperusahaan);
    }

    public void selectProvinsi(String provinsi) {
        selectByVisibleText(By.id("province"), provinsi);
    }

    public void selectKota(String kota) {
        selectByVisibleText(By.id("city"), kota);
    }

    public void inputKodePos(String kodepos) {
        type(By.xpath("//input[@id='pos']"), kodepos);
    }

    public void inputNomorTelepon(String nomortelepon) {
        type(By.xpath("//input[@id='phone']"), nomortelepon);
    }

    public void inputEmailPerusahaan(String emailperusahaan) {
        type(By.xpath("//input[@id='companyEmail']"), emailperusahaan);
    }

    public void inputFax(String fax) {
        type(By.xpath("//input[@name='fax']"), fax);
    }

    public void clickSelanjutnya() {
        click(By.xpath("//button[contains(text(),'Next')]"));
    }
}
