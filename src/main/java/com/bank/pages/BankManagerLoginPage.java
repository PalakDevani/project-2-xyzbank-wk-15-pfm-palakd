package com.bank.pages;

import com.aventstack.extentreports.Status;
import com.bank.customlisteners.CustomListeners;
import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class BankManagerLoginPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//button[@ng-class ='btnClass1']")
    WebElement clickAddCustomerTab;
    @CacheLookup
    @FindBy(xpath = "//button[@ng-class ='btnClass2']")
    WebElement clickOpenAccountTab;

    public void clickOnAddCustomerTab() {
        Reporter.log("Click on add customer tab" + clickAddCustomerTab.toString());
        clickOnElement(clickAddCustomerTab);
        CustomListeners.test.log(Status.PASS, "click on add customer tab");

    }

    public void clickOnOpenAccount() {
        Reporter.log("Click on open account tab" + clickOpenAccountTab.toString());
        clickOnElement(clickOpenAccountTab);
        CustomListeners.test.log(Status.PASS, "Click on open account tab");
    }

}
