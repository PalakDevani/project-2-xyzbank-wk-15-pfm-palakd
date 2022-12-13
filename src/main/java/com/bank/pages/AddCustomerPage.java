package com.bank.pages;

import com.aventstack.extentreports.Status;
import com.bank.customlisteners.CustomListeners;
import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class AddCustomerPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//input [@placeholder=\"First Name\"]")
    WebElement enterFirstName;

    @CacheLookup
    @FindBy(xpath = "//input [@placeholder=\"Last Name\"]")
    WebElement enterLastName;
    @CacheLookup
    @FindBy(xpath = "//input [@placeholder=\"Post Code\"]")
    WebElement enterPostCode;

    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement clickOnAddCustomerButton;


    public void enterFirstName(String firstName) {
        Reporter.log("Enter First Name" + enterFirstName.toString());
        sendTextToElement(enterFirstName, firstName);
        CustomListeners.test.log(Status.PASS,"Enter First Name");
    }

    public void enterLastName(String lastName) {
        Reporter.log("Enter Last Name" + enterLastName.toString());
        sendTextToElement(enterLastName, lastName);
        CustomListeners.test.log(Status.PASS, "Enter Last Name");
    }

    public void enterPostcode(String postcode) {
        Reporter.log("Enter Postcode" + enterPostCode.toString());
        sendTextToElement(enterPostCode, postcode);
        CustomListeners.test.log(Status.PASS,"Enter Postcode");
    }

    public void clickOnAddCustomerButton() {
        Reporter.log("Click on add customer button" + clickOnAddCustomerButton.toString());
        clickOnElement(clickOnAddCustomerButton);
        CustomListeners.test.log(Status.PASS,"Click on add customer button");
    }

    // verify the message in popup Alert
    public String verifyMessageInPopupWindow() {
        return getTextFromAlert();

    }

    //	popup display
    public void popupDisplay() {
        switchToAlert();
    }

    public void clickOnOkButtInPopup() {

        acceptAlert();
    }


}

