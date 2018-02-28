package com.tr.selenium.tests;

import com.tr.selenium.model.ContactData;
import org.testng.annotations.Test;

public class ContactRenameTests extends TestBase {
    @Test
    public void contactRenameTest(){
        app.getContactHelper().chooseContact();
        app.getContactHelper().clickEditButton();
        app.getContactHelper().fillContactForm(new ContactData()
                .setFirstname("sofa")
                .setLastname("cohen")
                .setHomePhoneNumber("0547865976")
                .setAddress("Tel Aviv"));
        app.getContactHelper().clickUpdateButton();
        app.getContactHelper().returnToHomePage();

    }

}
