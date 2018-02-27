package com.tr.selenium.tests;

import com.tr.selenium.model.ContactData;
import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase {
    @Test
    public void contactCreationTest(){
        app.goToAddNewContactPage();
        app.fillContactForm(new ContactData()
                .setFirstname("Vasya")
                .setLastname("Pupkin")
                .setHomePhoneNumber("0549785768")
                .setAddress("rehovot"));
        app.submitContactCreation();
        app.returnToHomePage();

    }
}

