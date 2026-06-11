package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UploadPage {

    WebDriver driver;

    public UploadPage(WebDriver driver) {
        this.driver = driver;
    }

    By allFileInputs = By.xpath("//input[@type='file']");
    By uploadSingleBtn = By.xpath("//button[normalize-space()='Upload Single File']");
    By uploadMultiBtn = By.xpath("//button[normalize-space()='Upload Multiple Files']");

    public void uploadSingleFile(String filePath) {

        driver.findElements(allFileInputs)
              .get(0)
              .sendKeys(filePath);

        driver.findElement(uploadSingleBtn).click();
    }

    public void uploadMultipleFiles(String file1, String file2) {

        driver.findElements(allFileInputs)
              .get(1)
              .sendKeys(file1 + "\n" + file2);

        driver.findElement(uploadMultiBtn).click();
    }
}