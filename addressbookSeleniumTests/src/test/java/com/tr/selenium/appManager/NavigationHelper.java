package com.tr.selenium.appManager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class NavigationHelper extends HelperBase {
    public NavigationHelper(WebDriver wd) {
        super(wd);
    }

    public void goToAddNewContactPage() {
        if(isElementPresent(By.tagName("h1")) && wd.findElement(By.tagName("h1")).getText().equals("Edit / add address book entry"
        ) && isElementPresent(By.name("submit"))){
            return;
        }
        click(By.xpath("//a[@href='edit.php']"));
    }

    public void goToGroupsPage() {
        if (isElementPresent(By.tagName("h1")) && wd.findElement(By.tagName("h1")).getText().equals("Groups"
        ) && isElementPresent(By.name("new"))) {
            return;
        }
        click(By.linkText("groups"));
    }
}
