package com.tr.selenium.tests;

import com.tr.selenium.model.ContactData;
import org.testng.annotations.Test;

public class ContactRenameTests extends TestBase {
    @Test
    public void contactRenameTest(){
        app.chooseContact();
        app.clickEditButton();
        app.fillContactForm(new ContactData("ttttt", "tttttt", "tttt", "ttttttt"));
        app.clickUpdateButton();
        app.returnToHomePage();

    }

}
