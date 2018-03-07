package com.tr.selenium.appManager;

import com.tr.selenium.model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactHelper extends HelperBase{

    public ContactHelper(WebDriver wd) {
        super(wd);
    }

    public void fillContactForm(ContactData contactData) {
        type(By.name("firstname"),contactData.getFirstname());
        type(By.name("lastname"),contactData.getLastname());
        type(By.name("home"),contactData.getHomePhoneNumber());
        type(By.name("address2"),contactData.getAddress());
    }

    public int getContactCount() {
        return wd.findElements(By.name("selected[]")).size();
    }

    public void submitContactCreation() {
        click(By.name("submit"));
    }

    public void returnToHomePage() {
        if(isElementPresent(By.id("maintable"))){
            return;
        }
        click(By.xpath("//a[@href='./']"));
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

    public void goToAddNewContactPage() {
        click(By.xpath("//a[@href='edit.php']"));
    }

    public boolean isContactExist() {
        return isElementPresent((By.name("selected[]")));
    }

    public void createContact() {
        goToAddNewContactPage();
        fillContactForm(new ContactData()
                .setFirstname("Vova")
                .setLastname("Levi")
                .setHomePhoneNumber("0549756968")
                .setAddress("ness ziona"));
        submitContactCreation();
        returnToHomePage();
    }
}
