package herokkuapp.theinternet.pages.frames;

import herokkuapp.theinternet.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class NestedFramePage extends BasePage {
    public NestedFramePage(WebDriver driver) {
        super(driver);
    }


    public NestedFramePage switchToNestedFrame() {
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame(1);
        return this;
    }

    @FindBy(tagName = "body")
    WebElement body;
    public NestedFramePage verifySelectedNestedFrameByName(String frameName) {
        Assert.assertTrue(body.getText().toLowerCase().contains(frameName));
        return this;
    }
}
