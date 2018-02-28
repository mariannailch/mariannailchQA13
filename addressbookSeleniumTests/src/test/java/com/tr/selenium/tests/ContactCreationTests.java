package com.tr.selenium.tests;

import com.tr.selenium.model.ContactData;
import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase {
    @Test
    public void contactCreationTest(){
        app.getContactHelper().goToAddNewContactPage();
        app.getContactHelper().fillContactForm(new ContactData()
                .setFirstname("Vova")
                .setLastname("Levi")
                .setHomePhoneNumber("0549756968")
                .setAddress("ness ziona"));
        app.getContactHelper().submitContactCreation();
        app.getContactHelper().returnToHomePage();

    }
}

