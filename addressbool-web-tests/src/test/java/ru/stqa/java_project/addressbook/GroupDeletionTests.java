package ru.stqa.java_project.addressbook;


import org.testng.annotations.*;

public class GroupDeletionTests extends TestBase{

  @Test
  public void testGroupDeletion() throws Exception {
    app.gotoGroupPage();
    app.selectGroup();
    app.deleteSelectedGroups();
    app.returnToGroupPage();
  }

}

