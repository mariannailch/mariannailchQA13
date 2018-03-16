package com.TelRan.course.tests;

import com.TelRan.course.model.FileData;
import org.testng.annotations.Test;

import java.io.File;

public class PhotoUploadTests extends TestBase {
        @Test (enabled = false)
        public void photoUploadTest(){

            app.getBoardHelper().selectBoard();
            if(!app.isCardExist()){
                app.getFileHelper().addNewCard();
                app.getFileHelper().clickAddNewCard();
            }else {

                app.getFileHelper().clickOnCard();
                app.getFileHelper().clickOnAttachments();
                File photo = new File("C:\\Users\\User\\Documents\\GitHub\\mariannailchQA13\\trelloSeleniumProject\\src\\test\\resources\\stars.jpg");
                app.getFileHelper().addAttachment(new FileData().setPhoto(photo));

            }

        }

        @Test
        public void profilePhotoUploadTest(){
            app.getFileHelper().clickOnProfileIcon();
            app.getFileHelper().clickProfile();
            app.getFileHelper().clickChangePhoto();
            File photo = new File("trelloSeleniumProject\\src\\test\\resources\\2014-03-22 10.57.26.jpg");
            app.getFileHelper().addAttachment(new FileData().setPhoto(photo));
        }

    }
