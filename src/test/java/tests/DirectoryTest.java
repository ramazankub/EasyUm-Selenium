package tests;

import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;

import java.time.Duration;

@Test
public class DirectoryTest extends BasicTest {
    public void writeToChief() {
        comeInDirectoryPage();
        app.directoryPage.chiefCard.click();
        app.directoryPage.mailIcon.click();
    }

    public void checkLocationListAvailability() {
        comeInDirectoryPage();
        app.directoryPage.locationList.click();
    }

    private void comeInDirectoryPage() {
        app.loginPage.login(app.userCredentials.adminLogin, app.userCredentials.adminPassword);
        app.directoryPage.directoryTab.click();
        app.directoryPage.checkTab.shouldBe(Condition.exactText("Directory"), Duration.ofSeconds(5));//Кастомные ожидания
    }
}
