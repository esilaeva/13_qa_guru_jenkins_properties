package guru.qa.utils;

import guru.qa.pages.RegistrationPage;
import guru.qa.pages.components.TableResultComponent;
import io.qameta.allure.Step;

import static guru.qa.utils.Testdata.*;

public class WebSteps {

    RegistrationPage registrationPage = new RegistrationPage();
    TableResultComponent tableResultComponent = new TableResultComponent();

    @Step("Open page ")
    public void openMainPage() {

        registrationPage.openPage();
    }

    @Step("Delete banners and footer")
    public void deleteBanners() {
        registrationPage.deleteBanners();
    }

    @Step("Fill Student Registration Form")
    public void fillForm() {
        registrationPage.setFirstName(firstName)
                .setLastName(lastName)
                .setEmail(userEmail)
                .setGender(userGender)
                .setMobileNumber(userNumber)
                .setBirthDate(birthDay, birthdayMonth, birthdayYear)
                .setSubject(subject)
                .setHobby(hobby)
                .uploadPicture(fileName)
                .setAddress(streetAddress)
                .setState(state)
                .setCity(city)
                .clickSubmitButton();
    }

    @Step("Check result")
    public void checkResult() {
        tableResultComponent.checkResult(firstName + " " + lastName)
                .checkResult(userEmail)
                .checkResult(userGender)
                .checkResult(userNumber)
                .checkResult(birthDay + " " + birthdayMonth + "," + birthdayYear)
                .checkResult(subject)
                .checkResult(hobby)
                .checkResult(fileName)
                .checkResult(streetAddress);
    }
}
