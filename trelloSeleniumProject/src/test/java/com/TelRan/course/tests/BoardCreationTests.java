package com.TelRan.course.tests;

import com.TelRan.course.model.BoardData;
import org.testng.annotations.Test;

public class BoardCreationTests extends TestBase {
    @Test
    public void boardCreationTest() {
        app.getBoardHelper().clickBoardsButton();
        app.getBoardHelper().clickCreateNewBoard();
        app.getBoardHelper().enterBoardName(new BoardData().setBoardName("newBoard"));
        app.getBoardHelper().clickSubmitButton();
       app.getNavigationHelper().returnToHomePage();
    }



}

