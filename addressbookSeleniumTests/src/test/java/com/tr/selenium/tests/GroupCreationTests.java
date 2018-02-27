package com.tr.selenium.tests;

import com.tr.selenium.model.GroupData;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GroupCreationTests extends TestBase {

    @Test
    public void groupCreationTest() {
        app.goToGroupsPage();
        int before = app.getGroupHelper().getGroupCount(); //считаем колво групп на странице до запуска метода
        app.getGroupHelper().initGroupCreation();
        app.getGroupHelper().fillGroupForm(new GroupData()
                .setGroupName("test1")
                .setGroupFooter("Test1Footer")
                .setGroupHeader("Test1Header"));
        app.getGroupHelper().submitGroupCreation();
        app.getGroupHelper().returnToGroupsPage();
        int after = app.getGroupHelper().getGroupCount();
        Assert.assertEquals(after,before+1); //проверяем что создалась группа
    }


}
