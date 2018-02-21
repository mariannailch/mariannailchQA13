package com.TelRan.course.application;

import com.TelRan.course.model.BoardData;
import com.TelRan.course.model.ListData;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.util.concurrent.TimeUnit;

public class ApplicationManager {
    FirefoxDriver wd;

    public static boolean isAlertPresent(FirefoxDriver wd) {
        try {
            wd.switchTo().alert();
            return true;
        } catch (NoAlertPresentException e) {
            return false;
        }
    }

    public void init() {
        wd = new FirefoxDriver(new FirefoxOptions().setLegacy(true));
        wd.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        openSite();
    }

    public void confirmLogInButton() {
        wd.findElement(By.id("login")).click();
    }

    public void enterPassword(String pwd) {
            wd.findElement(By.id("password")).click();
        wd.findElement(By.id("password")).clear();
        wd.findElement(By.id("password")).sendKeys(pwd());
    }

    public String pwd() {
        return "12345.com";
    }

    public void enterUserName(String userName) {
        wd.findElement(By.id("user")).click();
        wd.findElement(By.id("user")).clear();
        wd.findElement(By.id("user")).sendKeys(userName);
    }

    public void clickLogInButton() {
        wd.findElement(By.linkText("Log In")).click();
    }

    public void openSite() {
        wd.get("https://trello.com/");
    }

    public void login(String user, String pwd){
        clickLogInButton();
        enterUserName(user);
        enterPassword(pwd);
        confirmLogInButton();
    }

    public void returnToHomePage() {
        wd.findElement(By.cssSelector("span.header-btn-icon.icon-lg.icon-board-back-to-home.light")).click();
    }

    public void clickRenameButton() {
        wd.findElement(By.xpath("//input[@class='primary wide js-rename-board']")).click();
    }

    public void enterNewBoardName(String newName) {
        wd.findElement(By.xpath("//input[@class='js-board-name js-autofocus']")).click();
        wd.findElement(By.xpath("//input[@class='js-board-name js-autofocus']")).clear();
        wd.findElement(By.xpath("//input[@class='js-board-name js-autofocus']")).sendKeys(newName);
    }

    public void clickOnTheTitle() {
        wd.findElement(By.cssSelector("a.board-header-btn.board-header-btn-name.js-rename-board")).click();
    }

    public void selectBoard() {
        wd.findElement(By.xpath("//span[@class='board-tile-details is-badged']//span[@title='myBoard']")).click();
    }

    public void clickOnEmpyField() {
        wd.findElement(By.xpath("//html//div[@id='board']/div[1]")).click();
    }

    public void enterNewListName(ListData listData) {
        wd.findElement(By.cssSelector("textarea.list-header-name.mod-list-name.js-list-name-input")).click();
        wd.findElement(By.cssSelector("textarea.list-header-name.mod-list-name.js-list-name-input")).clear();
        wd.findElement(By.cssSelector("textarea.list-header-name.mod-list-name.js-list-name-input")).sendKeys(listData.getNewListName());
    }

    public void selectListTitle() {
        wd.findElement(By.xpath("//html//div[@id='board']/div[1]/div[1]/div[1]/div[1]")).click();

    }

    public void createBoard() {
        wd.findElement(By.cssSelector("button.primary")).click();
    }

    public void enterBoardName(BoardData boardData) {
        wd.findElement(By.cssSelector("input.subtle-input")).click();
        wd.findElement(By.cssSelector("input.subtle-input")).clear();
        wd.findElement(By.cssSelector("input.subtle-input")).sendKeys(boardData.getName());
    }

    public void clickNewBoard() {
        wd.findElement(By.xpath("//div[@class='js-react-root']//span[.='Create new board…']")).click();
    }

    public void enterListName(String name) {
        wd.findElement(By.xpath("//input[@class='list-name-input']")).click();
        wd.findElement(By.xpath("//input[@class='list-name-input']")).clear();
        wd.findElement(By.xpath("//input[@class='list-name-input']")).sendKeys(name);
    }

    public void clickAddList() {
        wd.findElement(By.cssSelector("span.placeholder.js-open-add-list")).click();
    }

    public void clickSaveButton() {
        wd.findElement(By.xpath("//input[@class='primary mod-list-add-button js-save-edit']")).click();
    }

    public void clickShowMenu() {
        wd.findElement(By.xpath("//span[@class='board-header-btn-text u-text-underline'][contains(text(),'Show Menu')]")).click();
    }

    public void deleteClosedBoard() {
        wd.findElement(By.cssSelector("a.quiet.js-delete")).click();
    }

    public void submitCloseBoard() {
        wd.findElement(By.cssSelector("input.js-confirm.full.negate")).click();
    }

    public void clickCloseBoard() {
        wd.findElement(By.cssSelector("a.board-menu-navigation-item-link.js-close-board")).click();
    }

    public void clickMoreButton() {
        wd.findElement(By.cssSelector("a.board-menu-navigation-item-link.js-open-more")).click();
    }

    public void clickArchiveThisList() {
        wd.findElement(By.cssSelector("a.js-close-list")).click();
    }

    public void clickListMenuButton() {
        wd.findElement(By.cssSelector("a.list-header-extras-menu.dark-hover.js-open-list-menu")).click();
    }

    public void stop() {
        wd.quit();
    }

    public void logOut() {
        wd.findElement(By.cssSelector("span.member-initials")).click();
        wd.findElement(By.cssSelector("a.js-logout")).click();

    }
}
