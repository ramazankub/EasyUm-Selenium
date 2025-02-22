package tests;

import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;
import pages.MyInfoPage;

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


    private void comeInMyInfo() {
        app.loginPage.login(app.userCredentials.adminLogin, app.userCredentials.adminPassword);
        app.myInfoPage.myInfoTab.click();
        app.myInfoPage.checkTab.should(Condition.exactText("PIM"));
    }
}
