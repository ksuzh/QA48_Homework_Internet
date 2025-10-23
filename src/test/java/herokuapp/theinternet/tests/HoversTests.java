package herokuapp.theinternet.tests;

import herokkuapp.theinternet.pages.HomePage;
import herokkuapp.theinternet.pages.HoversPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HoversTests extends TestBase{
    @BeforeMethod
    public void precondition(){
        new HomePage(driver).getToHoversPage();
    }

    @Test
    public void hoverTest(){
        new HoversPage(driver).hoverImageAndVerify(1, "user2");
    }
}
