package com.TelRan.course.tests;

import com.TelRan.course.model.ListData;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.io.File;

public class PhotoUploadTests extends TestBase {
        @Test
        public void photoUploadTest(){
            File photo = new File("C:\\Users\\User\\Documents\\GitHub\\mariannailchQA13\\trelloSeleniumProject\\src\\test\\resources\\stars.jpg");
            app.getBoardHelper().selectBoard();
            app.getListHelper().addNewCard();
            app.getListHelper().clickAddNewCard();
            app.getListHelper().clickOnCard();
            app.getListHelper().clickOnAttachments();
            app.getListHelper().addAttachment(new ListData().setPhoto(photo));
        }
    }
