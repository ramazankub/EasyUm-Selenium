package tests;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import utils.App;

import static com.codeborne.selenide.Selenide.open;

public class BasicTest {

    App app = new App();

    @BeforeTest
    public void setUp() {
        open("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
    }

    @AfterTest
    public void tearDown() {
        //todo clear cookies
    }
}
