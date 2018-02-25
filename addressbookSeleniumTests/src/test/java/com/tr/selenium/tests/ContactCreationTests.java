package com.tr.selenium.tests;

import com.tr.selenium.model.ContactData;
import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase {
    @Test
    public void contactCreationTest(){
        app.goToAddNewContactPage();
        app.fillContactForm(new ContactData("Vasya", "Pupkin", "0546768796", "Tel Aviv"));
        app.submitContactCreation();
        app.returnToHomePage();

    }
}

