package tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import org.testng.annotations.Test;
import pages.AdminPage;
import pages.LoginPage;

import static com.codeborne.selenide.Selectors.byText;

public class AdminTest extends BasicTest{

    @Test
    public void searchAdmin() {
        app.loginPage.login(app.userCredentials.adminLogin, app.userCredentials.adminPassword);
        //кликнуть на страницу Admin
        app.adminPage.adminTab.click();
        //Ввести данные в поле username
        app.adminPage.usernameField.setValue("admin");
        //нажать на кнопку поиск
        app.adminPage.searchButton.click();
    }

    @Test
    public void searchAndDropDownCheck() {
        app.loginPage.login(app.userCredentials.adminLogin, app.userCredentials.adminPassword);
        app.adminPage.adminTab.click();
        app.adminPage.usernameField.setValue("admin");
        app.adminPage.userRoleButton.click();
        app.adminPage.userRoleDropDown.getWrappedElement().findElement(byText("Admin")).click();
        app.adminPage.userRoleButton.shouldHave(Condition.exactText("Admin"));
        app.adminPage.searchButton.click();
    }

}
