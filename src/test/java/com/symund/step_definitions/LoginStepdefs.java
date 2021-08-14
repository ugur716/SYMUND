package com.symund.step_definitions;

import com.symund.pages.DashboardPage;
import com.symund.pages.LoginPage;
import com.symund.utilities.BrowserUtils;
import com.symund.utilities.ConfigurationReader;
import com.symund.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;

public class LoginStepdefs {
    @Given("the user on the login page")
    public void theUserOnTheLoginPage() {
        String url= ConfigurationReader.get("url");
        Driver.get().get(url);
    }

    @When("the user enter valid credentials")
    public void theUserEnterValidCredentials() {
        LoginPage loginPage=new LoginPage();
        loginPage.username.sendKeys(ConfigurationReader.get("username"));
    }

    @Then("the user should be login with push enter")
    public void theUserShouldBeLoginWithPushEnter() {
        LoginPage loginPage=new LoginPage();
        loginPage.password.sendKeys(ConfigurationReader.get("password")+ Keys.ENTER);


    }

    @And("user should be land on the dashboard page")
    public void userShouldBeLandOnTheDashboardPage() {
        BrowserUtils.waitFor(2);
        String expect="dashboard";
        String actual=Driver.get().getCurrentUrl();
        Assert.assertTrue(actual.contains(expect));

    }

    @And("username should be seen under profile icon")
    public void usernameShouldBeSeenUnderProfileIcon() {
        DashboardPage dashboardPage=new DashboardPage();
        BrowserUtils.waitFor(3);
        dashboardPage.profilname.click();
        String expect=ConfigurationReader.get("username");
        String actual=dashboardPage.title.getText();
        Assert.assertEquals(expect,actual);


    }


    @When("user enter invalid credentials")
    public void userEnterInvalidCredentials() {
        LoginPage loginPage=new LoginPage();
        String username="EmployeeABC";
        String password="12345";
        loginPage.login(username,password);
    }

    @Then("the user should be login with click login")
    public void theUserShouldBeLoginWithClickLogin() {
        LoginPage loginPage=new LoginPage();
        loginPage.submit.click();
    }

    @And("user should be see error message")
    public void userShouldBeSeeErrorMessage() {
        LoginPage loginPage=new LoginPage();
        String expect="Wrong username or password.";
        String actual=loginPage.error.getText();
        Assert.assertEquals(expect,actual);

    }


    @When("user left blank credentials")
    public void userLeftBlankCredentials() {
        LoginPage loginPage=new LoginPage();
        loginPage.password.sendKeys(ConfigurationReader.get("password"));

    }

    @Then("the user should be click login button")
    public void theUserShouldBeClickLoginButton() {
        LoginPage loginPage=new LoginPage();
        loginPage.submit.click();
    }

    @And("user should be see warning message")
    public void userShouldBeSeeWarningMessage() {
        LoginPage loginPage=new LoginPage();
        String expext="Please fill out this field.";
       String actual= loginPage.username.getAttribute("validationMessage");
       Assert.assertEquals(expext,actual);



    }

    @When("user enter password")
    public void userEnterPassword() {
        LoginPage loginPage=new LoginPage();
        String password=ConfigurationReader.get("password");
        loginPage.password.sendKeys(password);
    }

    @Then("user should see the password with dots format")
    public void userShouldSeeThePasswordWithDotsFormat() {
        LoginPage loginPage=new LoginPage();
        String expect="password";
        String actual=loginPage.password.getAttribute("type");
        Assert.assertEquals(expect,actual);





    }

    @And("user click eye sign")
    public void userClickEyeSign() {
        LoginPage loginPage=new LoginPage();
        loginPage.eyesign.click();
    }

    @Then("user should see the password expilicitly")
    public void userShouldSeeThePasswordExpilicitly() {
        LoginPage loginPage=new LoginPage();
        String expect="text";
        String actual=loginPage.password.getAttribute("type");
        Assert.assertEquals(expect,actual);


    }

    @And("forgot password should be displayed")
    public void forgotPasswordShouldBeDisplayed() {
        LoginPage loginPage=new LoginPage();
        Assert.assertTrue(loginPage.forgotPassword.isDisplayed());
    }

    @When("user click on forgot password link")
    public void userClickOnForgotPasswordLink() {
        LoginPage loginPage=new LoginPage();
        loginPage.forgotPassword.click();
    }

    @Then("Reset password button should be seen")
    public void resetPasswordButtonShouldBeSeen() {
        BrowserUtils.waitFor(3);
        LoginPage loginPage=new LoginPage();
        String expect="Reset password";
        String actual=loginPage.resetPassword.getAttribute("value");
        Assert.assertEquals(expect,actual);


    }


    @Then("Username place holders should be seen")
    public void usernamePlaceHoldersShouldBeSeen() {
        LoginPage loginPage=new LoginPage();
        String expect="Username or email";
        Assert.assertEquals(expect,loginPage.username.getAttribute("placeholder"));
    }

    @And("Password place holders should be seen")
    public void passwordPlaceHoldersShouldBeSeen() {
        LoginPage loginPage=new LoginPage();
        String expect="Password";
        Assert.assertEquals(expect,loginPage.password.getAttribute("placeholder"));

    }


    @Then("{string} place holders should be seen")
    public void placeHoldersShouldBeSeen(String title) {
        LoginPage loginPage=new LoginPage();
        String expect=title;
        String actual="";
        if (title.equals("Username or email")){
            actual=loginPage.username.getAttribute("placeholder");

        }else if(title.equals("Password")){
            actual=loginPage.password.getAttribute("placeholder");
        }
        Assert.assertEquals(expect,actual);
    }
}
