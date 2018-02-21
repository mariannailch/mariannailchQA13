package com.TelRan.cource.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DeleteBoard extends TestBase {
    @BeforeClass
    public void preConditions(){
        app.login("elena.telran@yahoo.com", "12345.com");
    }
    @Test
    public void deleteBoard(){
        app.selectBoard();
        app.clickShowMenu();
        app.clickMoreButton();
        app.clickCloseBoard();
        app.submitCloseBoard();
        app.deleteClosedBoard();
        app.returnToHomePage();
    }
}
