import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class RenameBoard extends TestBase {
    @BeforeClass
    public void preConditions(){
        login("elena.telran@yahoo.com", "12345.com");
    }
    @Test
    public void renameBoard(){
        selectBoard();
        clickOnTheTitle();
        enterNewBoardName("myBoard");
        clickRenameButton();

    }

    private void clickRenameButton() {
        wd.findElement(By.xpath("//input[@class='primary wide js-rename-board']")).click();
    }

    private void enterNewBoardName(String newName) {
        wd.findElement(By.xpath("//input[@class='js-board-name js-autofocus']")).click();
        wd.findElement(By.xpath("//input[@class='js-board-name js-autofocus']")).clear();
        wd.findElement(By.xpath("//input[@class='js-board-name js-autofocus']")).sendKeys(newName);
    }

    private void clickOnTheTitle() {
        wd.findElement(By.cssSelector("a.board-header-btn.board-header-btn-name.js-rename-board")).click();
    }

    private void selectBoard() {
        wd.findElement(By.xpath("//span[@class='board-tile-details is-badged']//span[@title='myBoard']")).click();
    }
}
