package tests;

import io.qameta.allure.Description;
import io.qameta.allure.Link;
import org.testng.annotations.Test;

public class ClaimTest extends BasicTest{
    @Test
    @Description("ТК по тестированию календаря")
    @Link("https://joyous-statistic-1d5.notion.site/4-158a780500a08042ae89e9d99b3167ff#:~:text = Автоматизировать хотя " +
            "бы два тест-кейса где будет использован календарь с выбором даты https://opensource-demo.orangehrmlive.com" +
            "/web/index.php/claim/viewAssignClaim")
    public void setFutureDateInFromDateField() {
        app.loginPage.login(app.userCredentials.adminLogin, app.userCredentials.adminPassword);
        app.claimPage.claimTab.click();
        app.claimPage.fromDateField.click();
        app.claimPage.fromDateField.clear();
        app.claimPage.fromDateField.setValue("1900-04-04");
        app.claimPage.claimSearchButton.click();
    }

    @Test
    @Description("ТК по тестированию календаря")
    @Link("https://joyous-statistic-1d5.notion.site/4-158a780500a08042ae89e9d99b3167ff#:~:text = Автоматизировать хотя " +
            "бы два тест-кейса где будет использован календарь с выбором даты https://opensource-demo.orangehrmlive.com" +
            "/web/index.php/claim/viewAssignClaim")
    public void setZerosInToDateField() {
        app.loginPage.login(app.userCredentials.adminLogin, app.userCredentials.adminPassword);
        app.claimPage.claimTab.click();
        app.claimPage.toDateField.clear();
        app.claimPage.toDateField.setValue("0000-00-00");
        app.claimPage.claimSearchButton.click();
    }
}
