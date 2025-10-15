package herokkuapp.theinternet.pages.frames;

import herokkuapp.theinternet.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class IFramePage extends BasePage {
    public IFramePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(tagName = "p")
    WebElement frameTxt;
    public IFramePage verifyContentText(String text) {
        driver.switchTo().frame("mce_0_ifr");
        Assert.assertTrue(frameTxt.getText().contains(text));
        return this;
    }

    @FindBy(tagName = "button")
    WebElement buttonClose;
    public IFramePage closeNotificationWindow() {
        buttonClose.click();
        return this;
    }
}
