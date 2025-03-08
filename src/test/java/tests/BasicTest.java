package tests;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import utils.App;

import static com.codeborne.selenide.Selenide.open;

public class BasicTest {

    App app = new App();

    @BeforeTest
    public void setUp() {
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true)
                                                                                .savePageSource(true));
        Configuration.pageLoadTimeout = 700000;
        open("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @AfterTest
    public void tearDown() {
        //todo clear cookies
    }
}
