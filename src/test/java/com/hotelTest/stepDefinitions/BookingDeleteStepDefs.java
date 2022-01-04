package com.hotelTest.stepDefinitions;

import com.hotelTest.pages.BasePage;
import com.hotelTest.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class BookingDeleteStepDefs {

    BasePage basepage=new BasePage();


    @When("User Hover over delete button which is the rightest side of every booking row.")
    public void userHoverOverDeleteButtonWhichIsTheRightestSideOfEveryBookingRow() {

    }

    @Then("User can see the delete option.")
    public void userCanSeeTheDeleteOption() {
        System.out.println(basepage.deleteButtons.size());
        int beforeDelete=basepage.deleteButtons.size();
        List<WebElement> deletes=basepage.deleteButtons;
        for(WebElement delete:deletes){
            Assert.assertTrue(delete.isDisplayed());
        }
        System.out.println("displayed");

    }

    @And("user clicks on delete button.")
    public void userClicksOnDeleteButton() {
        BrowserUtils.waitForVisibility(basepage.deleteButtons.get(1), 10);
      //  BrowserUtils.clickWithJS(basepage.deleteButtons.get(0));
        BrowserUtils.hover(basepage.deleteButtons.get(1));
        System.out.println("hover");
        BrowserUtils.waitFor(3);
        basepage.deleteButtons.get(3).click();
        BrowserUtils.waitFor(3);
    }
    @Then("the user should be able to delete the booking successfully")
    public void theUserShouldBeAbleToDeleteTheBookingSuccessfully() {

        int afterDelete=basepage.deleteButtons.size()-1;
        Assert.assertEquals(basepage.beforeDelete,basepage.afterDelete);

        
    }
}
