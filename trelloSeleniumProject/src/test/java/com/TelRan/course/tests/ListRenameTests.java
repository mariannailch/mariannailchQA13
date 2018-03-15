package com.TelRan.course.tests;

import com.TelRan.course.model.ListData;
import org.testng.annotations.Test;

public class ListRenameTests extends TestBase {
    @Test
    public void listRenameTests(){
        app.getBoardHelper().selectBoard();
        app.getListHelper().selectListTitle();
        app.getListHelper().enterNewListName(new ListData().setNewname("fffff"));
        app.getNavigationHelper().returnToHomePage();
    }
}
