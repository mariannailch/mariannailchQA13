package com.TelRan.course.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BoardRenameTests extends TestBase {
    @Test
    public void boardRenameTest(){
        app.getBoardHelper().selectBoard();
        app.getBoardHelper().clickOnTheTitle();
        app.getBoardHelper().enterNewBoardName("myBoard");
        app.getBoardHelper().clickRenameButton();
        app.getNavigationHelper().returnToHomePage();

    }
}
