package com.TelRan.course.tests;

import com.TelRan.course.model.BoardData;
import org.testng.annotations.Test;

public class CreateNewBoard extends TestBase {
    @Test
    public void createNewBoard() {
        app.clickBoardsButton();
        app.clickCreateNewBoard();
        app.enterBoardName(new BoardData("newBoard"));
        app.clickSubmitButton();
        app.returnToHomePage();
    }



}

