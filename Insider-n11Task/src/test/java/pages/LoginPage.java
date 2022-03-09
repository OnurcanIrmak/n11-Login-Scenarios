package pages;

import base.BaseTest;
import logger.TestResultLogger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static locator.Locators.*;
import static org.junit.jupiter.api.Assertions.assertTrue;
public class LoginPage extends BasePage{


    public LoginPage(WebDriver driver) {
        super(driver);

    }


    public void ClickMainLoginButton(){
        click(MAIN_LOGIN_BUTTON);
    }

    public void EmailBoxTrue(){
        click(EMAIL_TEXT);
        sendKeys(EMAIL_TEXT, "irmakonurcan@gmail.com");
    }

    public void EmailBoxFalse(){
        click(EMAIL_TEXT);
        sendKeys(EMAIL_TEXT, "irmakonurcan123@gmail.com");
    }

    public void EmailWithSpecialCharacter(){
        click(EMAIL_TEXT);
        sendKeys(EMAIL_TEXT, "!!irmakonurcan@gmail.com");
    }



    public void PasswordBoxTrue(){
        click(PASSWORD_TEXT);
        sendKeys(PASSWORD_TEXT, "O19051995");
    }

    public void PasswordBoxFalse(){
        click(PASSWORD_TEXT);
        sendKeys(PASSWORD_TEXT, "Onur1905");
    }

    public void UnconfirmedEmail(){
        click(EMAIL_TEXT);
        sendKeys(EMAIL_TEXT, "lordmyonur@gmail.com");
    }


    public void UnconfirmedEmailPasswordTrue(){
        click(PASSWORD_TEXT);
        sendKeys(PASSWORD_TEXT, "Onur1034");
    }

    public void LogOutAccount(){
        click(LOG_OUT);
    }

    public void FindMyAccount(){
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        hoverElement(MY_ACCOUNT);
    }

    public void LoginControl(){
        WebElement webElement = findElement(LOG_OUT);
        if (webElement != null) {
            System.out.println("Login Oldu");
            TestResultLogger.log.error("Login Oldu");
            assertTrue(true);
        } else {
            assertTrue(false);
        }

    }

    public void AccountLoginButton(){
        try {
            Thread.sleep(5000);
            clickLogin(ACCOUNT_LOGIN_BUTTON);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void BackToLoginPage(){
        try {
            Thread.sleep(5000);
            driver.navigate().back();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (BaseTest.getWebDriver().getCurrentUrl().contains("giris-yap")) {
            System.out.println("Back Oldu");
            TestResultLogger.log.info("Back Oldu");
            assertTrue(true);
        }
        else {
            assertTrue(false);
        }
    }

    public void IsErrorTextPassword(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement webElement = findElement(ERROR_TEXT_PASSWORD_XPATH);
        if (webElement.getText() != null) {
            if (webElement.getText().length() > 0) {
                System.out.println(webElement.getText());
                TestResultLogger.log.error(webElement.getText());
                assertTrue(false);
            } else {
                assertTrue(true);
            }
        }
    }

    public void IsErrorTextEmail(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        WebElement webElement = findElement(ERROR_TEXT_EMAIL_XPATH);
        if (webElement.getText() != null) {
            if (webElement.getText().length() > 0) {
                System.out.println(webElement.getText());
                TestResultLogger.log.error(webElement.getText());
                assertTrue(false);
            } else {
                assertTrue(true);
            }
        }
    }

}


