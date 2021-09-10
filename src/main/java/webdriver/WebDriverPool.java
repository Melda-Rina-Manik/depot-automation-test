package webdriver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverPool {
    public static ChromeDriver chromeDriver;
    public static void  initializeWebDriver(){
        WebDriverManager.chromedriver().setup();
        chromeDriver = new ChromeDriver();
        chromeDriver.manage().window().maximize();
    }
    public static void quitWebDriver(){
        chromeDriver.quit();
    }
}
