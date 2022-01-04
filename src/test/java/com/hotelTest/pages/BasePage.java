package com.hotelTest.pages;

import com.hotelTest.utilities.BrowserUtils;
import com.hotelTest.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;
import java.util.Scanner;

public  class BasePage {


    @FindBy(css = "input#firstname.input")
    public WebElement firstName;

    @FindBy(css = "input#lastname.input")
    public WebElement lastName;

    @FindBy(css = "input#totalprice.input")
    public WebElement Price;

    @FindBy(css = "select#depositpaid")
    public WebElement deposit;

    @FindBy(id = "#checkin")
    public WebElement checkin;

    @FindBy(id = "#checkout")
    public WebElement checkout;

    @FindBy(xpath = "//input[@value=' Save ']")
    public WebElement savebutton;

    @FindBy(css = "h1")
    public WebElement pageSubtitle;

    @FindBy(xpath = "//input[@value='Delete']")
    public List<WebElement> deleteButtons;

    @FindBy(css = "div[class='row']")
    public List<WebElement> bookingrows;
    public long beforeDelete;
    public long afterDelete;

    int count = 0;

    public int sizeofWebelements(List<WebElement> list) {

        for (int i = 1; i <= list.size(); i++) {
            count++;

        }
        return count;
    }


    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }
}
//    /**
//     * @return page name, for example: Dashboard
//     */
//    public String getPageSubTitle() {
//        //ant time we are verifying page name, or page subtitle, loader mask appears
//        BrowserUtils.waitForStaleElement(pageSubtitle);
//        return pageSubtitle.getText();
//    }
//}

    /**
     * Waits until loader screen present. If loader screen will not pop up at all,
     * NoSuchElementException will be handled  bu try/catch block
     * Thus, we can continue in any case.
     */
//    public void waitUntilLoaderScreenDisappear() {
//        try {
//            WebDriverWait wait = new WebDriverWait(Driver.get(), 5);
//            wait.until(ExpectedConditions.invisibilityOf(loaderMask));
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//
//    }

//    public String getUserName() {
//        waitUntilLoaderScreenDisappear();
//        BrowserUtils.waitForVisibility(userName, 5);
//        return userName.getText();
//    }
//
//
//    public void logOut() {
//        BrowserUtils.waitFor(2);
//        BrowserUtils.clickWithJS(userName);
//        BrowserUtils.clickWithJS(logOutLink);
//    }
//
//    public void goToMyUser() {
//        waitUntilLoaderScreenDisappear();
//        BrowserUtils.waitForClickablility(userName, 5).click();
//        BrowserUtils.waitForClickablility(myUser, 5).click();
//
//    }

    /**
     * This method will navigate user to the specific module in vytrack application.
     * For example: if tab is equals to Activities, and module equals to Calls,
     * Then method will navigate user to this page: http://qa2.vytrack.com/call/
     *
     * @param tab
     * @param module
     */
//    public void navigateToModule(String tab, String module) {
//        String tabLocator = "//span[normalize-space()='" + tab + "' and contains(@class, 'title title-level-1')]";
//        String moduleLocator = "//span[normalize-space()='" + module + "' and contains(@class, 'title title-level-2')]";
//        try {
//            BrowserUtils.waitForClickablility(By.xpath(tabLocator), 5);
//            WebElement tabElement = Driver.get().findElement(By.xpath(tabLocator));
//            new Actions(Driver.get()).moveToElement(tabElement).pause(200).doubleClick(tabElement).build().perform();
//        } catch (Exception e) {
//            BrowserUtils.clickWithWait(By.xpath(tabLocator), 5);
//        }
//        try {
//            BrowserUtils.waitForPresenceOfElement(By.xpath(moduleLocator), 5);
//            BrowserUtils.waitForVisibility(By.xpath(moduleLocator), 5);
//            BrowserUtils.scrollToElement(Driver.get().findElement(By.xpath(moduleLocator)));
//            Driver.get().findElement(By.xpath(moduleLocator)).click();
//        } catch (Exception e) {
//            BrowserUtils.waitForStaleElement(Driver.get().findElement(By.xpath(moduleLocator)));
//            BrowserUtils.clickWithTimeOut(Driver.get().findElement(By.xpath(moduleLocator)), 5);
//        }
//    }
//
//}
//





