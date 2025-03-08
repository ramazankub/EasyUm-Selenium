package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class AdminPage extends BasePage {
    public SelenideElement adminTab = $(By.xpath("(//span[@class='oxd-text oxd-text--span oxd-main-menu" +
            "-item--name'])[1]"));

    public SelenideElement usernameField = $(By.xpath("(//input[@class='oxd-input oxd-input--active'])" +
            "[2]"));

    public SelenideElement searchButton = $(By.xpath("//button[@type='submit']"));
    public SelenideElement userRoleButton = $(By.xpath("//*[@class='oxd-select-text oxd-select-text-" +
            "-active']"));

    public SelenideElement userRoleDropDown = $(By.xpath("//div[@class='oxd-select-dropdown --positon-" +
            "bottom']"));

    public SelenideElement toThrashButton = $(By.xpath("(//button[@class='oxd-icon-button oxd-table-cell-" +
            "action-space' and @type='button'])[5]"));

    public SelenideElement deleteConfirmation = $(By.xpath("//button[@class='oxd-button oxd-button--medium" +
            " oxd-button--label-danger orangehrm-button-margin']"));

    public SelenideElement userStatusList = $(By.xpath("(//div[@class='oxd-select-text oxd-select-text--" +
            "active'])[2]"));

    public SelenideElement adminTabJobBar = $(By.xpath("(//li[@class='--active oxd-topbar-body-nav-tab " +
            "--parent'])[1]"));

    public SelenideElement adminTabJobListJobTitles = $(By.xpath("(//a[@class='oxd-topbar-" +
            "body-nav-tab-link'])[1]"));
}
