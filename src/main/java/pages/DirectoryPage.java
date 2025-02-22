package pages;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class DirectoryPage extends BasePage {
    public SelenideElement checkTab = $(By.xpath("//h6"));
    public SelenideElement directoryTab = $(By.xpath("//a[@href='/web/index.php/directory" +
            "/viewDirectory']"));
    public SelenideElement chiefCard = $(By.xpath("(//div[@class='oxd-sheet oxd-sheet--rounded oxd" +
            "-sheet--white orangehrm-directory-card'])[6]"));
    public SelenideElement mailIcon = $(By.xpath("//button[@class='oxd-icon-button oxd-icon-button--" +
            "danger']"));
    public SelenideElement locationList = $(By.xpath("//div[@class='oxd-select-text oxd-select-" +
            "text--active']"));

}
