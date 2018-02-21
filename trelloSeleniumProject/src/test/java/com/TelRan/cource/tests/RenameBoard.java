package com.TelRan.cource.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RenameBoard extends TestBase {
    @BeforeClass
    public void preConditions(){
        app.login("elena.telran@yahoo.com", "12345.com");
    }
    @Test
    public void renameBoard(){
        app.selectBoard();
        app.clickOnTheTitle();
        app.enterNewBoardName("myBoard");
        app.clickRenameButton();
        app.returnToHomePage();

    }
}
