package herokuapp.theinternet.tests;

import herokkuapp.theinternet.pages.HomePage;
import herokkuapp.theinternet.pages.MultipleWindowPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MultipleWindowTests extends TestBase{

    @BeforeMethod
    public void precondition() {
        new HomePage(driver).getToMultiplyWindowsPage();
    }

    @Test
    public void multipleWindowsTest() {
        new MultipleWindowPage(driver).switchToNewWindow(1)
                .verifyNewWindowText();
    }
}
