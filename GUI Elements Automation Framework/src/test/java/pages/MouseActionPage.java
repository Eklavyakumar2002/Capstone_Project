package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseActionPage {

    WebDriver driver;
    Actions actions;

    public MouseActionPage(WebDriver driver) {
        this.driver = driver;
        actions = new Actions(driver);
    }

    By hoverBtn = By.xpath("//button[text()='Point Me']");
    By copyBtn = By.xpath("//button[text()='Copy Text']");
    By field1 = By.id("field1");
    By field2 = By.id("field2");
    By dragElem = By.id("draggable");
    By dropElem = By.id("droppable");

    // Mouse Hover
    public void performMouseHover() {

        actions.moveToElement(driver.findElement(hoverBtn)).perform();
    }

    // Double Click
    public void performDoubleClick() {

        actions.doubleClick(driver.findElement(copyBtn)).perform();
    }

    // Drag And Drop
    public void performDragAndDrop() {

        actions.dragAndDrop(
                driver.findElement(dragElem),
                driver.findElement(dropElem)).perform();
    }
}