package tests;

import com.codeborne.selenide.Condition;

public class LeaveTest extends BasicTest {
    public void invalidEmployeeNameSearch() {
        app.loginPage.login(app.userCredentials.adminLogin, app.userCredentials.adminPassword);

        //кликнуть на leave
        app.leavePage.leaveTab.click();
        //ввести имя сотрудника
        app.leavePage.employeeNameField.setValue("wfefwe");
        app.leavePage.employeeNameField.shouldBe(Condition.exactText("wfefwe"));
        //кликнуть на кнопку поиска
        app.leavePage.searchButton.click();
        //проверить на ошибку
        app.leavePage.errorMessage.shouldBe(Condition.exist);
        app.leavePage.errorMessage.shouldBe(Condition.visible);
    }
}
