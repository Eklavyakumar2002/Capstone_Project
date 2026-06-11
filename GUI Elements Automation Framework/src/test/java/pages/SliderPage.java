package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SliderPage {

    WebDriver driver;

    public SliderPage(WebDriver driver) {
        this.driver = driver;
    }

    By sliderHandle = By.xpath("//div[contains(@class,'ui-slider-handle')]");
    By nativeSlider = By.xpath("//input[@type='range']");

    public void moveSlider() {

        try {

            WebElement slider = driver.findElement(sliderHandle);

            Actions actions = new Actions(driver);

            actions.clickAndHold(slider)
                    .moveByOffset(50, 0)
                    .release()
                    .perform();

            System.out.println("jQuery Slider moved");

        } catch (Exception e) {

            System.out.println("jQuery Slider not present on page");
        }
    }

    public void moveNativeSlider() {

        try {

            WebElement slider = driver.findElement(nativeSlider);

            slider.sendKeys(Keys.ARROW_RIGHT);
            slider.sendKeys(Keys.ARROW_RIGHT);
            slider.sendKeys(Keys.ARROW_RIGHT);

            System.out.println("Native Slider moved");

        } catch (Exception e) {

            System.out.println("Native Slider not present on page");
        }
    }
}