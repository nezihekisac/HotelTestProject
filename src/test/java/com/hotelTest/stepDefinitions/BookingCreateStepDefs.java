package com.hotelTest.stepDefinitions;

import com.hotelTest.pages.BasePage;
import com.hotelTest.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import javafx.scene.control.TextInputControl;
import jdk.nashorn.internal.runtime.regexp.RegExp;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BookingCreateStepDefs {

    BasePage basepage=new BasePage();

    @When("User navigates to Firstname field")
    public void userNavigatesToFirstnameField() {

        //BrowserUtils.waitForVisibility(basepage.firstName, 10);
       basepage.firstName.click();

        //BrowserUtils.waitFor(3);

    }

    @And("User clicks on the Firstname field")
    public void userClicksOnTheFirstnameField() {
    }

    @Then("User should be able to enter valid {string} info")
    public void userShouldBeAbleToEnterValidInfo(String name) {
        basepage.firstName.sendKeys(name);

        Boolean valid = name.matches("(?i)(^[a-z]+)[a-z .,-]((?! .,-)$){1,25}$");

        System.out.println("Name: " + name + "\nValid: " + valid);

        return;

    }


    @When("User navigates to Surname field")
    public void userNavigatesToSurnameField() {
    }
    @And("User clicks on the Surname field")
    public void userClicksOnTheSurnameField() {
        basepage.lastName.click();

    }

    @Then("User should be able to enter valid  and {string} info")
    public void userShouldBeAbleToEnterValidAndInfo(String name) {

        basepage.lastName.sendKeys(name);

        Boolean valid = name.matches("(?i)(^[a-z]+)[a-z .,-]((?! .,-)$){1,25}$");

        System.out.println("Lastname: " + name + "\nValid: " + valid);

        return;




    }

//////////////////

    @When("User navigates to Firstname field with invalid info")
    public void userNavigatesToFirstnameFieldWithInvalidInfo() {
    }

    @And("User clicks on the Firstname field with invalid info")
    public void userClicksOnTheFirstnameFieldWithInvalidInfo() {
        basepage.firstName.click();
    }
    @Then("User should not be able to enter invalid frstname{string} info")
    public void userShouldNotBeAbleToEnterInvalidFrstnameInfo(String name) {
        basepage.firstName.sendKeys(name);

        Boolean valid = name.matches("(?i)(^[a-z]+)[a-z .,-]((?! .,-)$){1,25}$");

        System.out.println("Name: " + name + "\nValid: " + valid);

        return;
    }
    @When("User navigates to Surname field with invalid info")
    public void userNavigatesToSurnameFieldWithInvalidInfo() {
    }
    @And("User clicks on the Surname field with invalid info")
    public void userClicksOnTheSurnameFieldWithInvalidInfo() {
        basepage.lastName.click();
    }

    @Then("User should not be able to enter invalid  surname {string} info")
    public void userShouldNotBeAbleToEnterInvalidSurnameInfo(String name) {
        basepage.firstName.sendKeys(name);

        Boolean valid = name.matches("(?i)(^[a-z]+)[a-z .,-]((?! .,-)$){1,25}$");

        System.out.println("Name: " + name + "\nValid: " + valid);

        return;

    }
//////////
    @When("User navigates to Price field")
    public void userNavigatesToPriceField() {
    }

    @And("User clicks on the Price field")
    public void userClicksOnThePriceField() {
        basepage.Price.click();
    }

    @Then("User should be able to enter valid price vprc {string} info")
    public void userShouldBeAbleToEnterValidPriceVprcInfo(String name) {

        basepage.Price.sendKeys(name);


        //String numbers="(.*[0-9].*)";



        //Boolean valid=prc.matches("[0-9]+([,.][0-9]{1,2})?");
        // System.out.println("Name: " + prc + "\nValid: " + valid);

        // return;

//        final Pattern pattern = Pattern.compile(RegExp(([0-9]+(\.[0-9]+)?)");

// This can be repeated in a loop with different inputs:

//        matcher.matches();
//(.*[0-9].*)

        Boolean valid = name.matches("([0-9]+(\\.[0-9]+)?)");

        System.out.println("Name: " + name + "\nValid: " + valid);




    }
/////////
    @When("User navigates to Price field with invalid info")
    public void userNavigatesToPriceFieldWithInvalidInfo() {
    }

    @And("User clicks on the Price field with invalid info")
    public void userClicksOnThePriceFieldWithInvalidInfo() {
        basepage.Price.click();
    }

    @Then("User should not be able to enter invalid prc{string} info")
    public void userShouldNotBeAbleToEnterInvalidPrcInfo(String name) {
        basepage.Price.sendKeys(name);
        Boolean valid = name.matches("([0-9]+(\\.[0-9]+)?)");

        System.out.println("Name: " + name + "\nValid: " + valid);
    }
///////////
    @When("User navigates to Deposit field")
    public void userNavigatesToDepositField() {
    }

    @And("User clicks on the Deposit field")
    public void userClicksOnTheDepositField() {
        basepage.deposit.click();
    }

    @And("User clicks on true option on the selection")
    public void userClicksOnTrueOptionOnTheSelection() {

        Select select=new Select(basepage.deposit);
        select.getFirstSelectedOption();
       // Assert.assertTrue("true is selected", Boolean.parseBoolean(select.getFirstSelectedOption().getText()));
        String actualResult=select.getFirstSelectedOption().getText();
        Assert.assertEquals("true",actualResult);
        // new Select(basepage.deposit).selectByVisibleText("true");
       // Thread.sleep(1000);
    }

    @Then("User should be able to see true option is selected")
    public void userShouldBeAbleToSeeTrueOptionIsSelected() {

    }

    @And("User clicks on false option on the selection")
    public void userClicksOnFalseOptionOnTheSelection() {
        basepage.deposit.click();
    }
    @Then("User should be able to see false option is selected")
    public void userShouldBeAbleToSeeFalseOptionIsSelected() {
        Select select=new Select(basepage.deposit);
        select.getFirstSelectedOption();
        // Assert.assertTrue("true is selected", Boolean.parseBoolean(select.getFirstSelectedOption().getText()));
        String actualResult=select.getFirstSelectedOption().getText();
        Assert.assertNotEquals("false",actualResult);
    }

///////////
    @When("User navigates to the check-in")
    public void userNavigatesToTheCheckIn() {
    }

    @And("User clicks on the check-in")
    public void userClicksOnTheCheckIn() {
    }

    @And("User hovers over on the check-in date picker")
    public void userHoversOverOnTheCheckInDatePicker() {
    }

    @Then("User should be able to click the valid checkin{string} date")
    public void userShouldBeAbleToClickTheValidCheckinDate(String arg0) {
    }

    @When("User navigates to the check-out")
    public void userNavigatesToTheCheckOut() {
    }

    @And("User clicks on the check-out")
    public void userClicksOnTheCheckOut() {
    }

    @And("User hovers over on the check-out date picker")
    public void userHoversOverOnTheCheckOutDatePicker() {
    }

    @Then("User should be able to click the valid checkout{string} date")
    public void userShouldBeAbleToClickTheValidCheckoutDate(String arg0) {
    }
////////////
    @When("User navigates to the check-in field")
    public void userNavigatesToTheCheckInField() {
    }

    @And("User clicks on the check-in field")
    public void userClicksOnTheCheckInField() {
    }

    @And("User hovers over on the check-in date picker field")
    public void userHoversOverOnTheCheckInDatePickerField() {
    }

    @Then("User should not be able to click the invalid check-in {string} date")
    public void userShouldNotBeAbleToClickTheInvalidCheckInDate(String arg0) {
    }

    @When("User navigates to the check-out field")
    public void userNavigatesToTheCheckOutField() {
    }

    @And("User clicks on the check-out field")
    public void userClicksOnTheCheckOutField() {
    }

    @And("User hovers over on the check-out date picker field")
    public void userHoversOverOnTheCheckOutDatePickerField() {
    }

    @Then("User should not be able to click the invalid check-out {string} date")
    public void userShouldNotBeAbleToClickTheInvalidCheckOutDate(String arg0) {
    }




//////////



}
