package testcases;

import org.testng.annotations.Test;

import base.BaseClass;
import pages.AlertPage;

public class AlertTest extends BaseClass {

    @Test(priority = 1)
    public void verifySimpleAlert() {

        AlertPage alertPage = new AlertPage(driver);

        alertPage.handleSimpleAlert();

        System.out.println("Simple Alert Handled");
    }

    @Test(priority = 2)
    public void verifyConfirmationAlert() {

        AlertPage alertPage = new AlertPage(driver);

        alertPage.handleConfirmationAlertAccept();

        System.out.println("Confirmation Alert Accepted");
    }

    @Test(priority = 3)
    public void verifyPromptAlert() {

        AlertPage alertPage = new AlertPage(driver);

        alertPage.handlePromptAlert("Eklavya Kumar");

        System.out.println("Prompt Alert Handled");
    }
}