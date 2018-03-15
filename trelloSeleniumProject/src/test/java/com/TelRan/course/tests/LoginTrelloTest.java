package com.TelRan.course.tests;

import org.testng.annotations.*;

public class LoginTrelloTest extends TestBase {

    @Test(priority = 1)
    public void LoginTrelloTest() {
        app.getSessionHelper().clickLogInButton();
        app.getSessionHelper().enterUserName("elena.telran@yahoo.com");
        app.getSessionHelper().enterPassword("12345.com");
        app.getSessionHelper().confirmLogInButton();
        app.getSessionHelper().logOut();
    }

    @Test
    public void LoginTrelloTestNotValid() {
        app.getSessionHelper().clickLogInButton();
        app.getSessionHelper().enterUserName("11111");
        app.getSessionHelper().enterPassword("12345.com");
        app.getSessionHelper().confirmLogInButton();
    }

    @Test(priority = 2)
    public void LoginTrelloTestEmptyFields() {
        app.getSessionHelper().clickLogInButton();
        app.getSessionHelper().enterUserName("");
        app.getSessionHelper().enterPassword("");
        app.getSessionHelper().confirmLogInButton();

    }


}