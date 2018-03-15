package com.TelRan.course.application;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SessionHelper extends HelperBase {
    public SessionHelper(WebDriver wd) {
        super(wd);
    }

    public void confirmLogInButton() {
        wd.findElement(By.id("login")).click();
    }

    public void enterPassword(String pwd) {
        wd.findElement(By.id("password")).click();
        wd.findElement(By.id("password")).clear();
        wd.findElement(By.id("password")).sendKeys(pwd());
    }

    public String pwd() {
        return "12345.com";
    }

    public void enterUserName(String userName) {
        wd.findElement(By.id("user")).click();
        wd.findElement(By.id("user")).clear();
        wd.findElement(By.id("user")).sendKeys(userName);
    }

    public void clickLogInButton() {
        wd.findElement(By.xpath("//a[@href='/login']")).click();
    }

    public void login(String user, String pwd){
        clickLogInButton();
        enterUserName(user);
        enterPassword(pwd);
        confirmLogInButton();
    }

    public void logOut() {
        wd.findElement(By.cssSelector("span.member-initials")).click();
        wd.findElement(By.cssSelector("a.js-logout")).click();

    }


}
