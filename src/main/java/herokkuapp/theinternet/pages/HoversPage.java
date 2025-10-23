package herokkuapp.theinternet.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class HoversPage extends BasePage {
    public HoversPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = ".figure img")
    List<WebElement> figures;

    @FindBy(css = ".figure h5")
    List<WebElement> names;

    public HoversPage hoverImageAndVerify(int index, String userName) {
        new Actions(driver).moveToElement(figures.get(index)).perform();
        String actualName = names.get(index).getText();
        Assert.assertTrue(actualName.contains(userName));
        return this;
    }

}
