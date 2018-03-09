package com.tr.selenium.tests;

import com.tr.selenium.model.ContactData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactRenameTests extends TestBase {
    @Test
    public void contactRenameTest(){
        app.getNavigationHelper().goToHomePage();
        if(!app.getContactHelper().isContactExist()) {
            app.getContactHelper().createContact();
        }
        int before = app.getContactHelper().getContactCount();
        app.getContactHelper().chooseContact();
        app.getContactHelper().clickEditButton();
        app.getContactHelper().fillContactForm(new ContactData()
                .setFirstname("sofa")
                .setLastname("cohen")
                .setHomePhoneNumber("0547865976")
                .setAddress("Tel Aviv"));
        app.getContactHelper().clickUpdateButton();
        app.getContactHelper().returnToHomePage();
        int after = app.getContactHelper().getContactCount();
        Assert.assertEquals(after, before);

    }

}
