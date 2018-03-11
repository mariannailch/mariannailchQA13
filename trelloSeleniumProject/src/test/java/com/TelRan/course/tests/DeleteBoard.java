package com.TelRan.course.tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DeleteBoard extends TestBase {
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
