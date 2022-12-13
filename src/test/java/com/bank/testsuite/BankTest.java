package com.bank.testsuite;

import com.bank.customlisteners.CustomListeners;
import com.bank.pages.*;
import com.bank.testbase.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListeners.class)


public class BankTest extends BaseTest {

    HomePage homePage;
    BankManagerLoginPage bankManagerLoginPage;
    AddCustomerPage addCustomerPage;
    CustomerLoginPage customerLoginPage;
    OpenAccountPage openAccountPage;
    CustomersPage customersPage;
    AccountPage accountPage;

    @BeforeMethod(alwaysRun = true)

    public void inIt() {
        homePage = new HomePage();
        bankManagerLoginPage = new BankManagerLoginPage();
        addCustomerPage = new AddCustomerPage();
        customerLoginPage = new CustomerLoginPage();
        openAccountPage = new OpenAccountPage();
        customersPage = new CustomersPage();
        accountPage = new AccountPage();

    }

    @Test(groups = {"sanity", "regression"})

    public void bankManagerShouldAddCustomerSuccessfully() throws InterruptedException {
        homePage.clickOnBankManagerLoginTab();
        Thread.sleep(5000);
        bankManagerLoginPage.clickOnAddCustomerTab();
        addCustomerPage.enterFirstName("Pal");
        addCustomerPage.enterLastName("Granger");
        addCustomerPage.enterPostcode("AB1 2CD");
        addCustomerPage.clickOnAddCustomerButton();
        addCustomerPage.popupDisplay();
        addCustomerPage.verifyMessageInPopupWindow();
        addCustomerPage.acceptAlert();
    }

    @Test(groups = {"smoke", "regression"})
    public void bankManagerShouldOpenAccountSuccessfully() {
        homePage.clickOnBankManagerLoginTab();
        bankManagerLoginPage.clickOnAddCustomerTab();

        addCustomerPage.enterFirstName("Pal");
        addCustomerPage.enterLastName("Granger");
        addCustomerPage.enterPostcode("AB1 2CD");
        addCustomerPage.clickOnAddCustomerButton();
        addCustomerPage.popupDisplay();
        addCustomerPage.verifyMessageInPopupWindow();
        addCustomerPage.clickOnOkButtInPopup();
    }

    @Test(groups = "regression")
    public void customerShouldLoginAndLogOutSuccessfully() {

        homePage.clickOnCustomerLoginTab();
        customerLoginPage.searchCustomerField();
        customerLoginPage.clickOnLogin();
        customerLoginPage.verifyLogOutTabDisplay();
        customerLoginPage.clickOnLogOut();
        customerLoginPage.verifyYourNameText();
    }

    @Test(groups = "regression")
    public void customerShouldDepositMoneySuccessfully() {
        homePage.clickOnCustomerLoginTab();
        customerLoginPage.searchCustomerField();
        customerLoginPage.clickOnLogin();
        accountPage.clickOnDepositeTab();
        accountPage.enter100InAmountField();
        accountPage.clickOnDepositeButton();
        accountPage.verifyDepositeSuccessfulText();
    }

    @Test(groups = "regression")

    public void customerShouldWithdrawMoneySuccessfully() {
        homePage.clickOnCustomerLoginTab();
        customerLoginPage.searchCustomerField();
        customerLoginPage.clickOnLogin();
        accountPage.ClickOnWithdrawTab();
        accountPage.enterAmountInWithdrawField();
        accountPage.verifyMsgTransactionSuccessful();


    }

}


