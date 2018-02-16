import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;

public class LoginTrelloTest extends TestBase {

    @Test(priority = 1)
    public void LoginTrelloTest() {
        clickLogInButton();
        enterUserName("elena.telran@yahoo.com");
        enterPassword("12345.com");
        confirmLogInButton();
        logOut();
    }

    @Test
    public void LoginTrelloTestNotValid() {
        clickLogInButton();
        enterUserName("11111");
        enterPassword("12345.com");
        confirmLogInButton();
    }

    @Test(priority = 2)
    public void LoginTrelloTestEmptyFields() {
        clickLogInButton();
        enterUserName("");
        enterPassword("");
        confirmLogInButton();

    }


}