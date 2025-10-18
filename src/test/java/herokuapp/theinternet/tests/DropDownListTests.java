package herokuapp.theinternet.tests;

import herokkuapp.theinternet.pages.DropDownListPage;
import herokkuapp.theinternet.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DropDownListTests extends TestBase{

    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getToDropdownListPage();
    }

    @Test
    public void dropDownListTest(){
        new DropDownListPage(driver).selectOption("Option 2")
                .verifySelectedOption("2");
    }
}
