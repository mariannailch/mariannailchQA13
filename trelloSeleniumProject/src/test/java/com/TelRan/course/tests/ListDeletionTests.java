package com.TelRan.course.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ListDeletionTests extends TestBase {
    @Test
    public void listDeletionTest(){
        app.getBoardHelper().selectBoard();
        app.getListHelper().clickListMenuButton();
        app.getListHelper().clickArchiveThisList();
        app.getNavigationHelper().returnToHomePage();

    }
}
