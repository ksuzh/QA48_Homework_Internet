package herokkuapp.theinternet.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class AlertsPage extends BasePage {
    public AlertsPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//button[@onclick='jsAlert()']")
    WebElement jsAlert;
    public AlertsPage alertsJS() {
        jsAlert.click();
        return this;

    }

    public AlertsPage verifyAlertMsg(String alertMsg) {
        String actualMsg = driver.switchTo().alert().getText();
        Assert.assertTrue(actualMsg.contains(alertMsg));
        return this;
    }

    @FindBy(xpath = "//button[@onclick='jsConfirm()']")
    WebElement jsConfirm;
    public AlertsPage alertsConfirmJS(String confirmRes) {
        jsConfirm.click();
        if(confirmRes != null && confirmRes.equals("Ok")) {
            driver.switchTo().alert().accept();
        }else if(confirmRes != null && confirmRes.equals("Cancel")) {
            driver.switchTo().alert().dismiss();
        }
        return this;
    }

    @FindBy(id = "result")
    WebElement result;
    public AlertsPage verifyResult(String res) {
        Assert.assertTrue(result.getText().contains(res));
        return this;
    }

    @FindBy(xpath = "//button[@onclick='jsPrompt()']")
    WebElement jsPrompt;
    public AlertsPage alertsPromptMsg(String promptMsg) {
        if(promptMsg != null) {
            jsPrompt.click();
            driver.switchTo().alert().sendKeys(promptMsg);
            driver.switchTo().alert().accept();
        }
        return this;
    }

}
