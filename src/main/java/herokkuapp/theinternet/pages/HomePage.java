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
        alertsLink.click();
        return new AlertsPage(driver);
    }

    @FindBy(xpath = "//a[@href='/frames']")
    WebElement framesLink;
    public FramesPage getToFramesPage() {
        framesLink.click();
        return new FramesPage(driver);
    }
}
