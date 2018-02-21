package com.TelRan.course.tests;

import org.testng.annotations.*;

public class LoginTrelloTest extends TestBase {

    @Test(priority = 1)
    public void LoginTrelloTest() {
        app.clickLogInButton();
        app.enterUserName("elena.telran@yahoo.com");
        app.enterPassword("12345.com");
        app.confirmLogInButton();
        app.logOut();
    }

    @Test
    public void LoginTrelloTestNotValid() {
        app.clickLogInButton();
        app.enterUserName("11111");
        app.enterPassword("12345.com");
        app.confirmLogInButton();
    }

    @Test(priority = 2)
    public void LoginTrelloTestEmptyFields() {
        app.clickLogInButton();
        app.enterUserName("");
        app.enterPassword("");
        app.confirmLogInButton();

    }


}