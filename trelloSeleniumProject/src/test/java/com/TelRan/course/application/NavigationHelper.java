package com.TelRan.course.application;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends HelperBase {
    public NavigationHelper(WebDriver wd) {
        super(wd);
    }

    public void returnToHomePage() {
        wd.findElement(By.xpath("//a[@class='header-logo js-home-via-logo']")).click();
    }
}
