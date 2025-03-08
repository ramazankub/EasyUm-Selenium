package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class MyInfoPage extends BasePage{
    public SelenideElement myInfoTab = $(By.xpath("(//span[@class='oxd-text oxd-text--span oxd-main-" +
            "menu-item--name'])[6]"));
    public SelenideElement checkTab = $(By.xpath("//h6[@class='oxd-text oxd-text--h6 oxd-topbar-header-" +
            "breadcrumb-module']"));
    public SelenideElement firstName = $(By.xpath("//input[@name='firstName']"));
    public SelenideElement middleName = $(By.xpath("//input[@name='middleName']"));
    public SelenideElement lastName = $(By.xpath("//input[@name='lastName']"));
    public SelenideElement saveBtn = $(By.xpath("(//button[@type='submit'])[1]"));
    public SelenideElement memberShips = $(By.xpath("//a[@href='/web/index.php/pim/viewMemberships" +
            "/empNumber/7']"));
    public SelenideElement myContactsDetails = $(By.xpath("//a[@href='/web/index.php/pim/contactDetails" +
            "/empNumber/7']"));
    public SelenideElement provinceInfo = $(By.xpath("(//input[@class='oxd-input oxd-input--" +
            "active'])[4]"));
    public SelenideElement otherSaveBtn = $(By.xpath("//button[@type='submit']"));
    public SelenideElement downloadFileButton = $(By.xpath("(//button[@class='oxd-icon-button oxd-table-" +
            "cell-action-space'][3])"));

    public SelenideElement questionMark = $(By.xpath("//button[@title='Help']"));
    public SelenideElement newTabHeader = $(By.xpath("//h1"));
}
