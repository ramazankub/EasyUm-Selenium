package tests;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import io.qameta.allure.Link;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTest extends BasicTest {

    @Test
    public void loginWithValidCreds() {
        app.loginPage.usernameField.setValue("Admin");
        app.loginPage.usernameField.shouldHave(Condition.exactValue("Admin"));//checking
        app.loginPage.passwordField.setValue("admin123");
        app.loginPage.passwordField.shouldHave(Condition.exactValue("admin123"));//checking
        app.loginPage.loginButton.click();

        // TODO проверка что мы действительно залогинились
    }
    @Test
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
    @Test
    public void loginWithValidUsername() {
        app.loginPage.usernameField.setValue("wrong");
        app.loginPage.passwordField.setValue("admin123");
        app.loginPage.loginButton.click();

        // TODO проверка что мы действительно залогинились
    }

    @Test
    public void loginWithEmptyCreds() {
        app.loginPage.usernameField.setValue("");
        app.loginPage.passwordField.setValue("");
        app.loginPage.loginButton.click();

        // TODO проверка что мы действительно залогинились
    }

    @Test
    public void loginWithLongUsername() {
        app.loginPage.usernameField.setValue("ejtwhjhtnhlwrhn'wthgakrejgl;ejgaj;jgal;ejglejgleajgleajgleale");
        app.loginPage.passwordField.setValue("admin123");
        app.loginPage.loginButton.click();

        // TODO проверка что мы действительно залогинились
    }

    @Test
    @Description("ДЗ по Allure и выпадающим спискам")
    @Link("https://joyous-statistic-1d5.notion.site/4-158a780500a08042ae89e9d99b3167ff#:~:text = Автоматизировать " +
            "минимум 5 тест-кейсов по любой странице и минимум два из них с выпадающим списком.")
    public void cutSpacesOnLoginSides() {
        app.loginPage.usernameField.setValue("      Admin       ");
        //app.loginPage.usernameField.shouldHave(Condition.exactValue("Admin"));//checking
        app.loginPage.passwordField.setValue("admin123");
        //app.loginPage.passwordField.shouldHave(Condition.exactValue("admin123"));//checking
        app.loginPage.loginButton.click();
    }

    @Test
    @Description("ДЗ по Allure и выпадающим спискам")
    @Link("https://joyous-statistic-1d5.notion.site/4-158a780500a08042ae89e9d99b3167ff#:~:text = Автоматизировать " +
            "минимум 5 тест-кейсов по любой странице и минимум два из них с выпадающим списком.")
    public void cutTheSpaceInLogin() {
        app.loginPage.usernameField.setValue("Adm in");
        app.loginPage.passwordField.setValue("admin123");
        app.loginPage.loginButton.click();
    }
}
