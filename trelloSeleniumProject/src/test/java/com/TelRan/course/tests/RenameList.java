package com.TelRan.course.tests;

import com.TelRan.course.model.ListData;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RenameList extends TestBase {
    @BeforeClass
    public void preConditions(){
        app.login("elena.telran@yahoo.com", "12345.com");
    }
    @Test
    public void renameList(){
        app.selectBoard();
        app.selectListTitle();
        app.enterNewListName(new ListData("ffffffff"));
        app.clickOnEmpyField();
        app.returnToHomePage();
    }
}
