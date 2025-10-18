package herokkuapp.theinternet.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

public class MultipleWindowPage extends BasePage{
    public MultipleWindowPage(WebDriver driver) {
        super(driver);
    }


    @FindBy(xpath = "//a[@href='/windows/new']")
    WebElement newWindowButton;
    public MultipleWindowPage switchToNewWindow(int ind) {
        click(newWindowButton);
        List<String>windows = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(windows.get(1));
        return this;
    }

    @FindBy(xpath = "//h3[.='New Window']")
    WebElement newWindowTitle;
    public MultipleWindowPage verifyNewWindowText() {
        Assert.assertTrue(newWindowTitle.getText().contains("New Window"));
        return this;
    }
}
