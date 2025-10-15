package herokkuapp.theinternet.pages.frames;

import herokkuapp.theinternet.pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FramesPage extends BasePage {
    public FramesPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@href='/iframe']")
    WebElement iframe;
    public IFramePage clickiFrameLink() {
        click(iframe);
        return new IFramePage(driver);
    }

    @FindBy(xpath = "//a[@href='/nested_frames']")
    WebElement nestedFrame;
    public NestedFramePage clickNestedFramesLink() {
        click(nestedFrame);
        return new NestedFramePage(driver);
    }
}
