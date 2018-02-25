package com.tr.selenium.tests;

import com.tr.selenium.appManager.ApplicationManager;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class TestBase {

    protected final ApplicationManager app = new ApplicationManager();

    @BeforeClass
    public void setUp() throws Exception {
        app.start();
    }

    @AfterClass
    public void tearDown() {
        app.stop();
    }

}
