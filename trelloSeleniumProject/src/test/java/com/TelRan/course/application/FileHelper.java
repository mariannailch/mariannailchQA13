package com.TelRan.course.application;

import com.TelRan.course.model.FileData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileHelper extends HelperBase{
    public FileHelper(WebDriver wd) {
        super(wd);
    }

    public void addAttachment(FileData fileData){
        attach(By.xpath("//input[@class='js-upload-avatar']"),fileData.getPhoto());
    }

    public void clickOnProfileIcon() {
        wd.findElement(By.xpath("//span[@class='member-initials']")).click();
    }

    public void clickProfile() {
        wd.findElement(By.xpath("//a[@class='js-profile']")).click();
    }

    public void clickChangePhoto() {
        wd.findElement(By.xpath("//span[@class='profile-image-initials']")).click();
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
        wd.findElement(By.xpath("//a[@class='comment-box-options-item js-comment-add-attachment']")).click();
    }

    public void clickAddNewCard() {
        wd.findElement(By.xpath("//input[@class='primary confirm mod-compact js-add-card']")).click();
    }

}
