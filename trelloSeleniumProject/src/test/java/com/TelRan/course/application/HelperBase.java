package com.TelRan.course.application;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;


public class HelperBase {
    WebDriver wd;


    public HelperBase(WebDriver wd) {
        this.wd = wd;
    }

    public static boolean isAlertPresent(WebDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    public void attach(By locator, File file) {
        if(file!=null) {
            wd.findElement(locator).sendKeys(file.getAbsolutePath());
        }
    }
}
