package guru.qa.tests;

import com.codeborne.selenide.logevents.SelenideLogger;
import guru.qa.utils.WebSteps;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class RegistrationPageTests extends RemoteTestBase {

    @Test
    @Tag("remote")
    @DisplayName("Checking the completion of the registration form (remote_test)")
    void successRegistrationFullTest() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        WebSteps steps = new WebSteps();

        steps.openMainPage();
        steps.deleteBanners();
        steps.fillForm();
        steps.checkResult();
    }

    @Test
    @DisplayName("Checking the completion of the registration form (test)")
    void successRegistrationTest() {
        SelenideLogger.addListener("allure", new AllureSelenide());
        WebSteps steps = new WebSteps();

        steps.openMainPage();
        steps.deleteBanners();
        steps.fillForm();
        steps.checkResult();
    }
}
