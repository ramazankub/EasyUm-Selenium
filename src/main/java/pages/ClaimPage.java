package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ClaimPage extends BasePage{
    public SelenideElement claimTab = $(By.xpath("(//li[@class='oxd-main-menu-item-wrapper'])[11]"));
    public SelenideElement fromDateField = $(By.xpath("(//input[@class='oxd-input oxd-input--active'])" +
            "[1]"));

    public SelenideElement claimSearchButton = $(By.xpath("//button[@class='oxd-button oxd-button--medium " +
            "oxd-button--secondary orangehrm-left-space']"));

    public SelenideElement toDateField = $(By.xpath("(//input[@class='oxd-input oxd-input--active'])[3]"));
}
