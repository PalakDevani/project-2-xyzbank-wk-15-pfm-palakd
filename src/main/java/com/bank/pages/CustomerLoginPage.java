package com.bank.pages;

import com.aventstack.extentreports.Status;
import com.bank.customlisteners.CustomListeners;
import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class CustomerLoginPage extends Utility {


    @CacheLookup
    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement searchCreatedCustomerField;

    @CacheLookup
    @FindBy(xpath = "//option[contains(text(),'Hermoine Granger')]")
    WebElement selectCreatedCustomerFromDropDownList;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Login')]")
    WebElement clickOnLogInButton;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Logout')]")
    WebElement verifyLogOutTabDisplay;

    @CacheLookup
    @FindBy(xpath = "//button[@ng-show='logout']")
    WebElement clickOnLogOutTab;

    @CacheLookup
    @FindBy(xpath = "//label[contains(text(),'Your Name :')]")
    WebElement verifyYourNameTextDisplay;

    public void searchCustomerField() {
        Reporter.log("Search customer field" + searchCreatedCustomerField.toString());
        selectByVisibleTextFromDropDown(searchCreatedCustomerField, "Hermoine Granger");
        CustomListeners.test.log(Status.PASS, "Search customer field");
    }

    public void clickOnLogin() {
        Reporter.log("Click On login Btn" + clickOnLogInButton.toString());
        clickOnElement(clickOnLogInButton);
        CustomListeners.test.log(Status.PASS, "Click On login btn");
    }

    public String verifyLogOutTabDisplay() {

        Reporter.log("Verify log out tab display" + verifyLogOutTabDisplay.toString());
        CustomListeners.test.log(Status.PASS, "Verify log out tab is displayed");
        return getTextFromElement(verifyLogOutTabDisplay);
    }

    public void clickOnLogOut() {
        Reporter.log("Click on logout tab" + clickOnLogOutTab.toString());
        clickOnElement(clickOnLogOutTab);
        CustomListeners.test.log(Status.PASS, "Click On logout tab");
    }

    public String verifyYourNameText() {
        Reporter.log("Verify your name text displayed" + verifyYourNameTextDisplay.toString());
        CustomListeners.test.log(Status.PASS, "Verify your name text displayed");
        return getTextFromElement(verifyYourNameTextDisplay);
    }

}
