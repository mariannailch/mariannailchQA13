package com.TelRan.course.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BoardDeletionTests extends TestBase {
    @Test
    public void boardDeletionTest(){
        app.getBoardHelper().selectBoard();
        app.getBoardHelper().clickShowMenu();
        app.getBoardHelper().clickMoreButton();
        app.getBoardHelper().clickCloseBoard();
        app.getBoardHelper().submitCloseBoard();
        app.getBoardHelper().deleteClosedBoard();
        app.getNavigationHelper().returnToHomePage();
    }
}
