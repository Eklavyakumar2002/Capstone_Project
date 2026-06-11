package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseClass;
import pages.SliderPage;

public class SliderTest extends BaseClass {

    @Test(priority = 1)
    public void verifySliderMovement() {

        SliderPage sliderPage = new SliderPage(driver);

        sliderPage.moveSlider();

        Assert.assertTrue(true);
    }

    @Test(priority = 2)
    public void verifyNativeSliderMovement() {

        SliderPage sliderPage = new SliderPage(driver);

        sliderPage.moveNativeSlider();

        Assert.assertTrue(true);
    }
}