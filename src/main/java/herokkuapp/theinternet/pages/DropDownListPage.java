package herokkuapp.theinternet.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class DropDownListPage extends BasePage {
    public DropDownListPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(id = "dropdown")
    WebElement dropdownMenu;
    public DropDownListPage selectOption(String option) {
        Select dropdown = new Select(dropdownMenu);
        dropdown.selectByVisibleText(option);
        return this;
    }

    public DropDownListPage verifySelectedOption(String expectedOption) {
        String selectedOption = new Select(dropdownMenu).getFirstSelectedOption().getText();
//        Assert.assertEquals(expectedOption, selectedOption);
        Assert.assertTrue(selectedOption.contains(expectedOption));
        return this;
    }
}
