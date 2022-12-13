package com.bank.pages;

import com.bank.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility {

    @CacheLookup
    @FindBy(linkText = "Home")
    WebElement clickOnHome;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Customer Login')]")
    WebElement clickOnCustomerLoginTab;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Bank Manager Login')]")
    WebElement clickOnBankManagerLoginTab;


    public void clickOnHomeTab() {
        clickOnElement(clickOnHome);
    }

    public void clickOnCustomerLoginTab() {

        clickOnElement(clickOnCustomerLoginTab);
    }

    public void clickOnBankManagerLoginTab() {

        clickOnElement(clickOnBankManagerLoginTab);
    }
}
