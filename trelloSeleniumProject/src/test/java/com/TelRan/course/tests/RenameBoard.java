package com.TelRan.course.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RenameBoard extends TestBase {
    @Test
    public void renameBoard(){
        app.selectBoard();
        app.clickOnTheTitle();
        app.enterNewBoardName("myBoard");
        app.clickRenameButton();
        app.returnToHomePage();

    }
}
