package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.FormPage;

public class FormTest extends BaseClass {

    @Test(priority = 1)
    public void verifyTextFields() {

        FormPage form = new FormPage(driver);

        form.enterName("Eklavya Kumar");
        form.enterEmail("eklavya@gmail.com");
        form.enterPhone("9876543210");
        form.enterAddress("Jamshedpur");

        System.out.println("Text Fields Verified");
    }

    @Test(priority = 2)
    public void verifyGenderSelection() {

        FormPage form = new FormPage(driver);

        form.selectMale();

        System.out.println("Gender Selected");
    }

    @Test(priority = 3)
    public void verifyDaysSelection() {

        FormPage form = new FormPage(driver);

        form.selectAllDays();

        System.out.println("All Days Selected");
    }

    @Test(priority = 4)
    public void verifyCountryDropdown() {

        FormPage form = new FormPage(driver);

        form.selectCountry("India");

        System.out.println("Country Selected");
    }

    @Test(priority = 5)
    public void verifyColorsDropdown() {

        FormPage form = new FormPage(driver);

        form.selectColor("Red");

        System.out.println("Color Selected");
    }

    @Test(priority = 6)
    public void verifySortedListDropdown() {

        FormPage form = new FormPage(driver);

        form.selectAnimal("Cat");

        System.out.println("Animal Selected");
    }

    @Test(priority = 7)
    public void verifyDatePicker1() {

        FormPage form = new FormPage(driver);

        form.enterDate1("2026-06-08");

        System.out.println("Date 1 Selected");
    }

    @Test(priority = 8)
    public void verifyDatePicker2() {

        FormPage form = new FormPage(driver);

        form.enterDate2("2026-06-15");

        System.out.println("Date 2 Selected");
    }

    @Test(priority = 9)
    public void verifyCompleteForm() {

        FormPage form = new FormPage(driver);

        form.enterName("Eklavya Kumar");
        form.enterEmail("eklavya@gmail.com");
        form.enterPhone("9876543210");
        form.enterAddress("Jamshedpur");

        form.selectMale();
        form.selectAllDays();

        form.selectCountry("India");
        form.selectColor("Red");
        form.selectAnimal("Cat");

        form.enterDate1("2026-06-08");
        form.enterDate2("2026-06-15");

        System.out.println("Complete Form Filled Successfully");
    }
}