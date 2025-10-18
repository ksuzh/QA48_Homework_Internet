package herokuapp.theinternet.tests;

import herokkuapp.theinternet.pages.frames.FramesPage;
import herokkuapp.theinternet.pages.HomePage;
import herokkuapp.theinternet.pages.frames.IFramePage;
import herokkuapp.theinternet.pages.frames.NestedFramePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FramesTests extends TestBase{

    @BeforeMethod
    public void preconditions(){
        new HomePage(driver).getToFramesPage();
    }

    @Test
    public void iFramesTest(){
        new FramesPage(driver).clickiFrameLink();
        new IFramePage(driver).closeNotificationWindow()
                .verifyContentText("content");
    }

    @Test
    public void NestedFramesByNameTest(){
        new FramesPage(driver).clickNestedFramesLink();
        new NestedFramePage(driver).switchToNestedFrame()
                .verifySelectedNestedFrameByName("middle");

    }

}
