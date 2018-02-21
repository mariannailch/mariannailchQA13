package com.TelRan.course.tests;

import org.testng.annotations.Test;

public class CreateNewList extends TestBase {

    @Test
    public void createNewList() {
        app.clickLogInButton();
        app.enterUserName("elena.telran@yahoo.com");
        app.enterPassword("12345.com");
        app.confirmLogInButton();
        app.selectBoard();
        app.clickAddList();
        app.enterListName("newList");
        app.clickSaveButton();

    }
}
