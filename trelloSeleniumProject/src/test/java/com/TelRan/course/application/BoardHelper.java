package com.TelRan.course.application;

import com.TelRan.course.model.BoardData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BoardHelper extends HelperBase {
    public BoardHelper(WebDriver wd) {
        super(wd);
    }

    public void clickRenameButton() {
        wd.findElement(By.xpath("//input[@class='primary wide js-rename-board']")).click();
    }

    public void enterNewBoardName(String newName) {
        wd.findElement(By.xpath("//input[@class='js-board-name js-autofocus']")).clear();
        wd.findElement(By.xpath("//input[@class='js-board-name js-autofocus']")).sendKeys(newName);
    }

    public void selectBoard() {
        wd.findElement(By.xpath("//span[@class='board-tile-details is-badged']//span[@title='newBoard']")).click();
    }

    public void enterBoardName(BoardData boardData) {
        wd.findElement(By.xpath("//input[@id='boardNewTitle']")).click();
        wd.findElement(By.xpath("//input[@id='boardNewTitle']")).clear();
        wd.findElement(By.xpath("//input[@id='boardNewTitle']")).sendKeys(boardData.getName());
    }

    public void clickShowMenu() {
        wd.findElement(By.xpath("//span[@class='icon-sm icon-overflow-menu-horizontal board-header-btn-icon']")).click();
    }

    public void deleteClosedBoard() {
        wd.findElement(By.xpath("//a[@class='quiet js-delete']")).click();
    }

    public void submitCloseBoard() {
        wd.findElement(By.xpath("//input[@class='js-confirm full negate']")).click();
    }

    public void clickMoreButton() {
        wd.findElement(By.cssSelector("a.board-menu-navigation-item-link.js-open-more")).click();
    }

    public void clickBoardsButton() {
        wd.findElement(By.xpath("//span[@class='header-btn-icon icon-lg icon-board light']")).click();
    }

    public void clickCreateNewBoard() {
        wd.findElement(By.xpath("//a[@class='quiet-button js-add-board']")).click();
    }

    public void clickSubmitButton() {
        wd.findElement(By.xpath("//input[@class='primary wide js-submit']")).click();
    }

    public void clickOnTheTitle() {
        wd.findElement(By.xpath("//a[@class='board-header-btn board-header-btn-name js-rename-board']")).click();
    }

    public void clickCloseBoard() {
        wd.findElement(By.xpath("//a[@class='board-menu-navigation-item-link js-close-board']")).click();
    }
}
