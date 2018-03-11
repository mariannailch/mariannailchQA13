package com.TelRan.course.tests;

import org.testng.annotations.Test;

public class CreateNewList extends TestBase {
    @Test
    public void createNewList() {
        app.selectBoard();
        app.clickAddList();
        app.enterListName("newList");
        app.clickSaveButton();
        app.returnToHomePage();

    }
}
