package com.tr.selenium.appManager;

import com.tr.selenium.model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    private GroupHelper groupHelper;
    private SessionHelper sessionHelper;
    FirefoxDriver wd;

    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    public void start() {
        wd = new FirefoxDriver(new FirefoxOptions().setLegacy(true));
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        groupHelper = new GroupHelper(wd);
        sessionHelper = new SessionHelper(wd);
        openSite();
        sessionHelper.login("admin", "secret");
    }

    public void goToGroupsPage() {
        wd.findElement(By.linkText("groups")).click();
    }



    public void openSite() {
        wd.get("http://localhost/addressbook/");
    }

    public void stop() {
        wd.quit();
    }

    public void goToAddNewContactPage() {
        wd.findElement(By.xpath("//a[@href='edit.php']")).click();
    }

    public void fillContactForm(ContactData contactData) {
        wd.findElement(By.name("firstname")).click();
        wd.findElement(By.name("firstname")).clear();
        wd.findElement(By.name("firstname")).sendKeys(contactData.getFirstname());
        wd.findElement(By.name("lastname")).click();
        wd.findElement(By.name("lastname")).clear();
        wd.findElement(By.name("lastname")).sendKeys(contactData.getLastname());
        wd.findElement(By.name("home")).click();
        wd.findElement(By.name("home")).clear();
        wd.findElement(By.name("home")).sendKeys(contactData.getHomePhoneNumber());
        wd.findElement(By.name("address2")).click();
        wd.findElement(By.name("address2")).clear();
        wd.findElement(By.name("address2")).sendKeys(contactData.getAddress());


    }

    public void submitContactCreation() {
        wd.findElement(By.name("submit")).click();
    }

    public void returnToHomePage() {
        wd.findElement(By.xpath("//img[@id='logo']")).click();
    }

    public void clickUpdateButton() {
        wd.findElement(By.name("update")).click();
    }

    public void clickEditButton() {
        wd.findElement(By.xpath("//img[@src='icons/pencil.png']")).click();
    }

    public void chooseContact() {
        wd.findElement(By.name("selected[]")).click();
    }

    public void deleteContact() {
        wd.findElement(By.xpath("//html//div[2]/input[1]")).click();
        wd.switchTo().alert().accept();
    }

    public GroupHelper getGroupHelper() {
        return groupHelper;
    }

    public SessionHelper getSessionHelper() {
        return sessionHelper;
    }
}
