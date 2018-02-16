import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

import java.util.concurrent.TimeUnit;
import java.util.Date;
import java.io.File;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.*;
import static org.openqa.selenium.OutputType.*;

public class CreateNewBoard extends TestBase {
    @Test
    public void LoginTrelloTest() {
        clickLogInButton();
        enterUserName("elena.telran@yahoo.com");
        enterPassword("12345.com");
        confirmLogInButton();
    }
    @Test
    public void createNewBoard() {
      wd.findElement(By.xpath("//div[@class='js-react-root']//span[.='Create new board…']")).click();
        wd.findElement(By.cssSelector("input.subtle-input")).click();
        wd.findElement(By.cssSelector("input.subtle-input")).clear();
        wd.findElement(By.cssSelector("input.subtle-input")).sendKeys("newBoard");
        wd.findElement(By.cssSelector("button.primary")).click();
    }

    }

