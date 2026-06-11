package pages;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AlertPage {

    WebDriver driver;

    public AlertPage(WebDriver driver) {
        this.driver = driver;
    }

    By simpleBtn = By.xpath("//button[text()='Simple Alert']");
    By confirmBtn = By.xpath("//button[text()='Confirmation Alert']");
    By promptBtn = By.xpath("//button[text()='Prompt Alert']");

    // Simple Alert
    public void handleSimpleAlert() {

        driver.findElement(simpleBtn).click();

        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    // Confirmation Alert Accept
    public void handleConfirmationAlertAccept() {

        driver.findElement(confirmBtn).click();

        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    // Confirmation Alert Cancel
    public void handleConfirmationAlertCancel() {

        driver.findElement(confirmBtn).click();

        Alert alert = driver.switchTo().alert();
        alert.dismiss();
    }

    // Prompt Alert
    public void handlePromptAlert(String text) {

        driver.findElement(promptBtn).click();

        Alert alert = driver.switchTo().alert();

        alert.sendKeys(text);
        alert.accept();
    }
}