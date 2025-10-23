package herokuapp.theinternet.tests;

import herokkuapp.theinternet.pages.HomePage;
import herokkuapp.theinternet.pages.HorizontalSliderPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HorizontalSliderTest extends TestBase{

    @BeforeMethod
    public void preCondition(){
        new HomePage(driver).getToSliderPage();
    }

    @Test
    public void horizontalSliderTest(){
        new HorizontalSliderPage(driver).moveSlider()
                .verifySliderValue("3");

    }
}
