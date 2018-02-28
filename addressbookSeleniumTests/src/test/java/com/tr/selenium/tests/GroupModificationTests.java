package com.tr.selenium.tests;

        import com.tr.selenium.model.GroupData;
        import org.testng.Assert;
        import org.testng.annotations.Test;

public class GroupModificationTests extends TestBase {
    @Test
    public void groupModificationTest(){
        app.getNavigationHelper().goToGroupsPage();
        int before = app.getGroupHelper().getGroupCount();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().initGroupModification();
        app.getGroupHelper().fillGroupForm(new GroupData()
                .setGroupName("rename")
                .setGroupHeader("rename")
                .setGroupFooter("rename"));
        app.getGroupHelper().submitGroupModification();
        app.getGroupHelper().returnToGroupsPage();
        int after = app.getGroupHelper().getGroupCount();
        Assert.assertEquals(after,before);
    }
}
