package com.TelRan.course.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DeleteList extends TestBase {
    @BeforeClass
    public void preConditions(){
        app.login("elena.telran@yahoo.com", "12345.com");
    }
    @Test
    public void deleteList(){
        app.selectBoard();
        app.clickListMenuButton();
        app.clickArchiveThisList();
        app.returnToHomePage();

    }
}
