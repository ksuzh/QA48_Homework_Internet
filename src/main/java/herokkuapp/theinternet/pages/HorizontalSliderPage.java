package herokkuapp.theinternet.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class HorizontalSliderPage extends BasePage {
    public HorizontalSliderPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@class='sliderContainer']/input")
    WebElement slider;
    public HorizontalSliderPage moveSlider() {
        new Actions(driver).dragAndDropBy(slider, 10, 0).perform();
        return this;
    }

    public void verifySliderValue(String expectedValue) {
        Assert.assertEquals(slider.getAttribute("value"), expectedValue);
    }
}
