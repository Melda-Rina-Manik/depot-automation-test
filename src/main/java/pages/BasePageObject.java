package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import webdriver.WebDriverPool;

public class BasePageObject {

  public ChromeDriver getDriver() {

    return WebDriverPool.chromeDriver;
  }

  public WebElement find(By by) {

    return waitUntilPresent(by, 5);
  }

  public void click(By by) {

    find(by).click();
  }

  public void type(By by, String text) {
    //locator
    WebElement element = find(by);
    //looping sampai field kosong
    element.clear();
    //text
    element.sendKeys(text);
  }

  public void typeWithBackSpace(By by, String text) {
    //locator
    WebElement element = find(by);
    element.click();
    element.sendKeys(Keys.DOWN);
    //looping sampai field kosong
    while (!element.getAttribute("value").isEmpty()) {
      element.sendKeys(Keys.BACK_SPACE);
    }
    element.sendKeys(text);
  }

  public WebElement waitUntilPresent(By by, Integer timeoutInSecond) {
    WebDriverWait wait = new WebDriverWait(getDriver(), timeoutInSecond);
    return wait.until(ExpectedConditions.presenceOfElementLocated(by));
  }

  public String getText(By by) {
    return find(by).getText();

  }

  public void openUrl(String url) {
    getDriver().get(url);
  }

  public void selectFile(By by, String filepath) {
    WebElement uploadLogo = getDriver().findElement(by);
    uploadLogo.sendKeys(filepath);
  }

  public void selectByVisibleText(By by, String text) {
    Select select = new Select(find(by));
    select.selectByVisibleText(text);
  }

  public void waitABit(Integer waitInSecond) {
    try {
      Thread.sleep(waitInSecond * 1000);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
