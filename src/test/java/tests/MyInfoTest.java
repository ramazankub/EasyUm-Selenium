package tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import io.qameta.allure.Description;
import io.qameta.allure.Link;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.MyInfoPage;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.switchTo;

public class MyInfoTest extends BasicTest {

    @Test
    public void changeName() {
        comeInMyInfo();
        app.myInfoPage.firstName.clear();
        app.myInfoPage.firstName.setValue("Vasco");
        app.myInfoPage.middleName.clear();
        app.myInfoPage.middleName.setValue("Da");
        app.myInfoPage.lastName.clear();
        app.myInfoPage.lastName.setValue("Gama");
        app.myInfoPage.saveBtn.should(Condition.exactText(" Save "));
        app.myInfoPage.saveBtn.click();
    }

    @Test
    public void checkMemberShipsPage() {
        comeInMyInfo();
        app.myInfoPage.memberShips.click();
    }

    @Test
    public void fillContactDetails() {
        comeInMyInfo();
        app.myInfoPage.myContactsDetails.click();
        app.myInfoPage.provinceInfo.setValue("California");
        app.myInfoPage.otherSaveBtn.click();
    }

    @Test
    @Description("Задание повышенной сложности")
    @Link("https://joyous-statistic-1d5.notion.site/4-158a780500a08042ae89e9d99b3167ff#:~:text = Автоматизировать " +
            "загрузку файла, нажать на кнопку загрузки файла и проверить, что загрузка выполнена (что файл скачен)")
    public void uploadFile() {
        app.loginPage.login(app.userCredentials.adminLogin, app.userCredentials.adminPassword);
        app.myInfoPage.myInfoTab.click();
        app.myInfoPage.downloadFileButton.click();
        app.myInfoPage.downloadFileButton.shouldBe(visible);
        File downloadedFile = app.myInfoPage.downloadFileButton.download();
        assert downloadedFile.exists();
    }

    @Test
    @Description("Задание повышенной сложности")
    @Link("https://joyous-statistic-1d5.notion.site/4-158a780500a08042ae89e9d99b3167ff#:~:text = Автоматизировать " +
            "сценарий: нажать на кнопку “Знак вопроса” в правом верхнем углу и проверить, что новая вкладка браузера " +
            "открыта")
    public void clickQuestionMark() {
        app.loginPage.login(app.userCredentials.adminLogin, app.userCredentials.adminPassword);
        app.myInfoPage.myInfoTab.click();
        app.myInfoPage.questionMark.click();
        app.myInfoPage.questionMark.shouldBe(visible);
        switchTo().window(1);
        String newUrl = WebDriverRunner.url();
        assert newUrl.equals("https://starterhelp.orangehrm.com/hc/en-us");
        app.myInfoPage.newTabHeader.shouldHave(text("OrangeHRM"));
        Selenide.closeWindow();
        switchTo().window(0);

    }

    private void comeInMyInfo() {
        app.loginPage.login(app.userCredentials.adminLogin, app.userCredentials.adminPassword);
        app.myInfoPage.myInfoTab.click();
        app.myInfoPage.checkTab.should(Condition.exactText("PIM"));
    }
}
