package com.TelRan.course.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DeleteList extends TestBase {
    @Test
    public void deleteList(){
        app.selectBoard();
        app.clickListMenuButton();
        app.clickArchiveThisList();
        app.returnToHomePage();

    }
}
