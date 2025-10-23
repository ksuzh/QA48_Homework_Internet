package herokkuapp.theinternet.pages;

import herokkuapp.theinternet.pages.frames.FramesPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {


    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[@href='/javascript_alerts']")
    WebElement alertsLink;
    public AlertsPage getToAlertsPage() {
        click(alertsLink);
        return new AlertsPage(driver);
    }

    @FindBy(xpath = "//a[@href='/frames']")
    WebElement framesLink;
    public FramesPage getToFramesPage() {
        click(framesLink);
        return new FramesPage(driver);
    }

    @FindBy(xpath = "//a[@href='/windows']")
    WebElement windowsLink;
    public MultipleWindowPage getToMultiplyWindowsPage() {
        click(windowsLink);
        return new MultipleWindowPage(driver);
    }

    @FindBy(xpath = "//a[@href='/dropdown']")
    WebElement dropdownLink;
    public DropDownListPage getToDropdownListPage() {
        click(dropdownLink);
        return new DropDownListPage(driver);
    }

    @FindBy(xpath = "//a[@href='/horizontal_slider']")
    WebElement horizontalSliderLink;
    public HorizontalSliderPage getToSliderPage() {
        click(horizontalSliderLink);
        return new HorizontalSliderPage(driver);
    }

    @FindBy(xpath = "//a[@href='/hovers']")
    WebElement hoversLink;
    public HoversPage getToHoversPage() {
        click(hoversLink);
        return new HoversPage(driver);
    }
}
