package com.bank.pages;

import com.aventstack.extentreports.Status;
import com.bank.customlisteners.CustomListeners;
import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class AccountPage extends Utility {

    @CacheLookup
    @FindBy(xpath = "//div[@ng-hide='noAccount']//button[2]")
    WebElement clickOnDepositeTopTab;

    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='amount']")
    WebElement enterAmountField;
    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement clickOnDepositeAfterAmountField;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Deposit Successful')]")
    WebElement verifyMessage;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Deposit Successful')]")
    WebElement verifyDepositeSuccessfulMessage;

    @CacheLookup
    @FindBy(xpath = "//body/div[3]/div[1]/div[2]/div[1]/div[3]/button[3]")
    WebElement clickOnWithdrawTopTab;

    @CacheLookup
    @FindBy(tagName = "input")
    WebElement amountWithdraw;
    @CacheLookup
    @FindBy(linkText = "Withdraw")
    WebElement clickOnWithdrawBtn;

    @CacheLookup
    //@FindBy(xpath = "//span[contains(text(),'Transaction successful')]")
    @FindBy(xpath = "//div[@class = 'ng-scope']/span[1]")
    WebElement verifyMessageTransactionSuccessful;

    public void clickOnDepositeTab() {
        Reporter.log("Click On Deposite Tab" + clickOnDepositeTopTab.toString());
        clickOnElement(clickOnDepositeTopTab);
        CustomListeners.test.log(Status.PASS, "Click On Deposite Tab");
    }

    public void enter100InAmountField() {
        Reporter.log("Enter 100 In Amount Field" + enterAmountField.toString());
        sendTextToElement(enterAmountField, "100");
        CustomListeners.test.log(Status.PASS, "Enter 100 In Amount Field");
    }

    public void clickOnDepositeButton() {
        Reporter.log("Click on deposite button" + clickOnDepositeAfterAmountField.toString());
        clickOnElement(clickOnDepositeAfterAmountField);
        CustomListeners.test.log(Status.PASS, "Click on deposite button");
    }

    public String verifyDepositeSuccessfulText() {
        Reporter.log("Verify deposite successful text" + verifyDepositeSuccessfulMessage.toString());
        CustomListeners.test.log(Status.PASS, "Verify deposite successful text");
        return getTextFromElement(verifyDepositeSuccessfulMessage);

    }

    public void ClickOnWithdrawTab() {
        Reporter.log("click on withdraw tab" + clickOnWithdrawTopTab.toString());
        clickOnElement(clickOnWithdrawTopTab);
        CustomListeners.test.log(Status.PASS, "click on withdraw tab");
    }

    public void enterAmountInWithdrawField() {
        Reporter.log("Enter amount in withdraw field" + amountWithdraw.toString());
        sendTextToElement(amountWithdraw, "50");
        CustomListeners.test.log(Status.PASS, "Enter amount in withdraw field");
    }


    public void clickOnWithdrawButton() {
        Reporter.log("Click on withdraw button" + clickOnWithdrawBtn.toString());
        clickOnElement(clickOnWithdrawBtn);
        CustomListeners.test.log(Status.PASS, "Click on withdraw button");
    }


    public String verifyMsgTransactionSuccessful() {
        Reporter.log("verify Msg Transaction Successful" + verifyMessageTransactionSuccessful.toString());
        CustomListeners.test.log(Status.PASS, "verify Msg Transaction Successful");
        return getTextFromElement(verifyMessageTransactionSuccessful);
    }


}
