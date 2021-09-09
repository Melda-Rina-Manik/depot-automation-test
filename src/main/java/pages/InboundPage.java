package pages;

import org.openqa.selenium.By;

public class InboundPage extends BasePageObject {
    public void openPage() {
        openUrl("http://depot-frontend.embrio.id/inbound/inbound-form");
    }

    public void inputNamaPengirim(String namapengirim){
        type(By.xpath("//input[@id='sender_name']"), namapengirim);
    }

    public void inputNomorTelepon(String nomortelepon){
        type(By.xpath("//input[@id='phone_number']"), nomortelepon);
    }

    public void clickTanggalKirim(){

    }
}

