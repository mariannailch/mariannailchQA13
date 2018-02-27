package com.tr.selenium.tests;

import com.tr.selenium.model.ContactData;
import org.testng.annotations.Test;

public class ContactRenameTests extends TestBase {
    @Test
    public void contactRenameTest(){
        app.chooseContact();
        app.clickEditButton();
        app.fillContactForm(new ContactData()
                .setFirstname("sofa")
                .setLastname("cohen")
                .setHomePhoneNumber("0547865976")
                .setAddress("Tel Aviv"));
        app.clickUpdateButton();
        app.returnToHomePage();

    }

}
