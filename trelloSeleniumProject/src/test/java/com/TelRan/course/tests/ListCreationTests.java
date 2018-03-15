package com.TelRan.course.tests;

import com.TelRan.course.model.ListData;
import org.testng.annotations.Test;

public class ListCreationTests extends TestBase {
    @Test
    public void listRenameTest() {
        app.getBoardHelper().selectBoard();
        app.getListHelper().clickAddList();
        app.getListHelper().enterListName(new ListData().setName("hhhh"));
        app.getListHelper().clickSaveButton();
        app.getNavigationHelper().returnToHomePage();

    }
}
