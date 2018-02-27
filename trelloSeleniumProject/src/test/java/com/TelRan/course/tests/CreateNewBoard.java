package com.TelRan.course.tests;

import com.TelRan.course.model.BoardData;
import org.testng.annotations.Test;

public class CreateNewBoard extends TestBase {
    @Test
    public void createNewBoard() {
        app.clickLogInButton();
        app.enterUserName("elena.telran@yahoo.com");
        app.enterPassword("12345.com");
        app.confirmLogInButton();
        app.clickNewBoard();
        app.enterBoardName(new BoardData("newBoard"));
        app.createBoard();
    }



}
