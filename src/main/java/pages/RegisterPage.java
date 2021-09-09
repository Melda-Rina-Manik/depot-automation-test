package pages;

import org.openqa.selenium.By;

public class RegisterPage extends BasePageObject {
    public void openPage() {
        openUrl("http://depot-frontend.embrio.id/register");
    }

    public void inputEmail(String email) {

        type(By.name("email"), email);
    }

    public void inputNamaLengkap(String namaLengkap) {

        type(By.name("Nama"), namaLengkap);
    }

    public void inputNomorTelepon(String nomorTelepon) {
        type(By.name("Telepon"), nomorTelepon);
    }

    public void inputPassword(String password) {
        type(By.cssSelector("input[name='password']"), password);
    }

    public void inputConfirmationPassword(String confirmationPassword) {
        type(By.cssSelector("input[name='password_confirmation']"), confirmationPassword);
    }

    public void clickBtnDaftar() {
        click(By.id("register"));

    }

    public void clickLoginModal() {
        click(By.xpath("//a[contains(text(),'Kembali ke halaman Login')]"));
    }

    public String getErrorMessage(){
        return getText(By.xpath("//p[contains(text(),'Isian email sudah ada sebelumnya.')]"));
    }

    public String getErrorMessageEmail(){
        return getText(By.xpath("//span[contains(text(),'email harus diisi.')]"));
    }

    public String getErrorMessagePassword(){
        return getText(By.xpath("//span[contains(text(),'Sandi harus mengandung setidaknya 10 karakter, hur')]"));
    }
}