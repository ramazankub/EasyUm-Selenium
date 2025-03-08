package tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selectors;
import io.qameta.allure.*;
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

    @Test
    @Severity(SeverityLevel.MINOR)
    @Description("ДЗ по Allure и выпадающим спискам")
    @Link("https://joyous-statistic-1d5.notion.site/4-158a780500a08042ae89e9d99b3167ff#:~:text = Автоматизировать " +
            "минимум 5 тест-кейсов по любой странице и минимум два из них с выпадающим списком.")
    public void deleteUserFromRecords() {
        app.loginPage.login(app.userCredentials.adminLogin, app.userCredentials.adminPassword);
        app.adminPage.adminTab.click();
        app.adminPage.toThrashButton.click();
        app.adminPage.deleteConfirmation.shouldHave(Condition.exactText(" Yes, Delete "));
        app.adminPage.deleteConfirmation.click();
    }

    @Test
    @Description("ДЗ по Allure и выпадающим спискам")
    @Link("https://joyous-statistic-1d5.notion.site/4-158a780500a08042ae89e9d99b3167ff#:~:text = Автоматизировать " +
            "минимум 5 тест-кейсов по любой странице и минимум два из них с выпадающим списком.")
    public void checkUserStatusList () {
        app.loginPage.login(app.userCredentials.adminLogin, app.userCredentials.adminPassword);
        app.adminPage.adminTab.click();
        app.adminPage.userStatusList.click();
        app.adminPage.userRoleDropDown.getWrappedElement().findElement(byText("Enabled")).click();
        app.adminPage.searchButton.click();
    }

    @Test
    @Description("ДЗ по Allure и выпадающим спискам")
    @Link("https://joyous-statistic-1d5.notion.site/4-158a780500a08042ae89e9d99b3167ff#:~:text = Автоматизировать " +
            "минимум 5 тест-кейсов по любой странице и минимум два из них с выпадающим списком.")
    public void checkAdminTabJobList() {
        app.loginPage.login(app.userCredentials.adminLogin, app.userCredentials.adminPassword);
        app.adminPage.adminTab.click();
        app.adminPage.adminTabJobBar.click();
        app.adminPage.adminTabJobListJobTitles.click();
    }

    @Test
    @Description("Дополнительное задание на фильтрацию")
    @Link("https://joyous-statistic-1d5.notion.site/4-158a780500a08042ae89e9d99b3167ff#:~:text = Автоматизировать " +
            "тест-кейс для проверки фильтрации https://opensource-demo.orangehrmlive.com/web/index.php/admin/view" +
            "SystemUsers")
    public void findActiveAdmins() {
        app.loginPage.login(app.userCredentials.adminLogin, app.userCredentials.adminPassword);
        app.adminPage.adminTab.click();
        app.adminPage.userRoleButton.click();
        app.adminPage.userRoleDropDown.getWrappedElement().findElement(byText("Admin")).click();
        app.adminPage.userRoleButton.shouldHave(Condition.exactText("Admin"));
        app.adminPage.userStatusList.click();
        app.adminPage.userRoleDropDown.getWrappedElement().findElement(byText("Enabled")).click();
        app.adminPage.searchButton.click();
    }
}
