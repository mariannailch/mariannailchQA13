package com.tr.selenium.appManager;

import com.tr.selenium.model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ContactHelper extends HelperBase{

    public ContactHelper(FirefoxDriver wd) {
        super(wd);
    }
    public void goToAddNewContactPage() {
        click(By.xpath("//a[@href='edit.php']"));
    }

    public void fillContactForm(ContactData contactData) {
        type(By.name("firstname"),contactData.getFirstname());
        type(By.name("lastname"),contactData.getLastname());
        type(By.name("home"),contactData.getHomePhoneNumber());
        type(By.name("address2"),contactData.getAddress());
    }

    public void submitContactCreation() {
        click(By.name("submit"));
    }

    public void returnToHomePage() {
        click(By.xpath("//img[@id='logo']"));
    }

    public void clickUpdateButton() {
        click(By.name("update"));
    }

    public void clickEditButton() {
       click(By.xpath("//img[@src='icons/pencil.png']"));
    }

    public void chooseContact() {
        click(By.name("selected[]"));
    }

    public void deleteContact() {
        click(By.xpath("//html//div[2]/input[1]"));
        wd.switchTo().alert().accept();
    }

}
