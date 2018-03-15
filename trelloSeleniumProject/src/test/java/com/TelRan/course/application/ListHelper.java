package com.TelRan.course.application;

import com.TelRan.course.model.ListData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.File;

public class ListHelper extends HelperBase {
    public ListHelper(WebDriver wd) {
        super(wd);
    }

    File photo;

    public File getPhoto() {
        return photo;
    }

    public ListHelper setPhoto(File photo) {
        this.photo = photo;
        return this;
    }

    public void enterNewListName(ListData listData) {
        wd.findElement(By.xpath("//textarea[@class='list-header-name mod-list-name js-list-name-input']")).clear();
        wd.findElement(By.xpath("//textarea[@class='list-header-name mod-list-name js-list-name-input']")).sendKeys(listData.getNewname());
    }

    public void selectListTitle() {
        wd.findElement(By.xpath("//div[@class='list-header-target js-editing-target']")).click();

    }

    public void enterListName(ListData listData) {
        wd.findElement(By.xpath("//input[@class='list-name-input']")).click();
        wd.findElement(By.xpath("//input[@class='list-name-input']")).clear();
        wd.findElement(By.xpath("//input[@class='list-name-input']")).sendKeys(listData.getName());
    }

    public void clickAddList() {
        wd.findElement(By.cssSelector("span.placeholder.js-open-add-list")).click();
    }

    public void clickSaveButton() {
        wd.findElement(By.xpath("//input[@class='primary mod-list-add-button js-save-edit']")).click();
    }

    public void clickArchiveThisList() {
        wd.findElement(By.cssSelector("a.js-close-list")).click();
    }

    public void clickListMenuButton() {
        wd.findElement(By.xpath("//span[@class='icon-sm icon-overflow-menu-horizontal']")).click();
    }
    public void addAttachment(ListData listData){
        attach(By.xpath("//li[@class='uploader']"),listData.getPhoto());
    }

    public void addNewCard() {
        wd.findElement(By.xpath("//a[@class='open-card-composer js-open-card-composer']")).click();
        wd.findElement((By.xpath("//textarea[@class='list-card-composer-textarea js-card-title']"))).clear();
        wd.findElement((By.xpath("//textarea[@class='list-card-composer-textarea js-card-title']"))).sendKeys("card");
    }

    public void clickOnCard() {
        wd.findElement(By.xpath("//span[@class='list-card-title js-card-name']")).click();
    }

    public void clickOnAttachments() {
        wd.findElement(By.xpath("//a[@class='button-link js-attach']")).click();
    }

    public void clickAddNewCard() {
        wd.findElement(By.xpath("//input[@class='primary confirm mod-compact js-add-card']")).click();
    }
}
