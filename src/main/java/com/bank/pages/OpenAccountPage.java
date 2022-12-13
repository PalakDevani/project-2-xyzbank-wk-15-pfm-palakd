package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class OpenAccountPage extends Utility {
    @CacheLookup
    @FindBy(id = "userSelect")
    WebElement selectCustomerCreated;

    @CacheLookup
    @FindBy(id = "currency")
    WebElement selectCurrency;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Process')]")
    WebElement clickOnProcessBtn;

    public void selectCustomerCreatedFromDropDownList() {
        selectByVisibleTextFromDropDown(selectCustomerCreated, "Hermoine Granger");
    }

    public void selectCurrencyFromDropDownList() {
        selectByVisibleTextFromDropDown(selectCurrency, "Pound");
    }

    public void clickOnProcessButton() {
        clickOnElement(clickOnProcessBtn);
    }

}
