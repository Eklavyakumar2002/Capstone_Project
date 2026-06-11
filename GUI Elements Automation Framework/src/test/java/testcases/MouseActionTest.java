package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.MouseActionPage;

public class MouseActionTest extends BaseClass {

    @Test(priority = 1)
    public void verifyMouseHover() {

        MouseActionPage mouse = new MouseActionPage(driver);

        mouse.performMouseHover();

        System.out.println("Mouse Hover Successful");
    }

    @Test(priority = 2)
    public void verifyDoubleClick() {

        MouseActionPage mouse = new MouseActionPage(driver);

        mouse.performDoubleClick();

        System.out.println("Double Click Successful");
    }

    @Test(priority = 3)
    public void verifyDragAndDrop() {

        MouseActionPage mouse = new MouseActionPage(driver);

        mouse.performDragAndDrop();

        System.out.println("Drag And Drop Successful");
    }
}