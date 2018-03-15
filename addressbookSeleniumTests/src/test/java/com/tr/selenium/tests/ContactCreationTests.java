package com.tr.selenium.tests;

import com.tr.selenium.model.ContactData;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;

public class ContactCreationTests extends TestBase {
    @Test
    public void contactCreationTest(){
        app.getNavigationHelper().goToHomePage();
        if(!app.getContactHelper().isContactExist()){
            app.getContactHelper().createContact();
        }
        int before = app.getContactHelper().getContactCount();
        app.getNavigationHelper().goToAddNewContactPage();
        File photo = new File("C:\\Users\\User\\Documents\\GitHub\\mariannailchQA13\\addressbookSeleniumTests\\src\\test\\resources\\2014-03-22 10.57.26.jpg");
        app.getContactHelper().fillContactForm(new ContactData()
                .setFirstname("Vova")
                .setLastname("Levi")
                .setHomePhoneNumber("0549756968")
                .setAddress("ness ziona")
                .setGroup("dds")
        .setPhoto(photo));
        app.getContactHelper().submitContactCreation();
        app.getContactHelper().returnToHomePage();
        int after = app.getContactHelper().getContactCount();
        Assert.assertEquals(after, before+1);

    }
}

