package tests;

import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BasicTest {

    @Test
//    public void loginWithValidCreds() {
//        app.loginPage.usernameField.setValue("Admin");
//        app.loginPage.usernameField.shouldHave(Condition.exactValue("Admin"));//checking
//        app.loginPage.passwordField.setValue("admin123");
//        app.loginPage.passwordField.shouldHave(Condition.exactValue("admin123"));//checking
//        app.loginPage.loginButton.click();
//
//        // TODO проверка что мы действительно залогинились
//    }

    public void loginWitInValidCreds() {
        app.loginPage.usernameField.setValue("Admin");
        app.loginPage.usernameField.shouldHave(Condition.exactValue("Admin"));
        app.loginPage.passwordField.setValue("wrong");
        app.loginPage.passwordField.shouldHave(Condition.exactValue("wrong"));
        app.loginPage.loginButton.click();
        //errorMessage
        app.loginPage.errorMessage.shouldBe(Condition.visible);
        app.loginPage.errorMessage.shouldHave(Condition.exactText("Invalid credentials"));
        app.loginPage.usernameField.shouldBe(Condition.empty);
        app.loginPage.passwordField.shouldBe(Condition.empty);

        // TODO проверка что мы действительно залогинились
    }

    public void loginWithValidUsername() {
        app.loginPage.usernameField.setValue("wrong");
        app.loginPage.passwordField.setValue("admin123");
        app.loginPage.loginButton.click();

        // TODO проверка что мы действительно залогинились
    }

    public void loginWithEmptyCreds() {
        app.loginPage.usernameField.setValue("");
        app.loginPage.passwordField.setValue("");
        app.loginPage.loginButton.click();

        // TODO проверка что мы действительно залогинились
    }

    public void loginWithLongUsername() {
        app.loginPage.usernameField.setValue("ejtwhjhtnhlwrhn'wthgakrejgl;ejgaj;jgal;ejglejgleajgleajgleale");
        app.loginPage.passwordField.setValue("admin123");
        app.loginPage.loginButton.click();

        // TODO проверка что мы действительно залогинились
    }
}
