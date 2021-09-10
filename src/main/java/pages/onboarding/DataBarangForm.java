package pages.onboarding;

import org.openqa.selenium.By;
import pages.BasePageObject;

public class DataBarangForm extends BasePageObject {
    public void selectQuestionOne(boolean isYes) {
        if (isYes) {
            click(By.xpath("//input[@name='q1' and @value='1']/ancestor::div[contains(@class,'custom-radio')]"));
        } else {
            click(By.xpath("//input[@name='q1' and @value='0']/ancestor::div[contains(@class,'custom-radio')]"));
        }
    }

    public void selectQuestionsTwo(boolean isYes) {
        if (isYes) {
            click(By.cssSelector("input[name='q2'][value='1']"));
        } else {
            click(By.cssSelector("input[name='q2'][value='0']"));
        }
    }

    public void selectQuestionThree(boolean isYes) {
        if (isYes) {
            click(By.cssSelector("input[name='q3'][value='1']"));
        } else {
            click(By.cssSelector("input[name='q3'][value='0']"));
        }
    }

    public void selectQuestionFour(boolean isYes) {
        if (isYes) {
            click(By.cssSelector("input[name='q4'][value='1']"));
        } else {
            click(By.cssSelector("input[name='q4'][value='0']"));
        }
    }

    public void inputSKU(Integer sku){
        type(By.name("sku"), sku.toString());
    }
}