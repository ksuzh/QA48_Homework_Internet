package herokuapp.theinternet.tests;

import herokkuapp.theinternet.pages.AlertsPage;
import herokkuapp.theinternet.pages.HomePage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AlertsTests extends TestBase{

    @BeforeMethod
    public void ensurePrecondition(){
        new HomePage(driver).getToAlertsPage();
    }

    @Test
    public void alertsJSTest(){
        new AlertsPage(driver).alertsJS()
                .verifyAlertMsg("I am a JS Alert");

    }

    @Test
    public void alertsJSConfirmTest(){
        new AlertsPage(driver).alertsConfirmJS("Ok")
                .verifyResult("Ok");
    }

    @Test
    public void alertsJSPromptTest(){
        new AlertsPage(driver).alertsPromptMsg("confirmed")
                .verifyResult("confirmed");

    }




}
