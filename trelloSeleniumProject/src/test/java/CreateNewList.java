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

public class CreateNewList extends TestBase {

    @Test
    public void CreateNewList() {
        clickLogInButton();
        enterUserName("elena.telran@yahoo.com");
        enterPassword("12345.com");
        confirmLogInButton();
        selectBoard();
        clickAddList();
        enterListName("newList");
        clickSaveButton();

    }

    private void enterListName(String name) {
        wd.findElement(By.xpath("//input[@class='list-name-input']")).click();
        wd.findElement(By.xpath("//input[@class='list-name-input']")).clear();
        wd.findElement(By.xpath("//input[@class='list-name-input']")).sendKeys(name);
    }

    private void selectBoard() {
        wd.findElement(By.xpath("//html//li[11]/a[1]/span[2]")).click();
    }
    private void clickAddList() {
        wd.findElement(By.xpath("//span[@class='placeholder js-open-add-list']")).click();
    }
    private void clickSaveButton() {
        wd.findElement(By.xpath("//input[@class='primary mod-list-add-button js-save-edit']")).click();
    }
}
