package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class FormPage {

    WebDriver driver;

    public FormPage(WebDriver driver) {
        this.driver = driver;
    }

    // Text Fields
    By name = By.id("name");
    By email = By.id("email");
    By phone = By.id("phone");
    By address = By.id("textarea");

    // Gender
    By male = By.xpath("//input[@value='male']");
    By female = By.xpath("//input[@value='female']");

    // Days
    By sunday = By.id("sunday");
    By monday = By.id("monday");
    By tuesday = By.id("tuesday");
    By wednesday = By.id("wednesday");
    By thursday = By.id("thursday");
    By friday = By.id("friday");
    By saturday = By.id("saturday");

    // Dropdowns
    By country = By.id("country");
    By colors = By.id("colors");
    By sortedList = By.id("animals");

    // Dates
    By date1 = By.xpath("(//input[@type='date'])[1]");
    By date2 = By.xpath("(//input[@type='date'])[2]");

    // Text Fields
    public void enterName(String value) {
        driver.findElement(name).sendKeys(value);
    }

    public void enterEmail(String value) {
        driver.findElement(email).sendKeys(value);
    }

    public void enterPhone(String value) {
        driver.findElement(phone).sendKeys(value);
    }

    public void enterAddress(String value) {
        driver.findElement(address).sendKeys(value);
    }

    // Gender
    public void selectMale() {
        driver.findElement(male).click();
    }

    public void selectFemale() {
        driver.findElement(female).click();
    }

    // Days
    public void selectAllDays() {

        driver.findElement(sunday).click();
        driver.findElement(monday).click();
        driver.findElement(tuesday).click();
        driver.findElement(wednesday).click();
        driver.findElement(thursday).click();
        driver.findElement(friday).click();
        driver.findElement(saturday).click();
    }

    // Country
    public void selectCountry(String value) {

        Select select = new Select(driver.findElement(country));
        select.selectByVisibleText(value);
    }

    // Colors
    public void selectColor(String value) {

        Select select = new Select(driver.findElement(colors));
        select.selectByVisibleText(value);
    }

    // Sorted List
    public void selectAnimal(String value) {

        Select select = new Select(driver.findElement(sortedList));
        select.selectByVisibleText(value);
    }

    // Date Pickers
    public void enterDate1(String value) {

        driver.findElement(date1).sendKeys(value);
    }

    public void enterDate2(String value) {

        driver.findElement(date2).sendKeys(value);
    }
}