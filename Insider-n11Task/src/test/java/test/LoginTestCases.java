package test;

import base.BaseTest;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import pages.LoginPage;


public class LoginTestCases extends BaseTest {


    LoginPage loginPage;



    //------------------Scenario where a user logs in with a valid username and a valid password----------------//

    @Test
    @Order(1)
    public void successfulLogin() {

        loginPage = new LoginPage(driver);
        loginPage.ClickMainLoginButton();
        loginPage.EmailBoxTrue();
        loginPage.PasswordBoxTrue();
        loginPage.AccountLoginButton();

    }

    //----------------Scenario: Username correct, password incorrect-----------------------------//


    @Test
    @Order(2)
    public void usernameIncorrectPasswordIncorrect() {
        loginPage = new LoginPage(driver);
        loginPage.ClickMainLoginButton();
        loginPage.EmailBoxFalse();
        loginPage.PasswordBoxFalse();
        loginPage.AccountLoginButton();
        loginPage.IsErrorTextPassword();

    }


    @Test
    @Order(3)
    public void usernameCorrectPasswordIncorrect() {
        loginPage = new LoginPage(driver);
        loginPage.ClickMainLoginButton();
        loginPage.EmailBoxTrue();
        loginPage.PasswordBoxFalse();
        loginPage.AccountLoginButton();
        loginPage.IsErrorTextPassword();

    }
    //-----------------Scenario: Username incorrect, password correct-----------------------------//
    @Test
    @Order(4)
    public void passwordCorrectUsernameIncorrect(){
        loginPage = new LoginPage(driver);
        loginPage.ClickMainLoginButton();
        loginPage.EmailBoxFalse();
        loginPage.PasswordBoxTrue();
        loginPage.AccountLoginButton();
        loginPage.IsErrorTextPassword();

    }


    @Test
    @Order(5)
    public void unconfirmedAccount(){
        loginPage = new LoginPage(driver);
        loginPage.ClickMainLoginButton();
        loginPage.UnconfirmedEmail();
        loginPage.UnconfirmedEmailPasswordTrue();
        loginPage.AccountLoginButton();
        loginPage.FindMyAccount();
        loginPage.LoginControl();

    }


    @Test
    @Order(6)
    public void successfulLoginAndBack() {

        loginPage = new LoginPage(driver);
        loginPage.ClickMainLoginButton();
        loginPage.EmailBoxTrue();
        loginPage.PasswordBoxTrue();
        loginPage.AccountLoginButton();
        loginPage.BackToLoginPage();
    }

    @Test
    @Order(7)
    public void passwordFieldBlank() {

        loginPage = new LoginPage(driver);
        loginPage.ClickMainLoginButton();
        loginPage.EmailBoxTrue();
        loginPage.AccountLoginButton();
        loginPage.IsErrorTextPassword();

    }

    @Test
    @Order(8)
    public void emailWithASpecialCharacter() {

        loginPage = new LoginPage(driver);
        loginPage.ClickMainLoginButton();
        loginPage.EmailWithSpecialCharacter();
        loginPage.PasswordBoxTrue();
        loginPage.AccountLoginButton();
        loginPage.IsErrorTextEmail();

    }

    @Test
    @Order(9)
    public void successfulLogOut() {

        loginPage = new LoginPage(driver);
        loginPage.ClickMainLoginButton();
        loginPage.EmailBoxTrue();
        loginPage.PasswordBoxTrue();
        loginPage.AccountLoginButton();
        loginPage.FindMyAccount();
        loginPage.LogOutAccount();

    }



}
