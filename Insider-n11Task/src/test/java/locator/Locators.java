package locator;

import org.openqa.selenium.By;

public class Locators {



    public static final By MAIN_LOGIN_BUTTON = By.className("btnSignIn");

    public static final By EMAIL_TEXT = By.id("email");

    public static final By PASSWORD_TEXT = By.id("password");

    public static final By ACCOUNT_LOGIN_BUTTON = By.id("loginButton");

    public static final By LOG_OUT = By.className("logoutBtn");

    public static final By FORGOT_PASSWORD = By.className("forgotPassword");

    public static final By MY_ACCOUNT = By.className("myAccount");


    public static final By ERROR_TEXT_PASSWORD_XPATH = By.xpath("/html/body/div[1]/div[2]/div/div[1]/div/div/div[1]/div/form/div[2]/div[2]/div");

    public static final By ERROR_TEXT_EMAIL_XPATH = By.xpath("/html/body/div[1]/div[2]/div/div[1]/div/div/div[1]/div/form/div[1]/div/div");
}
