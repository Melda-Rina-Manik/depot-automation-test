package pages.onboarding;

import org.openqa.selenium.By;
import pages.BasePageObject;

public class DataBarangForm extends BasePageObject {
    public void selectQuestionOne(boolean isYes) {
        waitABit(1);
        if (isYes) {
            click(By.xpath("//input[@name='q1' and @value='1']/following-sibling::label"));
        } else {
            click(By.xpath("//input[@name='q1' and @value='0']/following-sibling::label"));
        }
    }

    public void selectQuestionsTwo(boolean isYes) {
        waitABit(1);
        if (isYes) {
            click(By.xpath("//input[@name='q2' and @value='1']/following-sibling::label"));
        } else {
            click(By.xpath("//input[@name='q2' and @value='0']/following-sibling::label"));
        }
    }

    public void selectQuestionThree(boolean isYes) {
        waitABit(1);
        if (isYes) {
            click(By.xpath("//input[@name='q3' and @value='1']/following-sibling::label"));
        } else {
            click(By.xpath("//input[@name='q3' and @value='0']/following-sibling::label"));
        }
    }

    public void selectQuestionFour(boolean isYes) {
        waitABit(1);
        if (isYes) {
            click(By.xpath("//input[@name='q4' and @value='1']/following-sibling::label"));
        } else {
            click(By.xpath("//input[@name='q4' and @value='0']/following-sibling::label"));
        }
    }

    public void inputSKU(Integer sku) {
        waitABit(3);
        typeWithBackSpace(By.name("sku"), sku.toString());
    }
}