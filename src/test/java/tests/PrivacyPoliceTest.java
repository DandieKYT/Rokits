package tests;

import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class PrivacyPoliceTest extends TestBase {
    @Tag("RokitTest")
    @Tag("PrivacyPoliceTest")
    @Test
    @Owner("Kudryavtsev")
    @Feature("Проверка открытия ")
    @Story("Открытие и проверка страницы IT-рекрутер")
    public void PrivacyPolice() {
        basePage.openPage();
        privacyPolicepage.privacyPolicePage();
        privacyPolicepage.privacyPoliceTitle();
    }
}
